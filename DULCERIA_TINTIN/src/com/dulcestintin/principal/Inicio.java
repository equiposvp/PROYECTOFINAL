package com.dulcestintin.principal;

import com.dulcestintin.controller.Conexion;
import com.dulcestintin.principal.Interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author toño
 */
public class Inicio extends javax.swing.JFrame {

    Conexion con;
    ResultSet rs;
    int ID=-1;
    /** Creates new form Inicio */
    public Inicio() {
        try {
            initComponents();
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
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBingresar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar al Sistema");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBingresar.setText("Ingresar");
        jBingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBingresarActionPerformed(evt);
            }
        });
        jPanel1.add(jBingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, 30));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, -1));

        jLabel42.setMaximumSize(new java.awt.Dimension(330, 110));
        jLabel42.setMinimumSize(new java.awt.Dimension(330, 210));
        jLabel42.setPreferredSize(new java.awt.Dimension(210, 100));
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 270, 80));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificarme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 250));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo azul.jpg"))); // NOI18N
        jLabel22.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel22.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel22.setName(""); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -44, 610, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 340));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Realizado por:\n\n JUAN ANTONIO VAZQUEZ VALENZUELA \n SISTEMA DE PUNTO DE VENTAS\n\n 2015");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrarla?","Cerrar aplicación",1)==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jBingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBingresarActionPerformed
         
        // BOTON PARA INGRESAR AL SISTEMA
        
        // se obtiene los valores de los cuadros de texto
        String usuario=txtUser.getText();
           String pass=txtPass.getText();
           
           String nom="",password="",id="",nivel="";
        String nombre = null;
        String ap = null;
        String am = null;
           
           // se valida que no esten vacios
           if(usuario.equals("") || pass.equals(""))
               {
                JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
               }
           else{

               
               
               try {
                   // se hace la conexion con la base de datos
            con = new Conexion();
            
            //sentencia sql para extraer los datos del usuario insertado
           String sql = "select * from usuarios where user='"+usuario+"';";
           
                      
           rs = con.Consulta(sql); 
           
       // se obtienen los datos de la consulta
         
                while (rs.next()){
                    id = rs.getString(1);
                     nombre= rs.getString(2);
                    ap= rs.getString(3);
                    am = rs.getString(4);
                    nom = rs.getString(5);
                    password = rs.getString(6);
                    nivel= rs.getString(7);
                }
                if (id.equals("")) {
           
               JOptionPane.showMessageDialog(null,"Usuario No Encontrado");
                    txtUser.setText("");
                    txtPass.setText("");
           
           }
           else{
                ID = Integer.parseInt(id);
                int N = Integer.parseInt(nivel);
                
         
                // se compara que el usuario de la base de datos es el mismo que el insertado
                //se comparan ambas contraseñas encriptadas
                
                if(nom.equals(usuario)){
                    if(pass.equals(password)){
                    // se compara si el estatus es igual a TRUE
                    if(N==0){
                        //se carga la segunda interfaz
                        Interface inter = new Interface();
                        
                        inter.setId(id);
                        inter.setC();
                        inter.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Administrador");
                        inter.setVisible(true); 
                        this.dispose();
                    }
                    if(N==1){
                        //se carga la segunda interfaz
                        Vendedor vende = new Vendedor();
                        vende.setId(id);
                        vende.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Vendedor");
                        vende.setVisible(true); 
                        this.dispose();
                    }
                    if(N==2){
                        //se carga la segunda interfaz
                        Capturista cap = new Capturista();
                        cap.setId(id);
                        cap.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Capturista");
                        cap.setVisible(true); 
                        this.dispose();
                    }
  
                }
                    else{
                    
                        JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
                        txtUser.setText("");
                        txtPass.setText("");
                    }
                }
                // en caso de que esten mal los datos
                else{
                    JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecta");
                    txtUser.setText("");
                    txtPass.setText("");
                }
                
      
           }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
               
               

               }

    }//GEN-LAST:event_jBingresarActionPerformed

private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
int evento=evt.getKeyCode();
        int N;
if(evento==10 ){
      String usuario=txtUser.getText();
           String pass=txtPass.getText();
           
           String nom="",password="",id="",nivel="",nombre="", ap="",am="";
           
           // se valida que no esten vacios
           if(usuario.equals("") || pass.equals(""))
               {
                JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
               }
           else{

               
               
               try {
                   // se hace la conexion con la base de datos
            con = new Conexion();
            
            //sentencia sql para extraer los datos del usuario insertado
           String sql = "select * from usuarios where user='"+usuario+"';";
           
                      
           rs = con.Consulta(sql); 
       // se obtienen los datos de la consulta
         
                while (rs.next()){
                    id = rs.getString(1);
                    nombre= rs.getString(2);
                    ap= rs.getString(3);
                    am = rs.getString(4);
                    nom = rs.getString(5);
                    password = rs.getString(6);
                    nivel= rs.getString(7);
                }
                if (id.equals("")) {
           
               JOptionPane.showMessageDialog(null,"Usuario No Encontrado");
                    txtUser.setText("");
                    txtPass.setText("");
           
           }
           else{
                ID = Integer.parseInt(id);
                N = Integer.parseInt(nivel);
             
              
                if(nom.equals(usuario) && pass.equals(password)){
                    // se compara si el estatus es igual a TRUE
                    if(N==0){
                        //se carga la segunda interfaz
                        Interface inter = new Interface();
                        inter.setId(id);
                        inter.setC();
                        inter.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Administrador");
                        inter.setVisible(true); 
                        this.dispose();
                    }
                    if(N==1){
                        //se carga la segunda interfaz
                        Vendedor vende = new Vendedor();
                        vende.setId(id);
                        vende.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Vendedor");
                        vende.setVisible(true); 
                        this.dispose();
                    }
                    if(N==2){
                        //se carga la tercera interfaz
                        Capturista cap = new Capturista();
                        cap.setId(id);
                        cap.IDusuario = ID;
                        JOptionPane.showMessageDialog(rootPane, "Bienvenid@ "+nombre+" "+ap+" "+am+" \n\n Has entrado al sistema como: Capturista");
                        cap.setVisible(true); 
                        this.dispose();
                    }
                   
                   
                }
                
                // en caso de que esten mal los datos
                else{
                    JOptionPane.showMessageDialog(rootPane,"Contraseña Incorrecta");
                    txtUser.setText("");
                    txtPass.setText("");
                    
                }
                
                }
          
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
               
               

               }

    
}  
}//GEN-LAST:event_txtPassKeyPressed

    /**
    * @param args the command line arguments
    */
    
 public static void main(String args[]) {
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
