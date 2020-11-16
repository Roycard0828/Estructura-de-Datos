package listaabstract;

public class Lista <Contenido>{
    protected Nodo cabeza;
    protected Nodo anterior;
    protected int size = 0; //Variable para manejar el tamaño de la lista
    
    public Lista(){
        cabeza = null;
    }
    
    //Metodo para agregar un nodo a la lista
    public void add(Contenido contenido){
        Nodo nodo = new Nodo(contenido);
        if(cabeza == null){
            cabeza = nodo;
            cabeza.setEnlace(null);
            anterior = cabeza;
        }else{
            anterior.setEnlace(nodo);
            anterior = nodo;
        } 
    }
    
    public void mostrar(){
        Nodo nodo = cabeza;
        while(nodo.getEnlace()!= null){
            System.out.println(nodo.getContenido());
            nodo = nodo.getEnlace();
        }
        if(nodo.getEnlace() == null){
            System.out.println(nodo.getContenido());
        }
    }
}
