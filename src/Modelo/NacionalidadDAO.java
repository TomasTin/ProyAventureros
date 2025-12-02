/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import conexiones.ConexionPostgreSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tomas Lancheros
 */
public class NacionalidadDAO implements Contrato<String>{
    private static final String SQL_REAL_ALL = "SELECT * FROM nacionalidad";
    private static final String SQL_UPDATE = "UPDATE nacionalidad SET nombre_pais = ? WHERE id_nacionalidad";
    private static final String SQL_DELETE = "DELETE FROM nacionalidad WHERE nombre_pais = ?";
    private static final String SQL_CREATE = "INSERT INTO nacionalidad (nombre_pais)VALUES(?)";

    public NacionalidadDAO() {
    }
    
    @Override
    public boolean create(String nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            ps.setString(1, nuevo);
            
            if(ps.execute()){
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

    @Override
    public boolean delete(Object item) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_DELETE);
            
            ps.setString(1, );
            
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

    @Override
    public boolean update(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String read(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> read_all() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
