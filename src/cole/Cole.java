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
public class Cole{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Estudiante estudiante1=new Estudiante("Daniel Castelao",2,"Daniel Martínez","Pontevedra");
        Estudiante_Internacional erasmus1=new Estudiante_Internacional("Francia","Daniel Castelao",1,"Emmanuel Valls","París");
        Profesor profesor1=new Profesor("Matemáticas","Arturo Fernández","Vigo");
        
        System.out.println("Datos alumno 1: "+estudiante1.toString());
        System.out.println("Datos profesor 1: "+profesor1.toString());
        System.out.println("Datos alumno internacional 1: "+erasmus1.toString());
        
        estudiante1.setNivel(4);
        profesor1.setMateria("Ciencias");
        
        System.out.println("nivel modificado: "+estudiante1.getNivel());
        System.out.println("materia modificacda: "+profesor1.getMateria());
    }
    
}
