/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AventurerosSAS;
import Modelo.Cliente;
import Modelo.Servicio;
import Vista.FrmRealizarServicio;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Tomas Lancheros
 */
public class ControladorFrmRealizarServicio implements ActionListener{
    private FrmRealizarServicio frm;
    private AventurerosSAS objA;
    private Cliente cliente;

    public ControladorFrmRealizarServicio(AventurerosSAS objA, Cliente cliente){
        this.frm = new FrmRealizarServicio();
        this.objA = objA;
        this.cliente = cliente;
    }
    
    public void iniciar(){
        frm.setTitle("Cliente");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);
        
        agregarListener(frm);
        
        frm.getGbtnTipoServicio().add(frm.getRbtnAlimentos());
        frm.getGbtnTipoServicio().add(frm.getRbtnPasajeros());
        
        frm.getGbtnCategoria().add(frm.getRbtnNormal());
        frm.getGbtnCategoria().add(frm.getRbtnEspecial());
        frm.getGbtnCategoria().add(frm.getRbtnUrgente());
        
        frm.getGbtnMetodoPago().add(frm.getRbtnEfectivo());
        frm.getGbtnMetodoPago().add(frm.getRbtnTarjetas());
        frm.getGbtnMetodoPago().add(frm.getRbtnBilleterasD());
        
        frm.getRbtnPasajeros().setSelected(true);
        frm.getRbtnNormal().setSelected(true);
        frm.getRbtnEfectivo().setSelected(true);
        
        frm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(frm.getBtnRealizar())){
            if(frm.getCmbConductor().getSelectedIndex() == 0 &&
                frm.getTxtDireccionO().getText().isBlank() &&
                frm.getTxtDireccionD().getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Hay algún espacio vacio");
            }else{
                if(frm.getr)
                
                Servicio st = new Servicio(
                        cliente,
                        conductor,
                        frm.getTxtDireccionO().getText(),
                        frm.getTxtDireccionD().getText(),
                        tipo_servicio,
                        categoria,
                        forma_pago,
                        0,
                        0
                )
            }
        }
    }
    
    public void agregarListener(Container tin){
        for (Component tan : tin.getComponents()){
            if(tan instanceof JButton){
                ((JButton) tan).addActionListener(this);
            }else if(tan instanceof JRadioButton){
                ((JRadioButton)tan).addActionListener(this);
            }if(tan instanceof Container){
                agregarListener((Container)tan);
            }
        }
    }
}
