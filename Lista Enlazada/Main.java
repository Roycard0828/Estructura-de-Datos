package agenda;

public class Main {

    public static void main(String[] args) {
        
        Contacto uno = new Contacto("Rodrigo", 1, "Cordoba");
        Contacto dos = new Contacto("Angel", 2, "Cordoba");
        Contacto tres = new Contacto("Ricardo", 3, "Orizaba");
        Contacto cuatro = new Contacto("Manuel", 4, "Xalapa");
        Contacto cinco = new Contacto("Roberto", 5, "Orizaba");
        
        Lista agenda = new Lista();
        
        agenda.add(uno);
        agenda.add(dos);
        agenda.add(tres);
        agenda.add(cuatro);
        agenda.add(cinco);
        
        agenda.asignarIndice();
        agenda.borrar("Roberto");
        agenda.asignarIndice();
        agenda.buscar("Roberto");
        
    }
    
}
