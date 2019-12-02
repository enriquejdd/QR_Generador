/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class VentanaResultado extends JFrame{
    
    private JLabel resultado;
    
    // Constructor
    public VentanaResultado(String fichero){
        // Título de la ventana
        this.setTitle(fichero);
        
        //No se redimensiona
        this.setResizable(false);
        
        //Dimension permite guardar informacion de la pantalla
        Dimension tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        
        //Establecemos posicion y tamaño de la ventana
        this.setBounds(tamanioPantalla.width/2, WIDTH, QR.ANCHO_QR, QR.ALTO_QR);
    }
    
}
