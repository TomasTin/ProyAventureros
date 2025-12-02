/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import conexiones.ConexionPostgreSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Lancheros
 */
public class VehiculoDAO {
    private static final String SQL_REAL_ALL = "SELECT * FROM vehiculo";
    private static final String SQL_READ = "SELECT * FROM vehiculo WHERE placa = ?";
    private static final String SQL_READ_COND = "SELECT * FROM vehiculo WHERE id_conductor = ?";
    private static final String SQL_UPDATE = "UPDATE vehiculo SET modelo = ?,id_marca = ? WHERE placa = ?";
    private static final String SQL_DELETE = "DELETE FROM vehiculo WHERE placa = ?";
    private static final String SQL_CREATE = "INSERT INTO vehiculo (placa,id_conductor,modelo,id_marca,id_tipo_servicio)VALUES(?,?,?,?,?)";

    public VehiculoDAO() {
    }

    public boolean create(Vehiculo nuevo, int id_conductor) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            int marID = new MarcaDAO().buscarID(nuevo.getMarca());
            int tipoS_ID = new TipoServicioDAO().buscarID(nuevo.getTipo_servicio());
            
            if(marID == -1 || tipoS_ID == -1){
                JOptionPane.showMessageDialog(null, "No se encontró placa o tipo servicio");
            }else{
                ps.setString(1, nuevo.getPlaca());
                ps.setInt(2, id_conductor);
                ps.setInt(3, nuevo.getModelo());
                ps.setInt(4, marID);
                ps.setInt(5, tipoS_ID);
                
                if(ps.executeUpdate()>0){
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }
        
        return false;
    }

    public boolean delete(Object item){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_DELETE);
            
            ps.setString(1, ((Vehiculo)item).getPlaca());
            
            if(ps.executeUpdate() > 0){
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }
        
        return false;
    }

    public boolean update(Vehiculo filter){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_UPDATE);
            
            int marID = new MarcaDAO().buscarID(filter.getMarca());
            int tipoS_ID = new TipoServicioDAO().buscarID(filter.getTipo_servicio());
            
            if(marID == -1 || tipoS_ID == -1){
                JOptionPane.showMessageDialog(null, "No se encontró placa o tipo servicio");
            }else{
                ps.setInt(1, filter.getModelo());
                ps.setInt(2, marID);
                ps.setString(3, filter.getPlaca());
                
                if(ps.executeUpdate()>0){
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }
        
        return false;
    }

    public Vehiculo read(String placa) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        Vehiculo dto = null;

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, placa);
            rs = ps.executeQuery();
            
            if(rs.next()){
                dto = new Vehiculo(
                    rs.getString("placa"),
                    new MarcaDAO().read(rs.getInt("id_marca")),
                    new TipoServicioDAO().read(rs.getInt("id_tipo_servicio")),
                    rs.getInt("modelo")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return dto;
    }
    
    
    
    public Vehiculo read_cond(int id_cond) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        Vehiculo dto = null;

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ_COND);
            ps.setInt(1, id_cond);
            rs = ps.executeQuery();
            
            if(rs.next()){
                dto = new Vehiculo(
                    rs.getString("placa"),
                    new MarcaDAO().read(rs.getInt("id_marca")),
                    new TipoServicioDAO().read(rs.getInt("id_tipo_servicio")),
                    rs.getInt("modelo")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return dto;
    }

    public ArrayList<Cliente> read_all() {
        ArrayList<Cliente> lista = new ArrayList<>();

        return lista;
    }
}
