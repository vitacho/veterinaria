/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Personal
 */
public class frmPrincipal extends javax.swing.JFrame {
   
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jCheckListaCuentas = new javax.swing.JCheckBoxMenuItem();
        jCheckRegistrarCuenta = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        jCheckListaConsultas = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckRegistrarCliente = new javax.swing.JCheckBoxMenuItem();
        jCheckListaClientes = new javax.swing.JCheckBoxMenuItem();
        jCheckMascotas = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jCheckBoxMenuItem13 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hospitalizacion.jpg"))); // NOI18N
        jButton2.setText("HOSPITALIZACIÓN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 430, 240));

        jButton3.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta.jpg"))); // NOI18N
        jButton3.setText("CONSULTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 430, 240));

        jButton1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Facturacion.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 660, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOP1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrarcuenta.png"))); // NOI18N
        jMenu.setText("Administrar Cuentas ");

        jCheckListaCuentas.setSelected(true);
        jCheckListaCuentas.setText("Lista de Cuentas");
        jCheckListaCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listacuenta.png"))); // NOI18N
        jCheckListaCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckListaCuentasActionPerformed(evt);
            }
        });
        jMenu.add(jCheckListaCuentas);

        jCheckRegistrarCuenta.setSelected(true);
        jCheckRegistrarCuenta.setText("Registrar Cuenta");
        jCheckRegistrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuenta.png"))); // NOI18N
        jCheckRegistrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRegistrarCuentaActionPerformed(evt);
            }
        });
        jMenu.add(jCheckRegistrarCuenta);

        jMenuBar1.add(jMenu);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrarservicios.png"))); // NOI18N
        jMenu2.setText(" Servicios");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Registrar Servicios");
        jCheckBoxMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarservicio.png"))); // NOI18N
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("Lista de Servicios");
        jCheckBoxMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaconsulta.png"))); // NOI18N
        jCheckBoxMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem9);

        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText("Lista de Hospitalización");
        jCheckBoxMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listahospitalizacion.png"))); // NOI18N
        jCheckBoxMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem11);

        jCheckListaConsultas.setSelected(true);
        jCheckListaConsultas.setText("Lista de Consulta");
        jCheckListaConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaconsulta.png"))); // NOI18N
        jCheckListaConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckListaConsultasActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckListaConsultas);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listacuenta.png"))); // NOI18N
        jMenu4.setText(" Clientes");

        jCheckRegistrarCliente.setSelected(true);
        jCheckRegistrarCliente.setText("Registrar Cliente");
        jCheckRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarcliente.png"))); // NOI18N
        jCheckRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRegistrarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckRegistrarCliente);

        jCheckListaClientes.setSelected(true);
        jCheckListaClientes.setText("Lista de Clientes");
        jCheckListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaclientes.png"))); // NOI18N
        jCheckListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckListaClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckListaClientes);

        jCheckMascotas.setSelected(true);
        jCheckMascotas.setText("Mascotas");
        jCheckMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listaclientes.png"))); // NOI18N
        jCheckMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMascotasActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckMascotas);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N
        jMenu6.setText("Facturas");

        jCheckBoxMenuItem13.setSelected(true);
        jCheckBoxMenuItem13.setText("Lista de Facturas");
        jCheckBoxMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listafactura.png"))); // NOI18N
        jCheckBoxMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItem13);

        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receta1.png"))); // NOI18N
        jMenu1.setText("Recetas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receta.png"))); // NOI18N
        jMenuItem1.setText("Lista de recetas");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        jMenu5.setText("Salir");

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText("Cerrar Sesión");
        jCheckBoxMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrasesion.png"))); // NOI18N
        jCheckBoxMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem10);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRegistrarClienteActionPerformed
        // TODO add your handling code here:
        frmPersona rp = new frmPersona(this, false,true);
        rp.setVisible(true);
    }//GEN-LAST:event_jCheckRegistrarClienteActionPerformed

    private void jCheckListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckListaClientesActionPerformed
        // TODO add your handling code here:
        frmListaConsulta fc = new frmListaConsulta(this, false);
        fc.setVisible(true);
    }//GEN-LAST:event_jCheckListaClientesActionPerformed

    private void jCheckBoxMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem9ActionPerformed

    private void jCheckBoxMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem10ActionPerformed

    private void jCheckBoxMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem11ActionPerformed

    private void jCheckListaConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckListaConsultasActionPerformed
        // TODO add your handling code here:
        
       frmListaConsulta fc = new frmListaConsulta(this, false);
       fc.setVisible(true);
        
    }//GEN-LAST:event_jCheckListaConsultasActionPerformed

    private void jCheckListaCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckListaCuentasActionPerformed
        // TODO add your handling code here:
        frmListaPersonas lp = new frmListaPersonas(this, false);
        lp.setVisible(true);
    }//GEN-LAST:event_jCheckListaCuentasActionPerformed

    private void jCheckBoxMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckRegistrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRegistrarCuentaActionPerformed
        // TODO add your handling code here:
        frmPersona rp = new frmPersona(this, false,false);
        rp.setVisible(true);
    }//GEN-LAST:event_jCheckRegistrarCuentaActionPerformed

    private void jCheckMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMascotasActionPerformed
        // TODO add your handling code here:
        frmMascota m = new frmMascota(this, false);
        m.setVisible(true);
    }//GEN-LAST:event_jCheckMascotasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frmConsulta vc = new frmConsulta(this, false);
        vc.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem13;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JCheckBoxMenuItem jCheckListaClientes;
    private javax.swing.JCheckBoxMenuItem jCheckListaConsultas;
    private javax.swing.JCheckBoxMenuItem jCheckListaCuentas;
    private javax.swing.JCheckBoxMenuItem jCheckMascotas;
    private javax.swing.JCheckBoxMenuItem jCheckRegistrarCliente;
    private javax.swing.JCheckBoxMenuItem jCheckRegistrarCuenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
