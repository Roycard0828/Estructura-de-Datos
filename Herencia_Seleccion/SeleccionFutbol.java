
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class SeleccionFutbol {
    
    //Atributos 
    protected String nombre;
    protected int id;
    protected String apellidos;
    protected int edad;

    
    //Constructor
    public SeleccionFutbol(String nombre, int id, String apellidos, int edad){
        this.nombre = nombre;
        this.id = id;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    //Metodos getters y setters

    public  String getNombre() {
        return nombre;
    }  

    public  int getId() {
        return id;
    }

    public  String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
  
    
}
