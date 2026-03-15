/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelos.exporters;

/**
 *
 * @author JUANCA
 */
public class PDFExporter implements Exporter{
    
    @Override
    public void export(String title, String content){
        System.out.println("Generando archivo PDF....");
        System.out.println("Título: " + title.toUpperCase());
        System.out.println("Contendio: " + content);
    }
    
}
