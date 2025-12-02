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
public abstract class Persona {
    protected String nombre, direccion, genero, nacionalidad;
    protected ArrayList<Long> telefonos;

    public Persona(String nombre, String direccion, String genero, String nacionalidad, ArrayList<Long> telefonos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.telefonos = telefonos;
    }

    public Persona() {
        this.nombre = "";
        this.direccion = "";
        this.genero = "";
        this.nacionalidad = "";
        this.telefonos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<Long> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Long> telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nDireccion:" + direccion + "\nGenero:" + genero + "\nNacionalidad:" + nacionalidad + "\nTelefonos:" + telefonos;
    }
}
