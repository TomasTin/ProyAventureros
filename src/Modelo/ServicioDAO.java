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
import conexiones.ConexionMysql;
public class ServicioDAO implements Contrato<Servicio>{
    private static final String SQL_REAL_ALL = "SELECT * FROM ";
    private static final String SQL_UPDATE = "UPDATE tb_libro  SET nombre = ?, autor = ?, editorial = ?, anio = ? WHERE isbn = ?";
    private static final String SQL_DELETE = "DELETE FROM tb_libro WHERE isbn = ?";
    private static final String SQL_CREATE = "INSERT INTO tb_libro VALUES(?,?,?,?,?)";

    public ServicioDAO() {
    }

    public boolean create(Servicio nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            ps.setLong(1, nuevo.getIsbn());
            ps.setString(2, nuevo.getNombre());
            ps.setString(3, nuevo.getAutor());
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
            
            ps.setLong(1, ((Servicio)item).getIsbn());
            
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

    public boolean update(Servicio filter){
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

    public Servicio read(Servicio filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Servicio> read_all() {
        List<Servicio> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_REAL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Servicio dto = new Servicio(
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
