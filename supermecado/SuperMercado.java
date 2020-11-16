package supermecado;

public class SuperMercado <T> {
    
    protected Nodo cabeza;
    protected Nodo anterior;
    protected int size = 0; //Variable para manejar el tamaño de la lista
    
    public SuperMercado(){
        cabeza = null;
    }
    
    //Metodo para agregar un nodo a la lista
    public void add(T elemento){
        Nodo nodo = new Nodo(elemento);
        if(cabeza == null){
            cabeza = nodo;
            cabeza.setEnlace(null);
            anterior = cabeza;
        }else{
            anterior.setEnlace(nodo);
            anterior = nodo;
            size++;
        } 
    }
    
    public void mostrar(){
        Nodo nodo = cabeza;
        while(nodo.getEnlace()!= null){
            System.out.println(nodo.getContenido().getClass());
            nodo = nodo.getEnlace();
        }
        if(nodo.getEnlace() == null){
            System.out.println(nodo.getContenido().getClass());
        }
    } 
    
    public int getSize(){return size;}
    
   
}
