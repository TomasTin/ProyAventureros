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
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import Modelo.Cliente;
import Modelo.Conductor;
import java.util.ArrayList;

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
        frmCrear.getIcon().setVisible(true);
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JLabel && !tan.equals(frmCrear.getIcon())){
                tan.setVisible(false);
            }else if(tan instanceof JTextField){
                tan.setVisible(false);
            }else if(tan instanceof JComboBox){
                tan.setVisible(false);
            }else if(tan instanceof JSpinner){
                tan.setVisible(false);
            }else if(tan instanceof Container){
                ocultar((Container)tan);
            }
        }
    }
    
    public void mostrar(Container tin){
        frmCrear.getIcon().setVisible(false);
        for (Component tan : tin.getComponents()) {
            if(tan instanceof JLabel && !tan.equals(frmCrear.getIcon())){
                tan.setVisible(true);
            }else if(tan instanceof JTextField){
                tan.setVisible(true);
            }else if(tan instanceof JComboBox){
                tan.setVisible(true);
            }else if(tan instanceof JSpinner){
                tan.setVisible(true);
            }else if(tan instanceof Container){
                mostrar((Container)tan);
            }
        }
    }
     
    public void iniciar(){
        frmCrear.setTitle("Cliente");
        frmCrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrear.setResizable(false);
        agregarListener(frmCrear);
        frmCrear.setVisible(true);
        frmCrear.getTxtTelefonos().setEditable(false);
        ocultar(frmCrear.getPnlVehiculo());
        
    }
    
    public boolean validar(Container campo){
        if(campo instanceof JTextField){
            if(((JTextField) campo).getText().isBlank()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frmCrear.getCmbTipoUsuario())){
            if(frmCrear.getCmbTipoUsuario().getSelectedItem().equals("Cliente")){
                ocultar(frmCrear.getPnlVehiculo());
            }else if(frmCrear.getCmbTipoUsuario().getSelectedItem().equals("Conductor")){
                mostrar(frmCrear.getPnlVehiculo());
            }
        }
        if(e.getSource().equals(frmCrear.getBtnAgregarTelefono())){
            if(!frmCrear.getTxtTelefono().getText().isBlank()){
                if(frmCrear.getTxtTelefono().getText().matches("^[0-9]+$") && frmCrear.getTxtTelefono().getText().length() >= 5){
                   frmCrear.getTxtTelefonos().append(frmCrear.getTxtTelefono().getText() + "\n");
                   frmCrear.getTxtTelefono().setText("");
                }else{
                    JOptionPane.showMessageDialog(
                        frmCrear, 
                        "Digite un valor de teléfono válido.", 
                        "Campo Requerido", 
                        JOptionPane.WARNING_MESSAGE 
                    );
                }
           }else{
               JOptionPane.showMessageDialog(
                    frmCrear, 
                    "Digite un valor de teléfono.", 
                    "Campo Requerido", 
                    JOptionPane.WARNING_MESSAGE 
                );
            }
        }
        if(e.getSource().equals(frmCrear.getBtnAgregarCliente())){
            if(frmCrear.getCmbTipoUsuario().getSelectedIndex() == 0){
                persona = new Cliente();
            }else if (frmCrear.getCmbTipoUsuario().getSelectedIndex() == 1){
                persona = new Conductor();
            }
            
            if(validar(frmCrear.getTxtNombre())){
                persona.setNombre(frmCrear.getTxtNombre().getText());
            }
            if(validar(frmCrear.getTxtDireccion())){
                persona.setDireccion(frmCrear.getTxtDireccion().getText());
            }
            persona.setNacionalidad(frmCrear.getCmbNacionalidad().getSelectedItem().toString());
            String[] telefonosText = frmCrear.getTxtTelefonos().getText().split("\n");
            ArrayList<Long> telefonos = new ArrayList<>();
            for(String s : telefonosText){
                Long tel = Long.parseLong(s);
                telefonos.add(tel);
            }
            persona.setTelefonos(telefonos);
            persona.setGenero(frmCrear.getCmbGenero().getSelectedItem().toString());
            String personaa;
            personaa = persona.getNombre() + " " + persona.getDireccion()
                    + " " + persona.getNacionalidad() + "\nTelefonos:";
            for(Long tel : telefonos){
                personaa += tel  + " ";
            }
            JOptionPane.showMessageDialog(frmCrear, personaa);
        }
    }
}
