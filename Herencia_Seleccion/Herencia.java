
package herencia;

import java.util.ArrayList;


public class Herencia {

    public static ArrayList<SeleccionFutbol> concentracion1 = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {
        
       
        
        //Creamos al personal 
        Jugador portero1 = new Jugador("Iker",023,"Casillas",30,1,"Portero");
        concentracion1.add(portero1);
        Jugador defensa1 = new Jugador("Sergio",024,"Ramos",28,4,"Defensa Central");
        concentracion1.add(defensa1);
        Jugador defensa2 = new Jugador("Raphael",025,"Varane",25,3,"Defensa central");
        concentracion1.add(defensa2);
       
        
        System.out.println("Lista de personas que iran a la concentracion");
        for(SeleccionFutbol elemento : concentracion1){
            System.out.println(elemento.getNombre());
        }
        
        
    }
    
}
