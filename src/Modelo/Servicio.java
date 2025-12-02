/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Tomas Lancheros
 */
public class Servicio {
    private int id;
    private Cliente cliente;
    private Conductor conductor;
    private LocalDate fecha;
    private String dir_origen, dir_destino, tipo_servicio, categoria, forma_pago;
    private double valor_total, tarifa_adicional;
    private final double VALOR_BASE = 10000.0;

    public Servicio(int id, Cliente cliente, Conductor conductor, LocalDate fecha, String dir_origen, String dir_destino, String tipo_servicio, String categoria, String forma_pago, double tarifa_adicional, double valor_total) {
        this.id = id;
        this.cliente = cliente;
        this.conductor = conductor;
        this.fecha = fecha;
        this.dir_origen = dir_origen;
        this.dir_destino = dir_destino;
        this.tipo_servicio = tipo_servicio;
        this.categoria = categoria;
        this.forma_pago = forma_pago;
        this.tarifa_adicional = tarifa_adicional;
        this.valor_total = valor_total;
    }
    
    public Servicio() {
        this.id = 0;
        this.cliente = new Cliente();
        this.conductor = new Conductor();
        this.fecha = LocalDate.now();
        this.dir_origen = "";
        this.dir_destino = "";
        this.tipo_servicio = "";
        this.categoria = "";
        this.forma_pago = "";
        this.valor_total = 0.0;
        this.tarifa_adicional = 0.0;
    }
    
    public void calcularValorTotal(){
        valor_total = VALOR_BASE + tarifa_adicional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDir_origen() {
        return dir_origen;
    }

    public void setDir_origen(String dir_origen) {
        this.dir_origen = dir_origen;
    }

    public String getDir_destino() {
        return dir_destino;
    }

    public void setDir_destino(String dir_destino) {
        this.dir_destino = dir_destino;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getTarifa_adicional() {
        return tarifa_adicional;
    }

    public void setTarifa_adicional(double tarifa_adicional) {
        this.tarifa_adicional = tarifa_adicional;
    }
}
