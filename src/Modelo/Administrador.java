/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Tomas Lancheros
 */
public class Administrador extends Persona {
    private Cuenta cnt;

    public Administrador() {
        super();
        this.cnt.setUsuario("Admin");
        this.cnt.setPassword("12345");
    }

    public Cuenta getCnt() {
        return cnt;
    }

    public void setCnt(Cuenta cnt) {
        this.cnt = cnt;
    }
}
