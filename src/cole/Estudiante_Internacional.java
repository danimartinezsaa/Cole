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
public class Estudiante_Internacional extends Estudiante{
    private String pais;

    public Estudiante_Internacional(){
    }

    public Estudiante_Internacional(String pais){
        this.pais=pais;
    }

    public Estudiante_Internacional(String pais, String nombre_cole, int nivel){
        super(nombre_cole, nivel);
        this.pais=pais;
    }

    public Estudiante_Internacional(String pais, String nombre_cole, int nivel, String nombre, String direccion){
        super(nombre_cole, nivel, nombre, direccion);
        this.pais=pais;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais=pais;
    }

    @Override
    public String toString(){
        return super.toString()+" pais: "+pais;
    }
    
}
