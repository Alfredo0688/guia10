
package eggguia10_02;


public class Main {

    
    public static void main(String[] args) {
        
        Lavadora lavirap = new Lavadora("Rojo",'E',50.6,35);
        
        Televisor tvFuhrer = new Televisor("Rojo",'E',15,45,false);
        
        Televisor tvFuhrer2 = new Televisor("violeta",'E',15,45,false);
        
        lavirap.precioFinal();
        
        tvFuhrer.precioFinal();
        
        tvFuhrer2.precioFinal();
        System.out.println(tvFuhrer2.toString());
        System.out.println("Precio final del televisor 1: " + tvFuhrer.getPrecio());
        System.out.println("Precio final del televisor 2: " + tvFuhrer2.getPrecio());
//System.out.println("Precio final de la lavadora: " + lavirap.getPrecio());
    }
    
}
