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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tomas Lancheros
 */
public class ControladorFrmCrear implements ActionListener {
    FrmCrearCuenta frmCrear;
    Persona persona;

    public ControladorFrmCrear(){
        frmCrear = new FrmCrearCuenta();
        persona = null;
    }
    
    public ControladorFrmCrear(FrmCrearCuenta frmCrear, Persona persona) {
        this.frmCrear = frmCrear;
        this.persona = persona;
    }
    
    
    public void agregarListener(Container tin){
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JButton){
                ((JButton) tan).addActionListener(this);
            }else if(tan instanceof JComboBox){
                ((JComboBox) tan).addActionListener(this);
            }else if(tan instanceof Container){
                agregarListener((Container)tan);
            }
        }
    }
    
    public void ocultar(Container tin){
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JLabel && !tan.equals(frmCrear.getIcon())){
                tan.setVisible(false);
            }else if()
        }
    }
     
    public void iniciar(){
        frmCrear.setTitle("Cliente");
        frmCrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrear.setResizable(false);
        agregarListener(frmCrear);
        frmCrear.setVisible(true);
        frmCrear.getTxtTelefonos().setEnabled(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frmCrear.getCmbTipoUsuario())){
            
        }
        if(e.getSource().equals(frmCrear.getBtnAgregarTelefono())){
           
       }
    }
}
