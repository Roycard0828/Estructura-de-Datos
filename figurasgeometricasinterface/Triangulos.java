
package figurasgeometricasinterface;

public abstract class Triangulos implements Interface{
    
    //Atributos
    protected double L1,L2,L3;
    protected double altura;
    
    public Triangulos(double l1,double l2, double l3){
        this.L1 = l1;
        this.L2 = l2;
        this.L3 = l3;
    }
    
    
    
    //Metodos implementados
    @Override
    public double Area(){
        return (L1*altura)/2;
    }
    
    @Override
    public double Perimetro(){
        return L1+L2+L3;
    }
    
    public abstract void Altura();
}
