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
public abstract class SeleccionFutbol {
    
    //Atributos 
    protected String nombre;
    protected int id;
    protected String apellidos;
    protected int edad;
    
    protected boolean Viaje; //Variable booleana 
    protected boolean Concentracion;
    
    
     //Constructor
    public SeleccionFutbol(String nombre, int id, String apellidos, int edad){
        this.nombre = nombre;
        this.id = id;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    //Metodos getters 

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
    
    //Metodos generales 
    
    public abstract String Entrenamiento();
    public abstract String Partido();
    
    public boolean Viajar(){
        return Viaje = true;
    }
    public boolean Concentracion(){
        return Concentracion = true;
    }
    
    
}
