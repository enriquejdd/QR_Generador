/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class QR {
    // Atributos de clase
    public static final int ANCHO_QR = 400;
    public static final int ALTO_QR = 400;
    
    // Este método genera un archivo en el disco duro con el nombre que
    // se indica en la varibale "fichero". El texto que codifica está contenido en
    // "texto" y el formato de imagen puede ser jpeg, tiff, gif, png.
    
    public static void escribirQR(String texto, String fichero, String formatoImagen){
        
        // Objeto QRCodeWriter
        // Renderiza un Código QR como una matriz de dos dimensiones (bitMatrix)
        
        QRCodeWriter qrcw = new QRCodeWriter();
        
        BitMatrix matrizPuntos = null;
        // FileOutputStream escribe en un fichero un flujo de bytes
        FileOutputStream ficheroSalida = null;
        
        try{
            //
            matrizPuntos = qrcw.encode(texto, BarcodeFormat.QR_CODE, ANCHO_QR, ALTO_QR);
            
            ficheroSalida = new FileOutputStream(new File(fichero));
            
            MatrixToImageWriter.writeToStream(matrizPuntos, formatoImagen , ficheroSalida);
            
        } catch (WriterException ex){
            JOptionPane.showMessageDialog(null, "El contenido no puede ser codificado");
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Problemas durante la creación del fichero");
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Problemas con la escritura");
    }
}
}
