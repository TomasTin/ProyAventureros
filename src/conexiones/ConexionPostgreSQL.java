/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tomas Lancheros
 */
public class ConexionPostgreSQL {

    private static ConexionPostgreSQL instance = null;//Singleton
    private Connection cnn;
    private String user = "postgres", 
                   driver = "com.mysql.cj.jdbc.Driver",
                   pss = "l0st-0n-y0u",
                   nom_bd = "AventurerosSA",
                   url = "jdbc:mysql://localhost:5432/" + nom_bd;
    
    private ConexionPostgreSQL() {
        try {
            //llamar al driver;
            Class.forName(driver);
            cnn = DriverManager.getConnection(url,user,pss);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver");
        } catch (SQLException ex) {
            System.out.println("Error al realizar la conexion con la base de datos");
            ex.printStackTrace();
        }
    }

    public static synchronized ConexionPostgreSQL getInstance() {//sirve para a poner en fila las invocaciones del metodo
        if(ConexionPostgreSQL.instance == null){
            ConexionPostgreSQL.instance = new ConexionPostgreSQL();
            System.out.println("Se crea la conexion");
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void cerrarConexion(){
        if(cnn != null){
            try {
                cnn.close();
                System.out.println("La conexion se cerro");
                instance = null;
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
}