
package figuras;

/**
 *
 * @author Rodrigo Garcia
 */
public class Cuadrado extends Figuras {
    
    
    
    public Cuadrado (int base, int altura){
        super(base,altura);
    }
    
    
    @Override
    public int getArea(){
        return area = base * base;
    }
}
