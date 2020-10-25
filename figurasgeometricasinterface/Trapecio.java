
package figurasgeometricasinterface;


public class Trapecio extends Cuadrilateros {
      
    //Atributo propio
    protected double altura;
    
    public Trapecio(double l1, double l2, double l3, double altura ){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.altura = altura;
    }
    
    
    //Metodos implementados
    @Override
    public double Area(){
       return (l1*l2*altura)/2; 
    }
    
    @Override
    public double Perimetro(){
        return l1+l2+l3+l3;
    }
}
