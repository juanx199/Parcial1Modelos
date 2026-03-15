/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1modelos.main;

import parcial1.modelos.styles.StyleFactory;
import parcial1.modelos.styles.TextStyle;
import parcial1.modelos.exporters.PDFExporter;
import parcial1.modelos.exporters.Exporter;
/**
 *
 * @author JUANCA
 */
public class Main {

    public static void main(String[] args) {
        //prueba peso ligero
        TextStyle s1 = StyleFactory.getStyle("Arial", 12 , "Rojo");
        TextStyle s2 = StyleFactory.getStyle("Arial", 12 , "Rojo"); //Debería decir que se reutiliza
    }
    
}
