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
public class MarcaDAO {
    private static final String SQL_READ_ALL = "SELECT * FROM marca";
    private static final String SQL_ID = "SELECT id_marca FROM marca WHERE nombre_marca = ?";
    private static final String SQL_READ = "SELECT * FROM marca WHERE id_marca = ?";
    private static final String SQL_UPDATE = "UPDATE marca SET nombre_marca = ? WHERE id_marca = ?";
    private static final String SQL_DELETE = "DELETE FROM marca WHERE id_marca = ?";
    private static final String SQL_CREATE = "INSERT INTO marca (nombre_marca)VALUES(?)";

    public MarcaDAO() {
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
                numeroID = rs.getInt("id_marca");
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
        return false;
    }

    public boolean delete(Object item){
        return false;
    }

    public boolean update(){
        return false;
    }

    public String read(int id) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        String nombre_marca = null;
        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                nombre_marca = rs.getString("nombre_marca");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return nombre_marca;
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
                String aux = rs.getString("nombre_marca");
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
