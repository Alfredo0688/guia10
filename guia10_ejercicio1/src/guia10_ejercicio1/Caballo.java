/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejercicio1;

/**
 *
 * @author Alfre
 */
public class Caballo extends Animal{
    public Caballo() {
    }
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        
    }
   
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
