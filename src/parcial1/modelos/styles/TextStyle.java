/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelos.styles;

/**
 *
 * @author JUANCA
 */
public class TextStyle {
    private final String font;
    private final int size;
    private final String color;
    
    public TextStyle(String font, int size, String color){
        this.font = font;
        this.size = size;
        this.color = color;
        
    }
    public void printStyle(){
        System.out.println("[Estulo: " + font + "\n TTamaño: " + size + "\n Color: " + color + "]");
    }
    @Override
    public String toString(){
        return font + size + color;
    }
}
