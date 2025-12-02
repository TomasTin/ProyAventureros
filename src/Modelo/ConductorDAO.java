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
public class ConductorDAO {
    private static final String SQL_REAL_ALL = "SELECT * FROM conductor";
    private static final String SQL_ID = "SELECT id_conductor FROM conductor WHERE nombre_conductor = ?";
    private static final String SQL_READ = "SELECT * FROM conductor WHERE id_conductor = ?";
    private static final String SQL_UPDATE = "UPDATE conductor SET nombre = ?, direccion = ?, id_genero = ?, id_nacionalidad = ?, fotografia = ?, usuario = ?, contrasena = ? WHERE id_conductor = ?";
    private static final String SQL_DELETE = "DELETE FROM conductor WHERE id_conductor = ?";
    private static final String SQL_CREATE = "INSERT INTO conductor (nombre,direccion,id_genero,id_nacionalidad,fotografia,usuario,constrasena)VALUES(?,?,?,?,?,?,?)";

    public ConductorDAO() {
    }

    public boolean create(Conductor nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            int genID = new GeneroDAO().buscarID(nuevo.getGenero());
            int nacID = new NacionalidadDAO().buscarID(nuevo.getNacionalidad());
            
            if(genID == -1 || nacID == -1){
                JOptionPane.showMessageDialog(null, "No se encontró registro");
            }else{
                ps.setString(1, nuevo.getNombre());
                ps.setString(2, nuevo.getDireccion());
                ps.setInt(3, genID);
                ps.setInt(4, nacID);
                ps.setBytes(5, GestorImagenes.bufferedImageToBytes(nuevo.getFotografia()));
                ps.setString(6, nuevo.getCnt().getUsuario());
                ps.setString(7, nuevo.getCnt().getPassword());
                
                
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
            
            ps.setInt(1, ((Cliente)item).getId());
            
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

    public boolean update(Conductor filter){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_UPDATE);
            
            int genID = new GeneroDAO().buscarID(filter.getGenero());
            int nacID = new NacionalidadDAO().buscarID(filter.getNacionalidad());
            
            if(genID == -1 || nacID == -1){
                JOptionPane.showMessageDialog(null, "No se encontró registro");
            }else{
                ps.setString(1, filter.getNombre());
                ps.setString(2, filter.getDireccion());
                ps.setInt(3, genID);
                ps.setInt(4, nacID);
                ps.setBytes(5, GestorImagenes.bufferedImageToBytes(filter.getFotografia()));
                ps.setString(6, filter.getCnt().getUsuario());
                ps.setString(7, filter.getCnt().getPassword());
                ps.setInt(8, filter.getId());

                if(ps.execute()){
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

    public Conductor read(int id) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        Conductor dto = null;

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                dto = new Conductor(
                    new VehiculoDAO().read_cond(id),
                    GestorImagenes.bytesToBufferedImage(rs.getBytes("fotografia")),
                    new Cuenta(rs.getString("usuario"),rs.getString("contrasena")),
                    rs.getInt("id_conductor"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("genero"),
                    rs.getString("nacionalidad"),
                    new TelefonoConductorDAO().read(rs.getInt("id_conductor"))
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

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_REAL_ALL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Cliente dto = new Cliente(
                        new Cuenta(rs.getString("usuario"),rs.getString("contrasena")),
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("genero"),
                        rs.getString("nacionalidad"),
                        new TelefonoConductorDAO().read(rs.getInt("id_cliente"))
                );
                lista.add(dto);
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return lista;
    }
}
