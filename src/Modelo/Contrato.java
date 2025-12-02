/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Tomas Lancheros
 */
public interface Contrato<Objeto>{
    public boolean create(Objeto nuevo);
    public boolean delete(Object item);
    public boolean update(Objeto filter);
    public Objeto read (Objeto filter);
    public List<Objeto> read_all();
}