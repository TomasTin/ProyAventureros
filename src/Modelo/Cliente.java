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
public class Cliente extends Persona{
    private Cuenta cnt;

    public Cliente(Cuenta cnt, int id, String nombre, String direccion, String genero, String nacionalidad, ArrayList<Long> telefonos) {
        super(id, nombre, direccion, genero, nacionalidad, telefonos);
        this.cnt = cnt;
    }

    public Cliente(){
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
