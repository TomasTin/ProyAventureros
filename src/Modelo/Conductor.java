/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Tomas Lancheros
 */
public class Conductor extends Persona{
    private Vehiculo v;
    private BufferedImage fotografia;
    private Cuenta cnt;

    public Conductor(Vehiculo v, BufferedImage fotografia, Cuenta cnt, String nombre, String direccion, String genero, String nacionalidad, ArrayList<Long> telefonos) {
        super(nombre, direccion, genero, nacionalidad, telefonos);
        this.v = v;
        this.fotografia = fotografia;
        this.cnt = cnt;
    }

    public Conductor() {
        super();
        this.v = new Vehiculo();
        this.fotografia = null;
        this.cnt = new Cuenta();
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public BufferedImage getFotografia() {
        return fotografia;
    }

    public void setFotografia(BufferedImage fotografia) {
        this.fotografia = fotografia;
    }

    public Cuenta getCnt() {
        return cnt;
    }

    public void setCnt(Cuenta cnt) {
        this.cnt = cnt;
    }
}
