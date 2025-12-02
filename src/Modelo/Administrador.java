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

    public Administrador(Cuenta cnt, String nombre, String direccion, String genero, String nacionalidad, ArrayList<Long> telefonos) {
        super(nombre, direccion, genero, nacionalidad, telefonos);
        this.cnt = cnt;
    }

    public Administrador(){
        super();
        this.cnt = new Cuenta();
    }

    public Cuenta getCnt() {
        return cnt;
    }

    public void setCnt(Cuenta cnt) {
        this.cnt = cnt;
    }
}
