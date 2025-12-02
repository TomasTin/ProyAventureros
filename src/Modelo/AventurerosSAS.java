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
public class AventurerosSAS {
    private Administrador admninistrador;
    private ArrayList<Cliente> clientes;
    private ArrayList<Conductor> conductores;

    public AventurerosSAS(Administrador admninistrador, ArrayList<Cliente> clientes, ArrayList<Conductor> conductores) {
        this.admninistrador = admninistrador;
        this.clientes = clientes;
        this.conductores = conductores;
    }

    public AventurerosSAS() {
        this.admninistrador = new Administrador();
        this.clientes = new ArrayList<>();
        this.conductores = new ArrayList<>();
    }

    public Administrador getAdmninistrador() {
        return admninistrador;
    }

    public void setAdmninistrador(Administrador admninistrador) {
        this.admninistrador = admninistrador;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(ArrayList<Conductor> conductores) {
        this.conductores = conductores;
    }
}
