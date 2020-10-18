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
public class Jugador extends SeleccionFutbol{
    
     //Atributos 
    protected  int dorsal;
    protected  String posicion;
    
    
    //Constructor
    
    public Jugador(String nombre, int id, String apellidos, int edad, int dorsal,String posicion){
        super(nombre,id,apellidos,edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    //Metodos sobre escritos
    
    @Override
    public String Entrenamiento(){
        return "Asiste a entrenar";
    }

    @Override
    public String Partido(){
        return "Jugo partido" + posicion;
    }   
    
    
    //Metodos propios
    
    public void Entrevista(){
        System.out.println("Da una entrevista");
    }
    
}
