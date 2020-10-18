/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.seleccionfutbol;

/**
 *
 * @author roy
 */
public class Entrenador extends SeleccionFutbol {
    
    //Atributos
    protected  int idFederacion;
    protected  int entrenamientos;
    protected String planificacion;
    
    //Contructor
    public Entrenador(String nombre, int id, String apellidos, int edad, int idFederacion){
        super(nombre,id,apellidos,edad);
        this.idFederacion = idFederacion;
    }
    
    //Metodos getters

    public int getIdFederacion() {
        return idFederacion;
    }

    public int getEntrenamientos() {
        return entrenamientos;
    }

    
    //Metodos 
    
    @Override
    public String Entrenamiento() {
        return "Dirige entrenamiento";
    } 

    @Override
    public String Partido() {
        return "Dirige partido";
    }
    
    //Metodos propios
    
    public void PlanificaEntrenamiento(String planificacion){
        System.out.println(planificacion);
    }
}
