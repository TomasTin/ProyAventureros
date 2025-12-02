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

/**
 *
 * @author Tomas Lancheros
 */
public class CategoriaDAO {
    private static final String SQL_READ_ALL = "SELECT * FROM categoria";
    private static final String SQL_ID = "SELECT id_categoria FROM categoria WHERE nombre_categoria = ?";
    private static final String SQL_READ = "SELECT * FROM categoria WHERE id_categoria = ?";
    private static final String SQL_UPDATE = "UPDATE categoria SET nombre_categoria = ? WHERE id_categoria = ?";
    private static final String SQL_DELETE = "DELETE FROM categoria WHERE id_categoria = ?";
    private static final String SQL_CREATE = "INSERT INTO categoria (nombre_categoria)VALUES(?)";
    

    public CategoriaDAO() {
    }
    
    public int buscarID(String filter) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        int numeroID = -1;
        try {
            ps = cx.getCnn().prepareStatement(SQL_ID);
            ps.setString(1, filter);
            rs = ps.executeQuery();
            
            if(rs.next()){
                numeroID = rs.getInt("id_categoria");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return numeroID;
    }
    
    public boolean create(String nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            ps.setString(1, nuevo);
                
            if(ps.executeUpdate()>0){
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

    public boolean delete(Object item){
        return true;
    }

    public boolean update(int filter){
        return false;
    }

    public String read(int id) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        String nombre_categoria = null;
        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                nombre_categoria = rs.getString("nombre_categoria");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return nombre_categoria;
    }
    
    public double read_tarif(int id) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        double tarifa_adicional = -1;
        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                tarifa_adicional = rs.getDouble("tarifa_adicional");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return tarifa_adicional;
    }

    public ArrayList<String> read_all() {
        ArrayList<String> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ_ALL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String aux = rs.getString("nombre_categoria");
                lista.add(aux);
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
