/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia10_01;

/**
 *
 * @author Alfre
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimentarse() {
        System.out.println("Me alimento de: " + this.getAlimento());
    }
}
