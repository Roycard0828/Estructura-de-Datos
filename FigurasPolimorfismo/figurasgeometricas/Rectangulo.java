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
public class Rectangulo extends Figura{
    
    public Rectangulo(double base,double altura){
        super(base,altura);
        
    }

    @Override
    public double Area() {
        return base * altura;
    }

    @Override
    public double Perimetro() {
        return base*2 + altura*2;
    }
    
    
}
