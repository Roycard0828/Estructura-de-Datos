
package figuras;

/**
 *
 * @author Rodrigo Garcia
 */
public class Rectangulo extends Figuras {
    
    
    public Rectangulo(int base, int altura){
        super(base,altura);
    }
    
    //Metodos de clase
    
    @Override
    public int getArea(){
        return area = base * altura;
    } 
    
}
