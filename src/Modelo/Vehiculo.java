package Modelo;

/**
 *
 * @author Tomas Lancheros
 */
public class Vehiculo {
    private String placa, marca, tipo_servicio;
    private int modelo;

    public Vehiculo(String placa, String marca, String tipo_servicio, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.tipo_servicio = tipo_servicio;
        this.modelo = modelo;
    }

    public Vehiculo() {
        this.placa = "";
        this.marca = "";
        this.tipo_servicio = "";
        this.modelo = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Placa:" + placa + "\nMarca:" + marca + "\nTipo_servicio:" + tipo_servicio + "\nModelo:" + modelo;
    }
}
