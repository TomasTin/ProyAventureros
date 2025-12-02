/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import conexiones.ConexionPostgreSQL;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Tomas Lancheros
 */
import com.mysql.cj.protocol.Resultset;
import conexiones.ConexionPostgreSQL;
public class ClienteDAO implements Contrato<Cliente>{
    private static final String SQL_REAL_ALL = "SELECT * FROM cliente";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre = ?, direccion = ?, id_genero = ?, id_nacionalidad = ?, usuario = ?, contrasena = ? WHERE id_cliente = ?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ?";
    private static final String SQL_CREATE = "INSERT INTO cliente (nombre,direccion,id_genero,id_nacionalidad,usuario,constrasena)VALUES(?,?,?,?,?,?)";

    public ClienteDAO() {
    }

    public boolean create(Cliente nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            
            
            ps.setString(1, nuevo.getNombre());
            ps.setString(2, nuevo.getDireccion());
            ps.setInt(3, gen);
            ps.setString(4, nuevo.getEditorial());
            ps.setInt(5, nuevo.getAnio());
            
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

    public boolean delete(Object item){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_DELETE);
            
            ps.setLong(1, ((Cliente)item).getIsbn());
            
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

    public boolean update(Cliente filter){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, filter.getNombre());
            ps.setString(2, filter.getAutor());
            ps.setString(3, filter.getEditorial());
            ps.setInt(4, filter.getAnio());
            ps.setLong(5, filter.getIsbn());
            
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

    public Servicio read(Cliente filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Cliente> read_all() {
        List<Cliente> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_REAL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente dto = new Cliente(
                        rs.getLong("isbn"),
                        rs.getString("nombre"),
                        rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getInt("anio")
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
