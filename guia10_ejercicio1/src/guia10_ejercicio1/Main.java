/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del 
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá 
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar 
una clase Main que realice lo siguiente:
 */
package guia10_ejercicio1;


public class Main {

    
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Firulais","Dogchow",5,"Labrador");
        System.out.println("ToString: " + perro1.toString());
        
        Gato gato1 = new Gato("Felix","Dogchow",2,"callejero");
        System.out.println("ToString: " + gato1.toString());
        
        Caballo caballo1 = new Caballo("Tornado","pasto",15,"nada");
        System.out.println("ToString: " + caballo1.toString());
        
    }
    
}
