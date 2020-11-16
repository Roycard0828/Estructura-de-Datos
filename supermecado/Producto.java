/*
    Clase producto almacenara los datos de un producto (cantidad y precio unitario, son aleatorios) 
    y total 
 */
package supermecado;

public class Producto {

    protected int cantidad;
    protected double precio;
    protected String nombre;
    protected double total;
    
    public Producto(String nombre){
        cantidad = (int) Math.floor(Math.random()*(10-1+1)+1);
        precio =  (double) (Math.random()*6 + 1) ;
        this.nombre = nombre;
    }

    //Getters 
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    } 
    public String getNombre(){
        return nombre;
    }
    public void setTotal(){
        total = cantidad * precio;
    }
    public double getTotal(){return total;}
    
}
