/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controladorPersona;
import Modelo.Cuenta;
import Modelo.Rol;

/**
 *
 * @author Personal
 */
public class frmPersona extends javax.swing.JDialog {

    controladorPersona listaPersonas;
    boolean esCliente;
    public frmPersona(java.awt.Frame parent, boolean modal,boolean vrf) {
        super(parent, modal);
        initComponents();
        esCliente=vrf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTexApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jTexCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextPasword = new javax.swing.JTextField();
        jComboRol = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jTextValPasword = new javax.swing.JTextField();
        jComboEstado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ALERTA = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1150, 639));
        setPreferredSize(new java.awt.Dimension(1150, 639));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAtras.setText("Atrás");
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jBAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 100, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cédula ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 24, 20, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Apellido ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 60, 60, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 62, -1, -1));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 100, -1, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("*");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 100, 10, -1));
        jPanel1.add(jTexApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 59, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Dirección ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 136, -1, 20));
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 138, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 178, -1, 20));
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));
        jPanel1.add(jTexCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 21, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Electrónico");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));
        jPanel1.add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Correo ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 400, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Contraseña ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("*");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Rol");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("*");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 20, -1));
        jPanel2.add(jTextPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 186, 30));

        jComboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Segretaria(a)", "Veterinario" }));
        jPanel2.add(jComboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("*");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 20, -1));
        jPanel2.add(jTextValPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 186, 30));

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activada", "Desactivada" }));
        jComboEstado.setMaximumSize(new java.awt.Dimension(1366, 768));
        jComboEstado.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel2.add(jComboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 190, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Estado:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Confirmar Contraseña");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 390, 230));

        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 90, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel16.setText("REGISTRAR PERSONA ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        ALERTA.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        ALERTA.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ALERTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 310, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOP1.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        if(esCliente==true)registrarCliente();
        else registrarCuenta();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBAtrasActionPerformed

    public void registrarCuenta(){
        if(listaPersonas==null){
            listaPersonas = new controladorPersona();
            listaPersonas.crearLista();
        }
        ALERTA.setText("");
        String cedula = jTexCedula.getText().trim();
        if(!jTexApellido.getText().equals("")&&!jTexCedula.getText().equals("")&&!jTextCorreo.getText().equals("")
           &&!jTextDireccion.getText().equals("")&&!jTextNombre.getText().equals("")&&!jTextPasword.getText().equals("")
           &&!jTextTelefono.getText().equals("")&&!jTextValPasword.getText().equals("")){
            if(listaPersonas.validarCedula(cedula)){
                if(!listaPersonas.cedulaRepetida(cedula)){
                    if(esNumerico(jTextTelefono.getText().trim())){
                        if(listaPersonas.validarPasword(jTextPasword.getText().trim(), jTextValPasword.getText().trim())){
                            String r = jComboRol.getSelectedItem().toString();
                            Rol rol = new Rol(1, r);
                            boolean estado;
                            if(jComboEstado.getSelectedItem().toString().equals("Activada"))estado=true;
                            else estado=false;
                            Cuenta cuenta = new Cuenta(1, "CTA1", jTextPasword.getText(), estado);
                            String nombre = jTextNombre.getText().trim();
                            String apellido = jTexApellido.getText().trim();
                            String correo = jTextCorreo.getText().trim();
                            String telefono = jTextTelefono.getText().trim();
                            String direccion = jTextDireccion.getText().trim();
                            listaPersonas.agregarPersona(1, "P01",nombre, apellido, correo, cedula, telefono, direccion, rol, cuenta);
                            limpiarJText();
                        }else{
                            ALERTA.setText("LAS CONTRASEÑAS NO COINCIDEN");
                            jTextPasword.setText("");
                            jTextValPasword.setText("");
                        }
                    }else{
                        ALERTA.setText("TELEFONO NO VALIDO");
                        jTextTelefono.setText("");
                    }
                }else{
                     ALERTA.setText("CEDULA REPETIDA");
                        jTexCedula.setText("");
                }   
            }else {
                ALERTA.setText("CEDULA NO VALIDA");
                jTexCedula.setText("");
            }
        }else{
            ALERTA.setText("LLENE TODOS LOS CAMPOS");
        }
    }
    
    public void registrarCliente(){
        if(listaPersonas==null){
            listaPersonas = new controladorPersona();
            listaPersonas.crearLista();
        }
        bloquearCamposCuenta();
        ALERTA.setText("");
        String cedula = jTexCedula.getText().trim();
        if(!jTexApellido.getText().equals("")&&!jTexCedula.getText().equals("")&&!jTextCorreo.getText().equals("")
           &&!jTextDireccion.getText().equals("")&&!jTextNombre.getText().equals("")&&!jTextPasword.getText().equals("")
           &&!jTextTelefono.getText().equals("")&&!jTextValPasword.getText().equals("")){
            if(listaPersonas.validarCedula(cedula)){
                if(!listaPersonas.cedulaRepetida(cedula)){
                    if(esNumerico(jTextTelefono.getText().trim())){
                        Rol rol = new Rol(1, "Cliente");
                        Cuenta cuenta = new Cuenta(1, "CTA1", "", true);//clientes sin contraseña
                        String nombre = jTextNombre.getText().trim();
                        String apellido = jTexApellido.getText().trim();
                        String correo = jTextCorreo.getText().trim();
                        String telefono = jTextTelefono.getText().trim();
                        String direccion = jTextDireccion.getText().trim();
                        listaPersonas.agregarPersona(1, "P01",nombre, apellido, correo, cedula, telefono, direccion, rol, cuenta);
                        limpiarJText();
                    }else{
                        ALERTA.setText("TELEFONO NO VALIDO");
                        jTextTelefono.setText("");
                    }
                }else{
                     ALERTA.setText("CEDULA REPETIDA");
                        jTexCedula.setText("");
                }   
            }else {
                ALERTA.setText("CEDULA NO VALIDA");
                jTexCedula.setText("");
            }
        }else{
            ALERTA.setText("LLENE TODOS LOS CAMPOS");
        }
    }
    
    private static boolean esNumerico(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public void limpiarJText(){
        jTexApellido.setText("");
        jTexCedula.setText("");
        jTextCorreo.setText("");
        jTextDireccion.setText("");
        jTextNombre.setText("");
        jTextPasword.setText("");
        jTextTelefono.setText("");
        jTextValPasword.setText("");
    }
    
    public void bloquearCamposCuenta(){
        jTextPasword.disable();
        jTextValPasword.disable();
        jComboRol.disable();
        jComboEstado.disable();
    }
    public void tipoderegistro(){
        if(esCliente==true)bloquearCamposCuenta(); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPersona dialog = new frmPersona(new javax.swing.JFrame(), true,false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALERTA;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBAtras;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboRol;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTexApellido;
    private javax.swing.JTextField jTexCedula;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPasword;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextValPasword;
    // End of variables declaration//GEN-END:variables
}
