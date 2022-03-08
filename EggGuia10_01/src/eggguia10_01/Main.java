
package eggguia10_01;

public class Main {


    public static void main(String[] args) {
        Perro p1 = new Perro("Scooby","raza",5,"Labrador");
        System.out.println("Soy " + p1.getNombre());
        p1.alimentarse();
        
        Animal perro2 = new Perro("Firulais","dogchow",2,"caniche");
        System.out.println("Soy " + perro2.getNombre());
        perro2.alimentarse();
        //Animal a1 = new Animal("Scooby","raza",5,"Labrador");
        //a1.alimentarse();
        
        Gato g1 = new Gato("Felix","raza",5,"callejero");
        System.out.println("Soy " + g1.getNombre());
        g1.alimentarse();
        
        
        Caballo c1 = new Caballo("Tornado","pasto",15,"ni idea");
        System.out.println("Soy " + c1.getNombre());
        c1.alimentarse();
        
    }
    
}
