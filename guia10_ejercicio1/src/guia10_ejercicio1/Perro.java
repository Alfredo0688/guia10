
package guia10_ejercicio1;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
