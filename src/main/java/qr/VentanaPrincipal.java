/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */

// Clase que hereda de JFrame
// Automaticamente la clase VEntanaPricnipal tiene todos
// los atributos y métodos de JFrame.
public class VentanaPrincipal extends JFrame{
    
    // Tamaño de la ventana. Constantes
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;
    
    // Atributo. Cuando un objeto de una clase está contenido 
    // como atributo de otra se conoce como Composición.
    private Panel panel;
    
    // Construcotor
    public VentanaPrincipal(){
        crearVentana();
        panel = new Panel();
        
        //Añade el panel a la ventana
        this.add(panel);
    }
    
    // Método privado (no se puede usar en otra clase)
    private void crearVentana(){
        // Posición y tamaño de la ventana
        this.setBounds(400, 150, ANCHO_FRAME, ALTO_FRAME);
        
        // Título a la ventana
        this.setTitle("Generador de códigos QR");
        
        // Ventana no redimensionable
        this.setResizable(false);
        
        // Cerrar progrma al pulsar el aspa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Hacer visible la ventana
        this.setVisible(true);
    }
    
}
