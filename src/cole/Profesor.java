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
public class Profesor extends Persona{
    private String materia;

    public Profesor(){
    }

    public Profesor(String materia){
        this.materia=materia;
    }

    public Profesor(String materia, String nombre, String direccion){
        super(nombre, direccion);
        this.materia=materia;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia=materia;
    }

    @Override
    public String toString(){
        return super.toString()+" materia: "+materia;
    }
    
    
}
