package supermecado;

public class Nodo <T>{
    
    protected T contenido;
    protected Nodo enlace;
    
    //Metodo constructor
    public Nodo(T contenido){
        this.contenido = contenido;
        enlace = null;
    }

    //Getters y setters 

    public T getContenido() {
        return contenido;
    }
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
    
    public Nodo getEnlace() {
        return enlace;
    }   
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}
