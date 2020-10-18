/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author roy
 */
public class Triangulo extends Figura{

    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double sumaP;
    
    public Triangulo(double base,double altura,double lado1, double lado2,double lado3){
        super(base,altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Metodos abstractos
    
    @Override
    public double Area() {
        return (base*altura)/2;
    }

    
    @Override
    public double Perimetro() {
        return sumaP;
    }
    
    public void summaP(){
        sumaP = lado1 + lado2 + lado3;
    }
}
