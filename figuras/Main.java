
package figuras;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class Main {
    
    protected static ArrayList<Figuras> figuras = new ArrayList<>();
    
    public static void main(String[] args) {
        
        
        
        Rectangulo figura1 = new Rectangulo(4,8);
        figuras.add(figura1);
        Triangulo figura2 = new Triangulo(5,7);
        figuras.add(figura2);
        
        for(Figuras elemento : figuras){
            String nombre = elemento.getClass().getSimpleName();
            System.out.println("El area de " + nombre + " es: " + elemento.getArea());
            
        }
    }
    
}
