/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelos.exporters;

/**
 *
 * @author JUANCA
 */
public class HTMLExporter implements Exporter {
    @Override
    public void export(String title, String content){
        System.out.println("<html>");
        System.out.println("<head><title>" +  title + "</title></head>");
        System.out.println("<body><p>" + content + "</p></body>");
        System.out.println("</html>");
    }
    
}
