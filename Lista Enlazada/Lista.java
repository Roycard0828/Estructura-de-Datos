package agenda;

public class Lista {
    
    protected Nodo cabeza;
    protected int size;
    protected int indice = 0;

    
    public Lista(){
        //Constructor. Asigna el primer valor (cabeza) a nulo
        cabeza = null;
    }
    
    //--------Metodos---------------
    
    
    public void add(Contacto n){
        //Metodo para añadir un nodo
        //Depende si hay un nodo existente o no
        if(cabeza == null){
            cabeza = new Nodo(n);
            size = 0;
        }else{
            Nodo temp = cabeza;
            Nodo nodo = new Nodo(n);
            nodo.enlazar(temp);
            cabeza = nodo;
            size++;
        }
    }
    
    public int size(){
        //Retorna el tamaño de la lista
        return size;
    }
    
    public void buscar(String nombre){
        //Metodo para buscar un nodo en base al nombre
        boolean encontrado = false;
        Nodo temp = cabeza;
        for(int i = 0; i <= size(); i++){
            if(temp.getContacto().nombre.equals(nombre)){
                System.out.println("Usuario encontrado");
                System.out.println(temp.getContacto().nombre);
                System.out.println(temp.getContacto().getPosicion());
                encontrado = true;
                break;
            }
            temp = temp.getReferencia();
        }
        
        if(encontrado == false){
            System.out.println("Usuario no encontrado");     
        }   
    }
    
    public void editar(String nombre){
        //Metodo para editar contacto
        Nodo temp = cabeza;
        for(int i = 0; i <= size()-1; i++){
            if(temp.getContacto().nombre.equals(nombre)){
                temp.getContacto().setNombre("Se cambio");
                temp.getContacto().setNumero(1);
                temp.getContacto().setDireccion("Cordoba");
            }
            temp = temp.getReferencia();
        }
    }
    
    public void borrar(String nombre){
        //Metodo para borrar
        Nodo temp;
        temp = cabeza;
        encontrarIndice(nombre,temp);
        for(int e = 0; e <= size(); e++){
            if(temp.getContacto().getPosicion() == 0){
                cabeza = temp.getReferencia();
                size--;
                break;
                
            }else if(e == indice-1){
              temp.enlazar(temp.getReferencia().getReferencia());
              size--;
              break;        
            }
            temp = temp.getReferencia();
        }   
    }
    
    public void getCabeza(){
        System.out.println(cabeza.getContacto().getNombre());
    }
    
    public void asignarIndice(){
        //Metodo para asignar un indice en funcion de la cabeza
        Nodo temp = cabeza;
        for(int i = 0; i <= size(); i++){
            temp.getContacto().setPosicion(i);
            temp = temp.getReferencia();
        }
    }

    public void encontrarIndice(String nombre, Nodo temp){
        for(int i = 0; i <= size(); i++){
            if(temp.getContacto().getNombre().equals(nombre)){
                indice = temp.getContacto().getPosicion();
            }
            temp = temp.getReferencia();
        }
    }
}
