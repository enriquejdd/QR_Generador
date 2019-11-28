/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Panel extends JPanel{
    
    // Tamaño de la ventana. Constantes
    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 200;
    
    // Atributos del panel
    private JLabel labelUrl, labelFichero;
    private JTextField txtUrl, txtFichero;
    private JButton btnGenerar, btnCerrar;
    
    // Constructor
    public Panel(){
        // Establecer el layout del panel
        // Forma de disponer los elementos internamente
        this.setLayout(new FlowLayout());
        
        // Estableceos color de fondo al panel
        this.setBackground(Color.gray);
        
        // tamaño del panel
        this.setSize(ANCHO_PANEL, ALTO_PANEL);
        
        inicializarComponentes();
    }
    
     private void inicializarComponentes(){
        // Añade la etiqueta para introducir la URL
        labelUrl = new JLabel("Introduce la URL o el texto");
        this.add(labelUrl);
         
        // Añade el campo de texto ara poner la URL
        txtUrl = new JTextField(40);
        this.add(txtUrl);
         
        // Añade la etique para indicar el nombre del fichero
        labelFichero = new JLabel("Indica el nombre del fichero");
        this.add(labelFichero);
         
        // Añade el campo de texto ara poner el nombre del Fichero
        txtFichero = new JTextField(20);
        this.add(txtFichero);
         
        // Generamos los 2 botones
        // Añadimos el botón de generar QR
        btnGenerar = new JButton("Generar cógido QR");
        this.add(btnGenerar);
         
        // Añadimos el botón de Cerrar
        btnCerrar = new JButton("Salir");
        this.add(btnCerrar);
     }
}
