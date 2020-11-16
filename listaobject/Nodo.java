/*
    Esta clase tiene la funcion crear nodos para ser enlazados entre si y crear una lista
*/

package listaobject;

public class Nodo {
    
    protected Object contenido;
    protected Nodo enlace;
    protected int posicion;
    
    //---Metodos Constructores---
    public Nodo(Object contenido){
        this.contenido = contenido;
        enlace = null;
    }
    public Nodo(Object contenido, Nodo enlace){
        this.contenido = contenido;
        this.enlace = enlace;
    }
    
    //---Metodos getters y setters de los atributos
    public void setContenido(Object contenido){
        this.contenido = contenido;
    } 
    public Object getContenido(){
        return contenido;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
    public Nodo getEnlace(){
        return enlace;
    }
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public int getPosicion(){
        return posicion;
    }
    
}
