
package figurasgeometricasinterface;

public class Isoseles extends Triangulos {

    public Isoseles(double l1,double l2, double l3, double l4){
        super(l1,l2,l3);
    }
    
    
    
    @Override
    public void Altura(){
        altura = Math.sqrt((L2*L2)-(L1*L1/4));
    }
    
    
}
