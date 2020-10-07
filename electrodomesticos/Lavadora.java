/*
    Lavadora pertenece a electrodomestico, copia los atributo y metodos ademas de que agrega los propios
    tambien hace su propia variacion de precio en funcion de las caracteristicas
*/
package electrodomesticos;


public class Lavadora extends Electrodomesticos{
    
    protected double carga = 5;
    
    //Metodos constructor
    public Lavadora(){
        super();
    }
    
    public Lavadora(double precio,String color,char ConsumoElectrico,double peso, double carga){
        super(precio,color,ConsumoElectrico,peso);
        this.carga = carga;
        ComprobarConsumoElectrico(ConsumoElectrico);
        ComprobarColor(color);
    }
    
    public Lavadora(double precio,double peso){
        super(precio,peso);
        
    }
    
    //Metodo para el precio final en funcion de la carga aceptada por la lavadora
    public void precioFinalLav(){
        precioFinal();
        if(carga > 30){
            precio = precio + 50;
        }
    }
}
