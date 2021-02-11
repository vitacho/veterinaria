/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PersonaDB;
import Modelo.Cuenta;
import Modelo.Persona;
import Modelo.Rol;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Personal
 */
public class frmListaPersonas extends javax.swing.JDialog {

    /**
     * Creates new form BuscarPersona
     */
    PersonaDB listaPersonas;
    boolean esCliente;
    public frmListaPersonas(java.awt.Frame parent, boolean modal,boolean esCli) {
        super(parent, modal);
        initComponents();
        esCliente=esCli;
        quemarDatosPrueba();//datos para pruebas sin bd
        jRBuscarCedula.setToolTipText("Seleccione para buscar por cedula");
        jRBuscarNombre.setToolTipText("Seleccione para buscar por nombre");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jRBuscarNombre = new javax.swing.JRadioButton();
        jRBuscarCedula = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextIngresarBusqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1958, 1080));
        setPreferredSize(new java.awt.Dimension(1145, 639));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 100, 30));

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 90, 30));

        jLTitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLTitulo.setText("LISTA DE PERSONAS");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 380, -1));

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "DIRECCION", "TELÉFONO"
            }
        ));
        jScrollPane1.setViewportView(jTablePersonas);
        if (jTablePersonas.getColumnModel().getColumnCount() > 0) {
            jTablePersonas.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 844, 325));

        jRBuscarNombre.setOpaque(false);
        jRBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBuscarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jRBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 30, 30));

        jRBuscarCedula.setOpaque(false);
        jRBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBuscarCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jRBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, 30));

        jTextIngresarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIngresarBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIngresarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 310, 30));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Número de Cédula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOP1.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIngresarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIngresarBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIngresarBusquedaActionPerformed

    private void jRBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBuscarCedulaActionPerformed
        // TODO add your handling code here:
        jRBuscarNombre.setSelected(false);
        jRBuscarNombre.disable();
        
    }//GEN-LAST:event_jRBuscarCedulaActionPerformed

    private void jRBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBuscarNombreActionPerformed
        // TODO add your handling code here:
        jRBuscarCedula.setSelected(false);
        jRBuscarCedula.disable();
    }//GEN-LAST:event_jRBuscarNombreActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        buscarPersona();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        modificarPersona();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed
    
    public void buscarPersona(){
        limpiarTabla();
        if(!jTextIngresarBusqueda.getText().equals("")){
            if(jRBuscarCedula.isSelected()==true){
                if(listaPersonas.validarBusquedaPorCedula(jTextIngresarBusqueda.getText())){
                    ArrayList<Persona> lista = new ArrayList<>();
                    Persona p = listaPersonas.buscarPersonaPorCedula(jTextIngresarBusqueda.getText());
                    lista.add(p);
                    llenarTabla(lista);
                    lista.clear();
                }else{
                     JOptionPane.showMessageDialog(null, "PERSONA NO ENCONTRADA");
                }  
            }else if(jRBuscarNombre.isSelected()==true){
                if(listaPersonas.validarBusquedaPorNombre(jTextIngresarBusqueda.getText())){
                    ArrayList<Persona> lista = new ArrayList<>();
                    lista.clear();
                    for (Persona persona : listaPersonas.buscarPersonaPorNombre(jTextIngresarBusqueda.getText())) {
                        lista.add(persona);
                    }
                    llenarTabla(lista);
                }else{
                     JOptionPane.showMessageDialog(null, "PERSONA NO ENCONTRADA");
                } 
                
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION DE BUSQUEDA");
            }
        }else{
            JOptionPane.showMessageDialog(null, "INGRECE EL DATO DE BUSQUEDA");
        }
        jRBuscarCedula.enable();
        jRBuscarNombre.enable();
                          
    }
    
    public void modificarPersona(){
        if(jTablePersonas.getSelectedRow()>=0){
            DefaultTableModel modelo = (DefaultTableModel) jTablePersonas.getModel();
            String cedula = (String) modelo.getValueAt(jTablePersonas.getSelectedRow(), 0);
            String a="";
            if(esCliente)a=" true";
            System.out.println(cedula+" "+a);
            frmPersona modificarP = new frmPersona(new javax.swing.JFrame(), false, esCliente, true, cedula);
            this.setVisible(false);
            modificarP.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
        }
    }
    public void llenarTabla(ArrayList<Persona> lista){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CEDULA","NOMBRE","APELLIDO","DIRECCION","TELEFONO"},lista.size());
        jTablePersonas.setModel(modelo);
        TableModel modeloDatos = jTablePersonas.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Persona persona= lista.get(i);
            modeloDatos.setValueAt(persona.getCedula(), i, 0);
            modeloDatos.setValueAt(persona.getNombre(), i, 1);
            modeloDatos.setValueAt(persona.getApellido(), i, 2);
            modeloDatos.setValueAt(persona.getDireccion(), i, 3);
            modeloDatos.setValueAt(persona.getTelefono(), i, 4);
        }
    }
    
    public void limpiarTabla(){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"CEDULA","NOMBRE","APELLIDO","DIRECCION","TELEFONO"},0);
        jTablePersonas.setModel(modelo);
        jTablePersonas.updateUI();
    }
    
    public void quemarDatosPrueba(){
         if(listaPersonas==null){
            listaPersonas = new PersonaDB();
            listaPersonas.crearLista();
        }
        Rol rol = new Rol("Cliente");
        Cuenta cuenta = new Cuenta("CTA1", true);
        String nombre = "Carlos";
        String apellido = "Lopez";
        String correo = "@";
        String telefono = "1324242";
        String direccion = "loja";
        listaPersonas.agregarPersona("P01",nombre, "Perez", correo, "01", telefono, direccion, rol, cuenta);
        listaPersonas.agregarPersona("P02","Carlos", apellido, correo, "02", telefono, direccion, rol, cuenta);
        listaPersonas.agregarPersona("P01",nombre, apellido, correo, "03", telefono, direccion, rol, cuenta);
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
            java.util.logging.Logger.getLogger(frmListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmListaPersonas dialog = new frmListaPersonas(new javax.swing.JFrame(), true,false);
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
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBuscarCedula;
    private javax.swing.JRadioButton jRBuscarNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JTextField jTextIngresarBusqueda;
    // End of variables declaration//GEN-END:variables
}
