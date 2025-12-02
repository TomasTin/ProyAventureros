/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Tomas Lancheros
 */
public class Cuenta {
    private String usuario, password;

    public Cuenta(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    public Cuenta() {
        this.usuario = "";
        this.password = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario:" + usuario + "\nContrasena:" + password;
    }
}
