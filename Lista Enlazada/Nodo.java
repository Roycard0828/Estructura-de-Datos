//Esta clase sirve para crear un nodo en la lista.
package agenda;

public class Nodo {
    
    //Atributos 
    protected Contacto contacto;
    protected Nodo referencia; 
    
    
    //Constructor del nodo cola con la referencia nula. 
    public Nodo(Contacto contacto){
        this.contacto = contacto;
        referencia = null;
    }
    
    //-------------Metodo para enlazar los nodos--------------
    public void enlazar(Nodo n){
        referencia = n;
    }
    
    //Metodo para retornar el valor de referencia
    public Nodo getReferencia(){
        return referencia;
    }
    
    //Getter
    public Contacto getContacto() {
        return contacto;
    }
}
