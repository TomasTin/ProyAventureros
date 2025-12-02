/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Administrador;
import Modelo.AventurerosSAS;
import Modelo.Cliente;
import Modelo.Conductor;
import Modelo.Persona;
import Vista.FrmPrincipalCliente;
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
public class ControladorFrmPrincipalCliente implements ActionListener{
    private FrmPrincipalCliente frm;
    private AventurerosSAS objA;
    private Cliente cliente;

    public ControladorFrmPrincipalCliente(AventurerosSAS objA, Cliente cliente) {
        this.frm = new FrmPrincipalCliente();
        this.objA = objA;
        this.cliente = cliente;
    }
    
    public void iniciar(){
        frm.setTitle("Cliente");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setResizable(false);
        
        agregarListener(frm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frm.getBtnRealizarServicio())){
            ControladorFrmRealizarServicio objC = new ControladorFrmRealizarServicio(objA, cliente);
            objC.iniciar();
            frm.dispose();
        }
        if(e.getSource().equals(frm.getBtnActualizarInformacion())){
            
        }
        if(e.getSource().equals(frm.getBtnEliminarCuenta())){
            
        }
    }
    
    public void agregarListener(Container tin){
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JButton){
                ((JButton) tan).addActionListener(this);
            }else if(tan instanceof Container){
                agregarListener((Container)tan);
            }
        }
    }
    
    public void iniciarVentana(Persona p){
        if(p instanceof Cliente){
            ControladorFrmPrincipalCliente objC = new ControladorFrmPrincipalCliente(objA, (Cliente)p);
            objC.iniciar();
        }
        if(p instanceof Conductor){
            
        }
        if(p instanceof Administrador){
            
        }
        frm.dispose();
    }
}
