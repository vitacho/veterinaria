/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controladorConsulta;
import Controlador.controladorMascota;
import Modelo.Cuenta;
import Modelo.Mascota;
import Modelo.Persona;
import Modelo.Rol;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class frmConsulta extends javax.swing.JDialog {

    controladorMascota listaMascotas;
    ArrayList<Persona> listPersonas;
    ArrayList<Mascota> lista = new ArrayList<>();
    int op;

    public static controladorConsulta cc = new controladorConsulta();
    controladorMascota cm = new controladorMascota();

    Mascota mascota = new Mascota();

    //ArrayList<Mascota> listMascota = new ArrayList<>();
    /**
     * Creates new form frmConsulta
     */
    public frmConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTextFieldCI.setEditable(false);
        jTextFieldNombreMascota.setEditable(false);
        jTextFieldSexMas.setEditable(false);
    }

    private static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextFieldDueno = new javax.swing.JTextField();
        jTextFieldSexMas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaMotivo = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTemp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPresion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDiag = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonRecetar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombreMascota = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButtonbuscar = new javax.swing.JButton();
        jTextFieldVeterinario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("REGISTRAR CONSULTA ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jTextFieldDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuenoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, 30));
        getContentPane().add(jTextFieldSexMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 250, 30));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaMotivo.setColumns(20);
        jTextAreaMotivo.setLineWrap(true);
        jTextAreaMotivo.setRows(5);
        jTextAreaMotivo.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextAreaMotivo);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 850, 100));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Motivo de la consulta");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1010, -1));

        jPanel3.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Presión:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Temperatura:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Peso:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldPresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 1020, 50));

        jPanel5.setOpaque(false);

        jTextAreaDiag.setColumns(20);
        jTextAreaDiag.setLineWrap(true);
        jTextAreaDiag.setRows(5);
        jTextAreaDiag.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextAreaDiag);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Diagnóstico:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 1020, -1));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 98, -1));

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, -1, -1));

        jButtonRecetar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRecetar.setText("Recetar");
        getContentPane().add(jButtonRecetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 98, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Veterinario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));
        getContentPane().add(jTextFieldNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 240, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Sexo de la mascota:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 20));

        jButtonbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        getContentPane().add(jTextFieldVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 240, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Dueño de la Mascota");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nombre mascota:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CI:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 40, -1));

        jTextFieldCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCIActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOP1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed
        // TODO add your handling code here:
        if (listaMascotas == null) {
            listaMascotas = new controladorMascota();
            listaMascotas.crearLista();
        }
        listPersonas = new ArrayList<>();
        Rol r = new Rol("Administrador");
        Cuenta c = new Cuenta("CTA1", true);
        Persona p1 = new Persona("PSN01", "CARLOS", "ORDOÑES", "GMAIL", "01", "2572220", "MEXICO", r, c);
        Persona p2 = new Persona("PSN01", "LUIS", "PEÑA", "GMAIL", "02", "2572220", "MEXICO", r, c);
        listPersonas.add(p1);
        listPersonas.add(p2);
        listaMascotas.getListaMascota().clear();
        listaMascotas.agregarMacota("m002", "lucy", 10, "perro", "doverman", "Mediano", "Macho", "Gris", p2);
        listaMascotas.agregarMacota("m002", "per", 10, "gato", "doverman", "Grande", "Hembra", "Gris", p2);
        listaMascotas.agregarMacota("m002", "lili", 10, "perro", "doverman", "Pequeño", "Macho", "Gris", p2);
        listaMascotas.agregarMacota("m002", "sesi", 10, "gato", "doverman", "Mediano", "Hembra", "Gris", p1);
        listaMascotas.agregarMacota("m002", "corvi", 10, "perro", "doverman", "Mediano", "Macho", "Gris", p1);

        if (esNumerico(jTextFieldDueno.getText()) == true) {
            int cont = 0;
            for (int i = 0; i < listPersonas.size(); i++) {
                if (listPersonas.get(i).getCedula().equals(jTextFieldDueno.getText())) {
                    cont++;
                }
            }
            if (cont != 0) {//si se encotro la cedula
                jTextFieldCI.setText(jTextFieldDueno.getText());
                lista = listaMascotas.buscarMascotas(jTextFieldDueno.getText());

                String pre = "";
                for (int i = 0; i < lista.size(); i++) {
                    pre += (i + 1) + ". " + "Nombre: " + lista.get(i).getNombre() + "\n"
                            + "Raza: " + lista.get(i).getRaza() + "\n"
                            + "Sexo: " + lista.get(i).getSexo() + "\n\n";
                }
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "****Mascotas****\n" + pre));
                try {
                    mascota = lista.get(op - 1);
                    jTextFieldNombreMascota.setText(mascota.getNombre());
                    jTextFieldSexMas.setText(mascota.getSexo());

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Persona no encontrada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void jTextFieldDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuenoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:        
        if (!jTextFieldDueno.getText().equals("")) {
            if (!jTextFieldVeterinario.getText().equals("")) {
                if (!jTextAreaMotivo.getText().equals("") && !jTextFieldPresion.getText().equals("") && !jTextFieldTemp.getText().equals("")
                        && !jTextFieldPeso.getText().equals("") && !jTextAreaDiag.getText().equals("")) {
                    java.util.Date fecha = new Date();
                    double peso = Double.parseDouble(jTextFieldPeso.getText());
                    cc.registrarConsulta(01, 01, jTextFieldPresion.getText(), Integer.parseInt(jTextFieldTemp.getText()), peso, jTextAreaMotivo.getText(), jTextAreaDiag.getText(), jTextFieldVeterinario.getText(), mascota = lista.get(op - 1), fecha);
                    JOptionPane.showMessageDialog(null, "Consulta Guardada");
                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los datos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre el veterinario es obligatorio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Es nesesario escribir un cliente");
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCIActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldCIActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConsulta dialog = new frmConsulta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRecetar;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaDiag;
    private javax.swing.JTextArea jTextAreaMotivo;
    private javax.swing.JTextField jTextFieldCI;
    private javax.swing.JTextField jTextFieldDueno;
    private javax.swing.JTextField jTextFieldNombreMascota;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPresion;
    private javax.swing.JTextField jTextFieldSexMas;
    private javax.swing.JTextField jTextFieldTemp;
    private javax.swing.JTextField jTextFieldVeterinario;
    // End of variables declaration//GEN-END:variables
}
