/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dulcestintin.modelo;

import com.dulcestintin.principal.Principal;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author toño
 */
public class Main {
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   Principal prin = new Principal();
                    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
                    //obtenemos el tamaño de la ventana  
                    Dimension ventana = prin.getSize();  
                    //para centrar la ventana lo hacemos con el siguiente calculo  
                    prin.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
                    prin.setVisible(true);
                    
            }
        });
    }
}
