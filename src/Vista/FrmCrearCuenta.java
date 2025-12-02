/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Tomas Lancheros
 */
public class FrmCrearCuenta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCrearCuenta.class.getName());

    /**
     * Creates new form FrmInicioSesion
     */
    public FrmCrearCuenta() {
        initComponents();
    }

    public JButton getBtnAgregarCliente() {
        return btnAgregarCliente;
    }

    public void setBtnAgregarCliente(JButton btnAgregarCliente) {
        this.btnAgregarCliente = btnAgregarCliente;
    }

    public JButton getBtnAgregarTelefono() {
        return btnAgregarTelefono;
    }

    public void setBtnAgregarTelefono(JButton btnAgregarTelefono) {
        this.btnAgregarTelefono = btnAgregarTelefono;
    }

    public JComboBox<String> getCmbMarca() {
        return cmbMarca;
    }

    public void setCmbMarca(JComboBox<String> cmbMarca) {
        this.cmbMarca = cmbMarca;
    }

    public JComboBox<String> getCmbTipoServicio() {
        return cmbTipoServicio;
    }

    public void setCmbTipoServicio(JComboBox<String> cmbTipoServicio) {
        this.cmbTipoServicio = cmbTipoServicio;
    }

    public JComboBox<String> getCmbTipoUsuario() {
        return cmbTipoUsuario;
    }

    public void setCmbTipoUsuario(JComboBox<String> cmbTipoUsuario) {
        this.cmbTipoUsuario = cmbTipoUsuario;
    }

    public JLabel getErrUsuario() {
        return errUsuario;
    }

    public void setErrUsuario(JLabel errUsuario) {
        this.errUsuario = errUsuario;
    }

    public JLabel getIcon() {
        return icon;
    }

    public void setIcon(JLabel icon) {
        this.icon = icon;
    }
    
    public JLabel getLblBienvenidoAventureros() {
        return lblBienvenidoAventureros;
    }

    public void setLblBienvenidoAventureros(JLabel lblBienvenidoAventureros) {
        this.lblBienvenidoAventureros = lblBienvenidoAventureros;
    }

    public JLabel getLblContrasena() {
        return lblContrasena;
    }

    public void setLblContrasena(JLabel lblContrasena) {
        this.lblContrasena = lblContrasena;
    }

    public JLabel getLblContrasena1() {
        return lblContrasena1;
    }

    public void setLblContrasena1(JLabel lblContrasena1) {
        this.lblContrasena1 = lblContrasena1;
    }

    public JLabel getLblContrasena2() {
        return lblContrasena2;
    }

    public void setLblContrasena2(JLabel lblContrasena2) {
        this.lblContrasena2 = lblContrasena2;
    }

    public JLabel getLblContrasena3() {
        return lblContrasena3;
    }

    public void setLblContrasena3(JLabel lblContrasena3) {
        this.lblContrasena3 = lblContrasena3;
    }

    public JLabel getLblContrasena4() {
        return lblContrasena4;
    }

    public void setLblContrasena4(JLabel lblContrasena4) {
        this.lblContrasena4 = lblContrasena4;
    }

    public JLabel getLblCuentaError() {
        return lblCuentaError;
    }

    public void setLblCuentaError(JLabel lblCuentaError) {
        this.lblCuentaError = lblCuentaError;
    }

    public JLabel getLblInicioSesion() {
        return lblInicioSesion;
    }

    public void setLblInicioSesion(JLabel lblInicioSesion) {
        this.lblInicioSesion = lblInicioSesion;
    }

    public JLabel getLblInicioSesion1() {
        return lblInicioSesion1;
    }

    public void setLblInicioSesion1(JLabel lblInicioSesion1) {
        this.lblInicioSesion1 = lblInicioSesion1;
    }

    public JLabel getLblUsuario() {
        return lblUsuario;
    }

    public void setLblUsuario(JLabel lblUsuario) {
        this.lblUsuario = lblUsuario;
    }

    public JLabel getLblUsuario1() {
        return lblUsuario1;
    }

    public void setLblUsuario1(JLabel lblUsuario1) {
        this.lblUsuario1 = lblUsuario1;
    }

    public JLabel getLblUsuario2() {
        return lblUsuario2;
    }

    public void setLblUsuario2(JLabel lblUsuario2) {
        this.lblUsuario2 = lblUsuario2;
    }

    public JLabel getLblUsuario3() {
        return lblUsuario3;
    }

    public void setLblUsuario3(JLabel lblUsuario3) {
        this.lblUsuario3 = lblUsuario3;
    }

    public JLabel getLblUsuario4() {
        return lblUsuario4;
    }

    public void setLblUsuario4(JLabel lblUsuario4) {
        this.lblUsuario4 = lblUsuario4;
    }

    public JPanel getPnlVehiculo() {
        return pnlVehiculo;
    }

    public void setPnlVehiculo(JPanel pnlVehiculo) {
        this.pnlVehiculo = pnlVehiculo;
    }

    public JSpinner getSpinModelo() {
        return spinModelo;
    }

    public void setSpinModelo(JSpinner spinModelo) {
        this.spinModelo = spinModelo;
    }

    public JTextField getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(JTextField txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }


    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtTelefonos() {
        return txtTelefonos;
    }

    public void setTxtTelefonos(JTextArea txtTelefonos) {
        this.txtTelefonos = txtTelefonos;
    }

    public JComboBox<String> getCmbGenero() {
        return cmbGenero;
    }

    public void setCmbGenero(JComboBox<String> cmbGenero) {
        this.cmbGenero = cmbGenero;
    }

    public JComboBox<String> getCmbNacionalidad() {
        return cmbNacionalidad;
    }

    public void setCmbNacionalidad(JComboBox<String> cmbNacionalidad) {
        this.cmbNacionalidad = cmbNacionalidad;
    }

    public JLabel getLblContrasena5() {
        return lblContrasena5;
    }

    public void setLblContrasena5(JLabel lblContrasena5) {
        this.lblContrasena5 = lblContrasena5;
    }

    public JLabel getLblContrasena6() {
        return lblContrasena6;
    }

    public void setLblContrasena6(JLabel lblContrasena6) {
        this.lblContrasena6 = lblContrasena6;
    }

    public JLabel getLblContrasena7() {
        return lblContrasena7;
    }

    public void setLblContrasena7(JLabel lblContrasena7) {
        this.lblContrasena7 = lblContrasena7;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicioSesion = new javax.swing.JLabel();
        lblBienvenidoAventureros = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        lblCuentaError = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        lblContrasena1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblContrasena2 = new javax.swing.JLabel();
        pnlVehiculo = new javax.swing.JPanel();
        lblUsuario1 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        lblInicioSesion1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblUsuario2 = new javax.swing.JLabel();
        cmbTipoServicio = new javax.swing.JComboBox<>();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        spinModelo = new javax.swing.JSpinner();
        icon = new javax.swing.JLabel();
        btnAgregarTelefono = new javax.swing.JButton();
        lblContrasena3 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        lblContrasena4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        errUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTelefonos = new javax.swing.JTextArea();
        lblContrasena5 = new javax.swing.JLabel();
        lblContrasena6 = new javax.swing.JLabel();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        lblContrasena7 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInicioSesion.setText("Crear Cuenta:");

        lblBienvenidoAventureros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBienvenidoAventureros.setText("Bienvenido a Aventureros");

        lblUsuario.setText("Nombre:");

        lblContrasena.setText("Dirección:");

        btnAgregarCliente.setText("Crear Cuenta");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Conductor" }));

        lblContrasena1.setText("Tipo Usuario:");

        lblContrasena2.setText("Teléfono:");

        pnlVehiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario1.setText("Marca:");
        pnlVehiculo.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));

        pnlVehiculo.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 188, -1));

        lblInicioSesion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInicioSesion1.setText("Vehiculo");
        pnlVehiculo.add(lblInicioSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        pnlVehiculo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 188, -1));

        lblUsuario2.setText("Placa:");
        pnlVehiculo.add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));

        pnlVehiculo.add(cmbTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, 188, -1));

        lblUsuario3.setText("Tipo Servicio:");
        pnlVehiculo.add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, -1, -1));

        lblUsuario4.setText("Modelo:");
        pnlVehiculo.add(lblUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, -1, -1));

        spinModelo.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2025, 1));
        spinModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlVehiculo.add(spinModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, 188, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/cliente.png"))); // NOI18N
        pnlVehiculo.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 420));

        btnAgregarTelefono.setText("Agregar");

        lblContrasena3.setText("Usuario:");

        lblContrasena4.setText("Contraseña");

        errUsuario.setBackground(new java.awt.Color(204, 0, 0));

        txtTelefonos.setColumns(20);
        txtTelefonos.setRows(5);
        jScrollPane1.setViewportView(txtTelefonos);

        lblContrasena5.setText("Teléfonos:");

        lblContrasena6.setText("Género:");

        cmbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombia", "Venezuela" }));

        lblContrasena7.setText("Nacionalidad:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "DizqueMujer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblBienvenidoAventureros)
                        .addComponent(lblContrasena)
                        .addComponent(lblUsuario)
                        .addComponent(lblInicioSesion)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addGap(73, 73, 73))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNombre)
                                    .addGap(73, 73, 73)))
                            .addComponent(lblCuentaError)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContrasena3)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContrasena4)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errUsuario))
                    .addComponent(lblContrasena1)
                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasena5)
                    .addComponent(lblContrasena2)
                    .addComponent(lblContrasena6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbNacionalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAgregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblContrasena7)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lblBienvenidoAventureros)
                .addGap(18, 18, 18)
                .addComponent(lblInicioSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(lblCuentaError))
                            .addGroup(layout.createSequentialGroup()
=======
                        .addGap(422, 422, 422)
                        .addComponent(errUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblContrasena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContrasena6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblContrasena7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 7c5c3003848e580e17521abcb4514e22c631f2ef
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContrasena2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarTelefono))
<<<<<<< HEAD
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(lblContrasena1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContrasena3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(errUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblContrasena4)
=======
                                .addGap(12, 12, 12)
                                .addComponent(lblContrasena5)
>>>>>>> 7c5c3003848e580e17521abcb4514e22c631f2ef
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCuentaError)
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContrasena1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContrasena3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblContrasena4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(btnAgregarCliente)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarTelefono;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbTipoServicio;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel errUsuario;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenidoAventureros;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblContrasena1;
    private javax.swing.JLabel lblContrasena2;
    private javax.swing.JLabel lblContrasena3;
    private javax.swing.JLabel lblContrasena4;
    private javax.swing.JLabel lblContrasena5;
    private javax.swing.JLabel lblContrasena6;
    private javax.swing.JLabel lblContrasena7;
    private javax.swing.JLabel lblCuentaError;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblInicioSesion1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JPanel pnlVehiculo;
    private javax.swing.JSpinner spinModelo;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtTelefonos;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
