
package figuras;

/**
 *
 * @author Rodrigo Garcia
 */
public class Triangulo extends Figuras {
    

    public Triangulo (int base, int altura){
        super(base,altura);
    }
   
    
    @Override
    public int getArea(){
        return area  = (base * altura) / 2;
    }
}
