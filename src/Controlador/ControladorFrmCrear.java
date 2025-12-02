/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.FrmCrearCuenta;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Tomas Lancheros
 */
public class ControladorFrmCrear implements ActionListener {
    FrmCrearCuenta frmCrear;
    Persona persona
            
            
    
     public void agregarListener(Container tin){
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JButton){
                ((JButton) tan).addActionListener(this);
            }else if(tan instanceof Container){
                agregarListener((Container)tan);
            }
        }
    }
     
    public void iniciar(){
        frmCrear.setTitle("Cliente");
        frmCrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrear.setResizable(false);
        
        agregarListener(frmCrear);
        
        frmCrear.getGbtnTipoServicio().add(frmCrear.getRbtnAlimentos());
        frmCrear.getGbtnTipoServicio().add(frmCrear.getRbtnPasajeros());
        
        frmCrear.getGbtnCategoria().add(frmCrear.getRbtnNormal());
        frmCrear.getGbtnCategoria().add(frmCrear.getRbtnEspecial());
        frmCrear.getGbtnCategoria().add(frmCrear.getRbtnUrgente());
        
        frmCrear.getGbtnMetodoPago().add(frmCrear.getRbtnEfectivo());
        frmCrear.getGbtnMetodoPago().add(frmCrear.getRbtnTarjetas());
        frmCrear.getGbtnMetodoPago().add(frmCrear.getRbtnBilleterasD());
        
        frmCrear.getRbtnPasajeros().setSelected(true);
        frmCrear.getRbtnNormal().setSelected(true);
        frmCrear.getRbtnEfectivo().setSelected(true);
        
        frmCrear.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
