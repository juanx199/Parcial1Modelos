/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelos.styles;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author JUANCA
 */
public class StyleFactory {
    private static final Map<String, TextStyle> styles = new HashMap<>();
    
    public static TextStyle getStyle(String font, int size, String color){
        String key = font + size + color; //Clave univa
        if(!styles.containsKey(key)){
            styles.put(key, new TextStyle(font, size, color));
            
        }else{
            System.out.println(" Reutilizando el estilo:" + key);
        }
        return styles.get(key);
    }
}
