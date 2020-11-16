/*
    Este nodo generico pertenecera a una lista 
 */
package listaabstract;

public class Nodo <Contenido>{
   
    protected Contenido contenido;
    protected Nodo enlace;
    
    //Metodo constructor
    public Nodo(Contenido contenido){
        this.contenido = contenido;
        enlace = null;
    }
    
    //Getters y setters 

    public Contenido getContenido() {
        return contenido;
    }
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Nodo getEnlace() {
        return enlace;
    }   
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
}
