
package agenda;

public class Contacto {
    
    protected String nombre;
    protected int numero;
    protected String direccion;
    protected int posicion;
    
    public Contacto(String nombre, int numero, String direccion){
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    
    public int getPosicion(){
        return posicion;
    }
    
}
