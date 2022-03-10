
package eggguia10_04;

import java.util.Date;


public class Main {

   
    public static void main(String[] args) {
        
        
        
        Yate yate1 = new Yate("125ABC",10,2018,150,5);
        System.out.println("Modulo Yate: " + yate1.obtenerElModulo());
        Alquiler alq1 = new Alquiler("Mario", 33123456, new Date(2019,05,22), new Date(2019,05,28),"central", yate1);
        System.out.println("Alquiler calculado: " + alq1.calcularAlquiler());
        System.out.println(alq1.getBarco().obtenerElModulo());
    }
    
}
