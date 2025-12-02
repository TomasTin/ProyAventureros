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
import java.util.List;

/**
 *
 * @author Tomas Lancheros
 */
public class TelefonoClienteDAO {
    private static final String SQL_READ_ALL = "SELECT telefono FROM telefono_cliente";
    private static final String SQL_READ = "SELECT telefono FROM  telefono_cliente WHERE id_cliente = ?";
    private static final String SQL_UPDATE = "UPDATE nacionalidad SET nombre_pais = ? WHERE nombre_pais = ?";
    private static final String SQL_DELETE = "DELETE FROM nacionalidad WHERE nombre_pais = ?";
    private static final String SQL_CREATE = "INSERT INTO nacionalidad (nombre_pais)VALUES(?)";
    
    public ArrayList<Long> read(int id) {
        ArrayList<Long> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getLong("telefono"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return lista;
    }
    
    public ArrayList<Long> read_all() {
        ArrayList<Long> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_READ_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getLong("telefono"));
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
