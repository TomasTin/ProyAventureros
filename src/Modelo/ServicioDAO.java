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
import javax.swing.JOptionPane;
public class ServicioDAO{
    private static final String SQL_REAL_ALL = "SELECT * FROM servicio";
    private static final String SQL_UPDATE = "UPDATE servicio SET id_cliente = ?, id_conductor = ?, id_tipo_servicio = ?, id_categoria = ?, fecha = ?, direccion_origen = ?, direccion_destino = ?, id_forma_pago = ? WHERE id_servicio = ?";
    private static final String SQL_DELETE = "DELETE FROM servicio WHERE id_servicio = ?";
    private static final String SQL_CREATE = "INSERT INTO servicio (id_cliente,id_conductor,id_tipo_servicio,id_categoria,fecha,direccion_origen,direccion_destino,id_forma_pago) VALUES(?,?,?,?,CURRENT_DATE,?,?,?)";

    public ServicioDAO() {
    }

    public boolean create(Servicio nuevo) {
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_CREATE);
            
            int tipoS_ID  = new TipoServicioDAO().buscarID(nuevo.getTipo_servicio());
            int catID  = new TipoServicioDAO().buscarID(nuevo.getCategoria());
            int formaP_ID  = new TipoServicioDAO().buscarID(nuevo.getForma_pago());
            
            if(tipoS_ID == -1 || catID == -1 || formaP_ID == -1){
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }else{
                ps.setInt(1, nuevo.getCliente().getId());
                ps.setInt(2, nuevo.getConductor().getId());
                ps.setInt(3, tipoS_ID);
                ps.setInt(4, catID);
                ps.setString(5, nuevo.getDir_origen());
                ps.setString(6, nuevo.getDir_destino());
                ps.setInt(7, formaP_ID);

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

    public boolean delete(int item){
        PreparedStatement ps;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();
        
        try {
            ps = cx.getCnn().prepareStatement(SQL_DELETE);
            
            ps.setLong(1, item);
            
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
            
            int tipoS_ID  = new TipoServicioDAO().buscarID(filter.getTipo_servicio());
            int catID  = new TipoServicioDAO().buscarID(filter.getCategoria());
            int formaP_ID  = new TipoServicioDAO().buscarID(filter.getForma_pago());
            
            if(tipoS_ID == -1 || catID == -1 || formaP_ID == -1){
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }else{
                ps.setInt(1, filter.getCliente().getId());
                ps.setInt(2, filter.getConductor().getId());
                ps.setInt(3, tipoS_ID);
                ps.setInt(4, catID);
                ps.setString(5, filter.getDir_origen());
                ps.setString(6, filter.getDir_destino());
                ps.setInt(7, formaP_ID);

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

    public Servicio read(Servicio filter) {
        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_REAL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Servicio dto = new Servicio(
                        rs.getInt("id_servicio"),
                        new ClienteDAO().read(rs.getInt("id_cliente")),
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

    public ArrayList<Servicio> read_all() {
        ArrayList<Servicio> lista = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        ConexionPostgreSQL cx = ConexionPostgreSQL.getInstance();

        try {
            ps = cx.getCnn().prepareStatement(SQL_REAL_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Servicio dto = new Servicio(
                        rs.getInt("id_servicio"),
                        new Cliente(
                                new Cuenta(, SQL_UPDATE),
                                0,
                                SQL_CREATE,
                                SQL_CREATE,
                                SQL_DELETE,
                                SQL_REAL_ALL,
                                telefonos
                        ),
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
