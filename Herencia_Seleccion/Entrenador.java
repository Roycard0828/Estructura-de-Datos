//Entrenador del equipo de futbol
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class Entrenador extends SeleccionFutbol{
    
    //Atributos
    protected static int idFederacion;
    protected static int entrenamientos;
    
    //Contructor
    public Entrenador(String nombre, int id, String apellidos, int edad, int idFederacion){
        super(nombre,id,apellidos,edad);
        this.idFederacion = idFederacion;
    }
    
    //Metodos
    public void Entrenamientos(){
        entrenamientos += 1;
        
    }
}
