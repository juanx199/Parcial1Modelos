/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelos.security;

/**
 *
 * @author JUANCA
 */
public class Usuario {
    private String nombre;
    private String rol; //Admin o usuario
    
    public Usuario(String nombre, String rol){
        this.nombre = nombre;
        this.rol = rol;
    }
    
    public String getNomre() {return nombre;}
    public String getRol() {return rol;}
}
