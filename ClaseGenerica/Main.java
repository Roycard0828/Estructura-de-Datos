package generico;

public class Main {

    public static void main(String[] args) {
        
        
        //Declaramos un objeto de tipo box
        Box<Integer> integerBox = new Box<Integer>();
        
        //Le añadimos el valor a t
        integerBox.setT(10);
        //Añadimos un segundo valor 
        integerBox.inspect(15);
        //Creamos dos o
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(1, "orange");
        boolean same = Method.compare(p1, p2);
        System.out.println(same);
        
        //integerBox.set(new Integer(10));
        //integerBox.inspect("some text"); // error: this is still String!
        
    }
    
}
