/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class Panel extends JPanel{
    
    // Tamaño de la ventana. Constantes
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;
    
    // Atributos del panel
    private JLabel labelUrl, labelFichero;
    private JTextArea txtUrl, txtFichero;
    private JButton btnGenerar, btnCerrar;
    
}
