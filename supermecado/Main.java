package supermecado;

public class Main {

    public static void main(String[] args) {
        
        Producto producto = new Producto("p1");
        Producto producto1 = new Producto("p2");
        Producto producto2 = new Producto("p3");
        Producto producto3 = new Producto("p4");
        Producto producto4 = new Producto("p5");
        
        SuperMercado <Producto> lista = new SuperMercado();
        
        lista.add(producto);
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        
        for(int i = 0; i <= lista.getSize(); i++){
            
        }
        
    }                   
}   


