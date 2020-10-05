//Clase jugador del equipo de futbol
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class Jugador extends SeleccionFutbol {
    
    //Atributos 
    protected static int dorsal;
    protected static String posicion;
    
    //Constructor
    
    public Jugador(String nombre, int id, String apellidos, int edad, int dorsal,String posicion){
        super(nombre,id,apellidos,edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    //Metodos
    
//    public void Jugar(int minutos){
//        ArrayList<Integer> minJugados = new ArrayList<Integer>();
//        minJugados.add(minutos);
//    }
}
