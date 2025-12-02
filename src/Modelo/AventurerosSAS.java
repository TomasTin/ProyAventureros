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
    private ArrayList<Administrador> admninistradores;
    private ArrayList<Cliente> clientes;
    private ArrayList<Conductor> conductores;

    public AventurerosSAS(ArrayList<Administrador> admninistradores, ArrayList<Cliente> clientes, ArrayList<Conductor> conductores) {
        this.admninistradores = admninistradores;
        this.clientes = clientes;
        this.conductores = conductores;
    }
    
    public AventurerosSAS() {
        this.admninistradores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.conductores = new ArrayList<>();
    }

    public ArrayList<Administrador> getAdmninistradores() {
        return admninistradores;
    }

    public void setAdmninistradores(ArrayList<Administrador> admninistradores) {
        this.admninistradores = admninistradores;
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
