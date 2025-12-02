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
import Vista.FrmInicioSesion;
import Vista.FrmPrincipalCliente;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Tomas Lancheros
 */
public class ControladorFrmInicioSesion implements ActionListener{
    private FrmInicioSesion frm;
    private FrmPrincipalCliente frmC;
    private AventurerosSAS objA;

    public ControladorFrmInicioSesion(FrmInicioSesion frm, AventurerosSAS objM) {
        this.frm = frm;
        this.objA = objM;
    }
    
    public ControladorFrmInicioSesion() {
        this.frm = new FrmInicioSesion();
        this.objA = new AventurerosSAS();        
    }

    public FrmInicioSesion getFrm() {
        return frm;
    }

    public void setFrm(FrmInicioSesion frm) {
        this.frm = frm;
    }

    public AventurerosSAS getObjA() {
        return objA;
    }

    public void setObjA(AventurerosSAS objA) {
        this.objA = objA;
    }
    
    public void iniciar(){
        frm.setTitle("Inicio sesion");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setResizable(false);
        
        agregarListener(frm);
        
        objA.set();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frm.getBtnIniciarSesion())){
            for (Cliente cliente : objA.getClientes()) {
                if(frm.getTxtUsuario().getText() == cliente.getCnt().getUsuario() && frm.getTxtContrasena().getText() == cliente.getCnt().getPassword()){
                    iniciarVentana(cliente);
                    
                    break;
                }
            }
            for (Conductor conductor : objA.getConductores()) {
                if(frm.getTxtUsuario().getText() == conductor.getCnt().getUsuario() && frm.getTxtContrasena().getText() == conductor.getCnt().getPassword()){
                    iniciarVentana(conductor);
                    break;
                }
            }
            for (Administrador administrador : objA.getAdmninistradores()) {
                if(frm.getTxtUsuario().getText() == administrador.getCnt().getUsuario() && frm.getTxtContrasena().getText() == administrador.getCnt().getPassword()){
                    iniciarVentana(administrador);
                    break;
                }
            }
            frm.getLblCuentaError().setText("Cuenta no encontrada");
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
