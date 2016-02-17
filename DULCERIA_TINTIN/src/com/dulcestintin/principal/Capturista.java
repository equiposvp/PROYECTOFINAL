package com.dulcestintin.principal;
import com.dulcestintin.controller.Conexion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTextField;
import java.lang.Object;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author toño
 */
public class Capturista extends javax.swing.JFrame {
Conexion con,query;
    ResultSet rs;
    ResultSet rs2;
    public  int IDusuario;
    static int j=0; 
    static String aux3;
    static float total=0;
   public static String id,cad;
    /** Creates new form Capturista */
    public Capturista() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTdd = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTexistencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTespecificaciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTdescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTyyyy = new javax.swing.JTextField();
        jTmm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTbcaducidad = new javax.swing.JTextField();
        jTbprecio = new javax.swing.JTextField();
        jTbexistencia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jBmodificar1 = new javax.swing.JButton();
        dc1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTproducto = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTbdescripcion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbuscar = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTbespecificaciones = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTbdescripcion2 = new javax.swing.JTextArea();
        jTID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTbnombre1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTbnombre2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia \"Las Lomas\" // Interfaz Capturista");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Existencia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("DD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre del Producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Especificaciones: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));
        jPanel1.add(jTdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 20, -1));
        jPanel1.add(jTprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, -1));

        jTexistencia.setToolTipText("");
        jTexistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jTexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 70, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Precio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 150, 40));

        jTespecificaciones.setColumns(20);
        jTespecificaciones.setRows(5);
        jScrollPane1.setViewportView(jTespecificaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 230, 180));

        jTdescripcion.setColumns(20);
        jTdescripcion.setRows(5);
        jTdescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTdescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 230, 180));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Descripcion:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 800, 410));
        jPanel1.add(jTyyyy, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, -1));
        jPanel1.add(jTmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 20, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Caducidad:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("YYYY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("MM");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo azul.jpg"))); // NOI18N
        jLabel30.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel30.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel30.setName(""); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 720));

        jTabbedPane1.addTab("Agregar", null, jPanel1, "Agregar un Producto");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Busqueda por Nombre:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Existencia:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Caducidad:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Especificaciones:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jTbcaducidad.setEditable(false);
        jTbcaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbcaducidadActionPerformed(evt);
            }
        });
        jPanel4.add(jTbcaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 130, -1));

        jTbprecio.setEditable(false);
        jPanel4.add(jTbprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, -1));

        jTbexistencia.setEditable(false);
        jPanel4.add(jTbexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 110, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Precio:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jBmodificar1.setText("Modificar");
        jBmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 120, 40));

        dc1.setText("Desbloquear Campos");
        dc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc1ActionPerformed(evt);
            }
        });
        jPanel4.add(dc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 190, 40));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Nombre Producto:");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jTproducto.setEditable(false);
        jPanel4.add(jTproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 220, -1));

        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 800, 340));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Descripción:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jTbdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbdescripcionKeyPressed(evt);
            }
        });
        jPanel4.add(jTbdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 220, -1));

        jTbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTbuscar.setColumnSelectionAllowed(true);
        jTbuscar.getTableHeader().setReorderingAllowed(false);
        jTbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbuscarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTbuscar);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 700, 200));

        jTbespecificaciones.setColumns(20);
        jTbespecificaciones.setEditable(false);
        jTbespecificaciones.setRows(5);
        jScrollPane7.setViewportView(jTbespecificaciones);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 230, 170));

        jTbdescripcion2.setColumns(20);
        jTbdescripcion2.setEditable(false);
        jTbdescripcion2.setRows(5);
        jScrollPane8.setViewportView(jTbdescripcion2);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 230, 170));

        jTID.setEditable(false);
        jTID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, -1));

        jLabel12.setText("ID Admin:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 20));

        jTbnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbnombre1ActionPerformed(evt);
            }
        });
        jTbnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbnombre1KeyPressed(evt);
            }
        });
        jPanel4.add(jTbnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jLabel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 800, 330));

        jTbnombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbnombre2KeyPressed(evt);
            }
        });
        jPanel4.add(jTbnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Busqueda por Descripcion:");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 700));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo azul.jpg"))); // NOI18N
        jLabel31.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel31.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel31.setName(""); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 720));

        jTabbedPane1.addTab("Buscar/Modificar", null, jPanel3, "Buscar Producto y Modificarlo");

        jMenu2.setText("Info");

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed

    //BOTON PARA AGREGAR UN PRODUCTO A LA BASE DE DATOS




    
        int aux=0;

        // validaciones para saber que no se deja algun campo en limpio
        if (jTnombre.getText().equals("")||jTyyyy.getText().equals("")||jTprecio.getText().equals("")
                ||jTexistencia.getText().equals("")||jTdescripcion.getText().equals("")||jTespecificaciones.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");

        }

        else

        {
            try {
                // se comienza la conexion con la base de datos
    try {
                con = new Conexion();


            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
            //se obtienen los valores de los jTextField
                String nombre = jTnombre.getText();
                String caducidad = jTyyyy.getText()+"-"+jTmm.getText()+"-"+jTdd.getText();
                String existencia = jTexistencia.getText();
                String precio = jTprecio.getText();
                String descripcion = jTdescripcion.getText();
                String especifica = jTespecificaciones.getText();
 

                //sentencias sql para insertar los datos en la base de datos
                String sql = "INSERT INTO `productos`(`nombre_producto`, `precio`, `caducidad`, `existencia`, `descripcion`, `especificaciones`) VALUES ('"+nombre+"','"+precio+"','"+caducidad+"','"+existencia+"','"+descripcion+"','"+especifica+"')";
                
                //funcion para ejecutar la query
                con.ejecutar(sql);

               JOptionPane.showMessageDialog(null, "Producto: "+nombre+" agregado.");

            
                jTnombre.setText("");
                jTprecio.setText("");
                jTyyyy.setText("");
                jTmm.setText("");
                jTdd.setText("");
                jTexistencia.setText("");
                jTdescripcion.setText("");
                jTespecificaciones.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
}//GEN-LAST:event_jBagregarActionPerformed

private void jTbcaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbcaducidadActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTbcaducidadActionPerformed

private void jBmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificar1ActionPerformed
//BOTON PARA MODIFICAR LOS DATOS DE UN PRODUCTO EN LA BASE DE DATOS

 // validaciones para saber que no se deja algun campo en limpio
        if (jTproducto.getText().equals("")||jTbcaducidad.getText().equals("")||jTbprecio.getText().equals("")
                ||jTbexistencia.getText().equals("")||jTbdescripcion2.getText().equals("")||jTbespecificaciones.getText().equals(""))
        {

            JOptionPane.showMessageDialog(null, "Faltan Datos: No Puede Dejar Cuadros en Blanco");

        }

        else

        {
    // por si se da clic antes de hacer la busqueda
    // se validan los textfield

    String producto = jTproducto.getText();
    String precio = jTbprecio.getText();
    String caducidad = jTbcaducidad.getText();
    String existe = jTbexistencia.getText();
    String descri = jTbdescripcion2.getText();
    String especi = jTbespecificaciones.getText();


            try {
                //se crea la conexion y las consultas
                con = new Conexion();
                
                int id2 = Integer.parseInt(id);
                // se crea la sentecia sql y se ejecuta para hacer la modificacion
                 String modifica = "UPDATE `productos` SET `nombre_producto`='"+producto+"',`precio`='"+precio+"',`caducidad`='"+caducidad+"',`existencia`='"+existe+"',`descripcion`='"+descri+"',`especificaciones`='"+especi+"' WHERE id_producto = '"+id2+"'";
                 con.ejecutar(modifica);
                JOptionPane.showMessageDialog(null, "Datos Actualizados");


            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}//GEN-LAST:event_jBmodificar1ActionPerformed

private void dc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc1ActionPerformed

    jTproducto.setEditable(true);
    jTbprecio.setEditable(true);
    jTbcaducidad.setEditable(true);
    jTbexistencia.setEditable(true);
    jTbdescripcion2.setEditable(true);
    jTbespecificaciones.setEditable(true);
}//GEN-LAST:event_dc1ActionPerformed

private void jTbdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbdescripcionKeyPressed
 
    
    try {
            // se comienza la conexion con la base de datos
        try {
                    con = new Conexion();


                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        String nom= jTbdescripcion.getText();
        String sql ="SELECT * FROM productos WHERE nombre_producto LIKE '"+nom+"%'";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+jTbdescripcion.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        this.jTbuscar.setModel(buscar);
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
          }
          buscar.addRow(fila);
 }
 
 
                
                
                
                
                
                
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    
            
           
}//GEN-LAST:event_jTbdescripcionKeyPressed

private void jTbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscarMouseClicked
int Opcion=this.jTbuscar.getSelectedRow();
        //muestra el no. de renglon
       // JOptionPane.showMessageDialog(rootPane,Opcion);
        id =  jTbuscar.getValueAt(Opcion,0).toString();
        this.jTproducto.setText(this.jTbuscar.getValueAt(Opcion, 1).toString());
        this.jTbprecio.setText(this.jTbuscar.getValueAt(Opcion, 2).toString());
        this.jTbcaducidad.setText(this.jTbuscar.getValueAt(Opcion, 3).toString());
        this.jTbexistencia.setText(this.jTbuscar.getValueAt(Opcion, 4).toString());
        this.jTbdescripcion2.setText(this.jTbuscar.getValueAt(Opcion, 5).toString());
        this.jTbespecificaciones.setText(this.jTbuscar.getValueAt(Opcion, 6).toString());
           
}//GEN-LAST:event_jTbuscarMouseClicked

private void jTbnombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbnombre1KeyPressed
try {
            // se comienza la conexion con la base de datos
        try {
                    con = new Conexion();


                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        String nom= jTbnombre1.getText();
        String sql ="SELECT * FROM productos WHERE nombre_producto LIKE '%"+nom+"%'";
        rs = con.Consulta(sql);
        
        if(rs==null)
            JOptionPane.showMessageDialog(null, "No se encontro: "+jTbnombre1.getText()+" en la base de datos.");
        
         //Para establecer el modelo al JTable
 
        DefaultTableModel buscar = new DefaultTableModel(){
                        @Override
        public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
        }};
        this.jTbuscar.setModel(buscar);
        
        //Obteniendo la informacion de las columnas que estan siendo consultadas
         ResultSetMetaData rsMd = rs.getMetaData();
         //La cantidad de columnas que tiene la consulta
         int cantidadColumnas = rsMd.getColumnCount();
         //Establecer como cabezeras el nombre de las colimnas
         for (int i = 1; i <= cantidadColumnas; i++) {
          buscar.addColumn(rsMd.getColumnLabel(i));
         }
        
        
        while (rs.next()) {
          Object[] fila = new Object[cantidadColumnas];
  
          for (int i = 0; i < cantidadColumnas; i++) {
             
            fila[i]=rs.getObject(i+1);
          }
          buscar.addRow(fila);
 }
 
 
                
                
                
                
                
                
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
}//GEN-LAST:event_jTbnombre1KeyPressed

private void jTbnombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbnombre2KeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_jTbnombre2KeyPressed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Realizado por:\n\n JUAN ANTONIO VAZQUEZ VALENZUELA");
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    if(JOptionPane.showConfirmDialog(rootPane, "Esta seguro de cerrar la sesion actual?","Cerrar sesión",1)==0){
        
        this.dispose();
        Inicio ini = new Inicio();
        Dimension pantall = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventan = ini.getSize();  
        //para centrar la ventana lo hacemos con el siguiente calculo  
        ini.setLocation((pantall.width - ventan.width) / 2, (pantall.height - ventan.height) / 2);
        ini.setVisible(true);

    }
    
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrar el Sistema?","Cerrar Sistema",1)==0){
            System.exit(0);
        }
}//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTbnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbnombre1ActionPerformed
public void setId(String id){
        String id2 = id;
    jTID.setText(id);
  
}
public void getT(String cad){
    aux3 = cad;
    System.out.println(aux3);
}

public void setT(String cad){
        String aux2 = cad;

}

public String getId(){
    cad = jTID.getText();
    return cad;
}
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dc1;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTID;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTbcaducidad;
    private javax.swing.JTextField jTbdescripcion;
    private javax.swing.JTextArea jTbdescripcion2;
    private javax.swing.JTextArea jTbespecificaciones;
    private javax.swing.JTextField jTbexistencia;
    private javax.swing.JTextField jTbnombre1;
    private javax.swing.JTextField jTbnombre2;
    private javax.swing.JTextField jTbprecio;
    private javax.swing.JTable jTbuscar;
    private javax.swing.JTextField jTdd;
    private javax.swing.JTextArea jTdescripcion;
    private javax.swing.JTextArea jTespecificaciones;
    private javax.swing.JTextField jTexistencia;
    private javax.swing.JTextField jTmm;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTproducto;
    private javax.swing.JTextField jTyyyy;
    // End of variables declaration//GEN-END:variables
}
