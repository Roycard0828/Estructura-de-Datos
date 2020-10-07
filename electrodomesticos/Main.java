
package electrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class Main {

    protected static ArrayList<Electrodomesticos> compra = new ArrayList<Electrodomesticos>();
    
    public static void main(String[] args) {
        
        
        //Creamos las instancias y a su vez les aplicamos el precio final y los añadimos al arreglo
        Lavadora lavadora1 = new Lavadora(500,"negro",'a',30.0,40);
        lavadora1.precioFinal();
        compra.add(lavadora1);
        Lavadora lavadora2 = new Lavadora(140,"azul",'b',15.0,10);
        lavadora2.precioFinalLav();
        compra.add(lavadora2);
        Lavadora lavadora3 = new Lavadora(720,"blanco",'c',28.0,32);
        lavadora3.precioFinalLav();
        compra.add(lavadora3);
        Television lg = new Television(150,"negro",'f',25,30,true);
        lg.precioFinalTel();
        compra.add(lg);
        Television samsung = new Television(450,"azul",'d',35,60,true);
        samsung.precioFinalTel();
        compra.add(samsung);
        
        
        //Calculamos el precio final
        double preciototal = 0;
        
        for(int i = 0; i < compra.size(); i++){
            preciototal = preciototal + compra.get(i).getPrecio();
        }
        
        
        //Imprimimos los datos
        for(Electrodomesticos elemento: compra){
            System.out.println("Nombre del producto: " + elemento.getClass().getSimpleName());
            System.out.println("-----Datos------");
            System.out.println("Precio: $"+elemento.getPrecio());
            System.out.println("Peso: "+elemento.getPeso()+"kg");
            System.out.println("Color: "+elemento.getColor());
            System.out.println("Clave consumo: "+elemento.getConsumoElectrico());
            
        }
        
        System.out.println("Precio total: " + preciototal);
        
    }
    
}
