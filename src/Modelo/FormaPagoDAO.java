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
public class FormaPagoDAO {
    private static final String SQL_READ_ALL = "SELECT * FROM forma_pago";
    private static final String SQL_ID = "SELECT id_forma_pago FROM categoria WHERE nombre_categoria = ?";
    private static final String SQL_READ = "SELECT * FROM forma_pago WHERE id_forma_pago = ?";
    private static final String SQL_UPDATE = "UPDATE forma_pago SET nombre_forma_pago = ? WHERE id_forma_pago = ?";
    private static final String SQL_DELETE = "DELETE FROM forma_pago WHERE id_forma_pago = ?";
    private static final String SQL_CREATE = "INSERT INTO forma_pago (nombre_forma_pago)VALUES(?)";
    

    public FormaPagoDAO() {
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
                numeroID = rs.getInt("id_forma_pago");
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
                nombre_categoria = rs.getString("nombre_forma_pago");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return nombre_categoria;
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
                String aux = rs.getString("nombre_forma_pago");
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
