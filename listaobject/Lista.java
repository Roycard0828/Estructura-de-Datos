package listaobject;

public class Lista {
    
    protected Nodo cabeza;
    protected Nodo siguiente;
    protected int size = 0; //Variable para manejar el tamaño de la lista
    
    public Lista(){
        cabeza = null;
    }
    
    //Metodo para agregar un nodo a la lista
    public Object add(Object contenido){
        Nodo nodo = new Nodo(contenido);
        nodo.setEnlace(cabeza);
        cabeza = nodo;
        return nodo.getContenido();
    }
    
    //Metodo para mostrar el tipo de dato almacenado
    public void mostrar(){
        Nodo nodo = cabeza;
        while(nodo.getEnlace()!= null){
            tipoDato(nodo.getContenido());
            nodo = nodo.getEnlace();
        }
        if(nodo.getEnlace() == null){
            tipoDato(nodo.getContenido());
        }
    }
    public void tipoDato(Object contenido){
        if(contenido instanceof String){
                System.out.println("String");
            }else{
                System.out.println("Numerico");
                
            }
    }
}
