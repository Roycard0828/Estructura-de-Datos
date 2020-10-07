/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    Television pertenece a electrodomestico, copia los atributo y metodos ademas de que agrega los propios
    tambien hace su propia variacion de precio en funcion de las caracteristicas
*/
package electrodomesticos;


public class Television extends Electrodomesticos{
    
    //Atributos
    protected int resolucion = 30;
    protected boolean sintonizador = false;
    
    //Metodos constructor
    public Television(int precio,String color,char ConsumoElectrico,double peso,int resolucion,boolean sintonizador){
        super(precio,color,ConsumoElectrico,peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        ComprobarConsumoElectrico(ConsumoElectrico);
        ComprobarColor(color);
    }
    
    public Television(int precio,double peso){
        super(precio, peso);
    }
    
    public Television(){
        super();
    }
    
    //Metodo para el precio final en funcion de la resolucion y sintonizador
    public void precioFinalTel(){
        precioFinal();
        double aumento;
        if(resolucion > 40){
            aumento = precio * .30;
            precio = precio + aumento;
        }
        if(sintonizador == true){
            precio = precio + 500;
        }
    }
}
