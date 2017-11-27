/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

/**
 *
 * @author dani
 */
public class Persona{
    private String nombre,direccion;

    public Persona(){
    }
    
    public Persona(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    @Override
    public String toString(){
        return " nombre: "+nombre+", direccion: "+direccion;
    }
     
}