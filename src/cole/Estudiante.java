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
public class Estudiante extends Persona{
    private String nombre_cole;
    private int nivel;

    public Estudiante(){
    }

    public Estudiante(String nombre_cole, int nivel){
        this.nombre_cole=nombre_cole;
        this.nivel=nivel;
    }

    public Estudiante(String nombre_cole, int nivel, String nombre, String direccion){
        super(nombre, direccion);
        this.nombre_cole=nombre_cole;
        this.nivel=nivel;
    }

    public String getNombre_cole(){
        return nombre_cole;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNombre_cole(String nombre_cole){
        this.nombre_cole=nombre_cole;
    }

    public void setNivel(int nivel){
        this.nivel=nivel;
    }

    @Override
    public String toString(){
        return super.toString()+" nombre_cole: "+nombre_cole+", nivel: "+nivel;
    }
    
    
}
