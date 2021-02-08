/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Personal
 */
public class frmFactura extends javax.swing.JDialog implements Printable {

    DefaultTableModel model = new DefaultTableModel();

    /**
     * parte para la integracion de ls servicios solo
     */
    public frmFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fecha.setText(fechaactual());
        txtdecuento.setText("0");

    }

    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");

        return formatofecha.format(fecha);

    }

    //@Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {

        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX(), pagfor.getImageableY());
        hub.scale(0.5, 0.5);
        // lo que se va  a imprimir 
        jPanel1.printAll(graf);

        return PAGE_EXISTS;

    }

    public void escoderAparecer(boolean bl) {
        jPanel4.setVisible(bl);
        metodopago.setVisible(bl);
        jButtonbuscar.setVisible(bl);
        jComboBox2.setVisible(bl);
        jButtonimprimir.setVisible(bl);
        jButtoncancelar.setVisible(bl);
        jButtonatras.setVisible(bl);

    }

    public void guardar() {

    }

    public void imprimir() {
        try {
            PrinterJob g = PrinterJob.getPrinterJob();
            g.setPrintable(this);
            boolean top = g.printDialog();//para ve el como la enta na de imprimir 
            // si se pone acpatr se vuelve 1
            if (top) {
                g.print();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRROR DE¨PROGRAMA ", "ERROR" + e, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void controldescuento() {
        if (Integer.parseInt(txtdecuento.getText()) <= 100) {
            return;
        } else {

            txtdecuento.setText("100");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabledescribcion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        textdescribcion = new javax.swing.JTextField();
        jButtonbuscarservicio = new javax.swing.JButton();
        jButtonagregar = new javax.swing.JButton();
        jButtoneliminar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        textcantidad = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        textcodigo = new javax.swing.JTextField();
        textprecio = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButtonimprimir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLnombre = new javax.swing.JLabel();
        jtextnombre = new javax.swing.JTextField();
        jlabeldireccion = new javax.swing.JLabel();
        jTextdireccion = new javax.swing.JTextField();
        jLabelcorreo = new javax.swing.JLabel();
        jTextcorreo = new javax.swing.JTextField();
        jLabelcedula = new javax.swing.JLabel();
        jTextcedula = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jButtonbuscar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtnumerofactura = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        metodopago = new javax.swing.JLabel();
        jButtonatras = new javax.swing.JButton();
        jButtoncancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtdecuento = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabledescribcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cant.", "Descripción", "Precio unitario", "Precio total"
            }
        ));
        jScrollPane2.setViewportView(jTabledescribcion);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Descripción");

        textdescribcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdescribcionActionPerformed(evt);
            }
        });

        jButtonbuscarservicio.setText("Buscar");
        jButtonbuscarservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarservicioActionPerformed(evt);
            }
        });

        jButtonagregar.setText("Agregar");
        jButtonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarActionPerformed(evt);
            }
        });

        jButtoneliminar.setText("Eliminar");
        jButtoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneliminarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Cantidad");

        textcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcantidadActionPerformed(evt);
            }
        });
        textcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textcantidadKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Código");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Precio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textdescribcion, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(textprecio))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonbuscarservicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtoneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textcantidad)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(textdescribcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonbuscarservicio)
                    .addComponent(jButtonagregar)
                    .addComponent(jButtoneliminar)
                    .addComponent(jLabel21)
                    .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        jButtonimprimir.setText("Imprimir");
        jButtonimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonimprimirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnombre.setText("Nombre y apellidos  ");

        jtextnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextnombreActionPerformed(evt);
            }
        });

        jlabeldireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabeldireccion.setText("Dirección");

        jLabelcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcorreo.setText("Correo");

        jLabelcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcedula.setText("Cedula");

        jTextcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcedulaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Fecha ");

        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha.setText("mm-dd-aa");

        jButtonbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jButtonbuscar.setText(" Cliente");
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabeldireccion)
                            .addComponent(jLabelcorreo)
                            .addComponent(jLabelcedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextcedula)
                            .addComponent(jTextcorreo)
                            .addComponent(jTextdireccion))))
                .addGap(18, 18, 18)
                .addComponent(jButtonbuscar)
                .addGap(30, 30, 30)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLnombre)
                                    .addComponent(jtextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlabeldireccion)
                                    .addComponent(jTextdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonbuscar))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelcorreo)
                            .addComponent(jTextcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(58, 58, 58)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcedula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo" }));

        txtnumerofactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumerofactura.setText("_________");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Factura N°:");

        metodopago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metodopago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banknotespaymentmoney_billetesdebanco_pag_3773.png"))); // NOI18N
        metodopago.setText("Metodo de pago  ");

        jButtonatras.setText("Atrás");

        jButtoncancelar.setText("Cancelar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Subtotal $");

        jLabel17.setText("Descuento %");

        jLabel18.setText("Total $");

        txtdecuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdecuentoActionPerformed(evt);
            }
        });
        txtdecuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdecuentoKeyTyped(evt);
            }
        });

        jLabel29.setText("Iva");

        txttotal.setText(" ");
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtiva)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdecuento)
                            .addComponent(txttotal))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtdecuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnumerofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(metodopago)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonimprimir)
                .addGap(18, 18, 18)
                .addComponent(jButtoncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonatras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtnumerofactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(metodopago)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonimprimir)
                            .addComponent(jButtoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonatras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbuscarservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonbuscarservicioActionPerformed

    private void jTextcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcedulaActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void jtextnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextnombreActionPerformed

    private void textcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcantidadActionPerformed

    private void textcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcantidadKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_textcantidadKeyTyped

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed
        // abrir la ventana de busqueda

    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void jButtonimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonimprimirActionPerformed
        controldescuento();
        
        frmVuelto vuelto = new frmVuelto(new javax.swing.JDialog(), true);
        vuelto.setTotal(txttotal.getText());
        vuelto.setVisible(true);
        //ocultamos los paneles y botones para que no aparecan al imprimir 
        escoderAparecer(false);
        //metodo para la impresion de panel 
        imprimir();
        //mostramos otra vez los que se escondio
        escoderAparecer(false);
        //neviamos los datos de la factura a jpanel para imprimirlo
        ;
    }//GEN-LAST:event_jButtonimprimirActionPerformed

    private void txtdecuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdecuentoKeyTyped

        if (txtdecuento.getText().length() >= 5) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtdecuento.getText().contains(".")) {
            evt.consume();
        }

    }//GEN-LAST:event_txtdecuentoKeyTyped

    private void txtdecuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdecuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdecuentoActionPerformed

    private void jButtonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarActionPerformed
        //psamos los campos llenados 
        textprecio.getText();
        textcodigo.getText();
        textdescribcion.getText();
        textcantidad.getText();


    }//GEN-LAST:event_jButtonagregarActionPerformed

    private void jButtoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoneliminarActionPerformed

    private void textdescribcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdescribcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdescribcionActionPerformed

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
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmFactura dialog = new frmFactura(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButtonagregar;
    private javax.swing.JButton jButtonatras;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtonbuscarservicio;
    private javax.swing.JButton jButtoncancelar;
    private javax.swing.JButton jButtoneliminar;
    private javax.swing.JButton jButtonimprimir;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabelcedula;
    private javax.swing.JLabel jLabelcorreo;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabledescribcion;
    private javax.swing.JTextField jTextcedula;
    private javax.swing.JTextField jTextcorreo;
    private javax.swing.JTextField jTextdireccion;
    private javax.swing.JLabel jlabeldireccion;
    private javax.swing.JTextField jtextnombre;
    private javax.swing.JLabel metodopago;
    private javax.swing.JTextField textcantidad;
    private javax.swing.JTextField textcodigo;
    private javax.swing.JTextField textdescribcion;
    private javax.swing.JTextField textprecio;
    private javax.swing.JTextField txtdecuento;
    private javax.swing.JTextField txtiva;
    private javax.swing.JLabel txtnumerofactura;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
