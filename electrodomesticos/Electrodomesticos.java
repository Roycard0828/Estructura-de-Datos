/*
 * Esta clase padre se encarga de establecer valores predeterminados generales y metodos 
    de comprobacion, asi como un metodo para hacer cambios al precio final en funcion
    de las caracteristicas del producto
 */
package electrodomesticos;
    
//import java.util.ArrayList;

public class Electrodomesticos {
    
    //Atributos 
    protected double precio = 100;
    protected String color = "blanco";
    protected char ConsumoElectrico  = 'f';
    protected double peso = 5.00;
    
    //Metodos constructores
    public Electrodomesticos(){

    }
    
    public Electrodomesticos(double precio,double peso){
        //Solo se asignan los valores de precio y peso, los demas son por defecto
        this.precio = precio;
        this.peso = peso;
        
        
    }
    
    public Electrodomesticos(double precio,String color,char ConsumoElectrico,double peso){
        this.precio = precio;
        this.color = color;
        this.ConsumoElectrico = ConsumoElectrico;
        this.peso = peso;
        ComprobarConsumoElectrico(ConsumoElectrico);
        ComprobarColor(color);
      
    }
    
    //-------Metodos--------------
    //getters

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return ConsumoElectrico;
    }

    public double getPeso() {
        return peso;
    }
    
    //Metodos de clase para validar el color y el consumo
    public  void ComprobarConsumoElectrico(char letra){
        char consumos [] = {'a','b','c','d','e','f'};
        boolean consumo = false ;
        for(int i = 0; i < consumos.length; i++){
            if (letra == consumos[i]){
                consumo = true;
            }
        }
        
        if(consumo == false){
            ConsumoElectrico = 'f';
            System.out.println("El codigo de consumo electrico es invalido, se le asigna 'f'");
        }
    }
    
    public  void ComprobarColor(String Ccolor){
        String colores [] = {"blanco","negro","rojo","azul"};
        boolean Vercolor = false ;
        for(int i = 0; i < colores.length; i++){
            if (Ccolor.equals(colores[i])){
                Vercolor = true;
            }
        }
        
        if(Vercolor == false){
            color = "blanco";
            System.out.println("No hay de ese color, le pondremos blanco");
        }
        
        
    }
    
    public void precioFinal(){
        //Metodo para ver el precio final agregado al producto en funcion de su consumo
        char letracon [] = {'a','b','c','d','e','f'};
        int precios [] = {100,80,60,50,30,10};
        
        for(int i = 0; i < letracon.length; i++){
            if(ConsumoElectrico == letracon[i]){
                precio = precio + precios[i];
            }
        }
        

    } 
}
