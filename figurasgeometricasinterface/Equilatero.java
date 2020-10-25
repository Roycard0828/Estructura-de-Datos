
package figurasgeometricasinterface;

public class Equilatero extends Triangulos{
    
    public Equilatero(double l1,double l2, double l3){
        super(l1,l2,l3);
    }
    
    
    @Override
    public void Altura(){
        altura = (Math.sqrt(3*L1)) /2;
    }
}
