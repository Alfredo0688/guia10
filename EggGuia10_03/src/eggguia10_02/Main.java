
package eggguia10_02;

import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        double sumatoria = 0.0;
        double sumatoriaT = 0.0;
        double sumatoriaL = 0.0;
        
        Lavadora lavirap = new Lavadora("Rojo",'E',50.6,35);
        
        Lavadora lavirap2 = new Lavadora("Azul",'B',70.6,45);
        
        Televisor tvFuhrer = new Televisor("Rojo",'E',15,45,false);
        
        Televisor tvFuhrer2 = new Televisor("violeta",'E',15,45,true);
        
        lista.add(lavirap);
        lista.add(lavirap2);
        lista.add(tvFuhrer);
        lista.add(tvFuhrer2);
        
        for (Electrodomestico elec : lista) {
            
            elec.precioFinal();
            if(elec instanceof Televisor){
                sumatoriaT += elec.getPrecio();
            }else if(elec instanceof Lavadora){
                sumatoriaL += elec.getPrecio();
            }
            
            sumatoria += elec.getPrecio();
            
        }
        System.out.println("Precio Televisores: " + sumatoriaT);
        System.out.println("Precio Lavadoras: " + sumatoriaL);
        System.out.println("Suma de todos los precios: " + sumatoria);
        /*
        lavirap.precioFinal();
        lavirap2.precioFinal();
        tvFuhrer.precioFinal();
        tvFuhrer2.precioFinal();
        //System.out.println(tvFuhrer2.toString());
        System.out.println("Precio final del televisor 1: " + tvFuhrer.getPrecio());
        System.out.println("Precio final del televisor 2: " + tvFuhrer2.getPrecio());
        System.out.println("Precio final de la lavadora: " + lavirap.getPrecio());
        System.out.println("Precio final de la lavadora2: " + lavirap2.getPrecio());
        System.out.println("Precio final de la lavadora: " + lavirap.getPrecio());
*/
    }
    
}
