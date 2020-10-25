
package figurasgeometricasinterface;

public class Cuadrado extends Cuadrilateros {
    
    public Cuadrado(double l1){
       this.l1 = l1;
    }
    
    
    //Metodos implementados
    @Override
    public double Area(){
        return l1*l1;
    }
    
    @Override
    public double Perimetro(){
        return l1*4;
    }
}
