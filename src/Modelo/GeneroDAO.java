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
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Lancheros
 */
public class GeneroDAO implements{
    private static final String SQL_READ_ALL = "SELECT * FROM genero";
    private static final String SQL_READ = "SELECT id_genero FROM genero WHERE nombre_genero = ?";
    private static final String SQL_UPDATE = "UPDATE genero SET nombre_genero = ? WHERE id_genero = ?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ?";
    private static final String SQL_CREATE = "INSERT INTO cliente (nombre,direccion,id_genero,id_nacionalidad,usuario,constrasena)VALUES(?,?,?,?,?,?)";

    public GeneroDAO() {
    }
    
    public int buscarID(String filter) {

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        int numeroID = -1;
        try {
            ps = cx.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, filter);
            rs = ps.executeQuery();
            
            if(rs.next()){
                numeroID = rs.getInt("id_genero");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta de BD");
        } finally {
            cx.cerrarConexion();
            cx = null;
        }

        return numeroID;
    }
}
