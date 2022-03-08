
package eggguia10_02;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(String color, char consumoEnergetico, double peso, double carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
    
        crearElectrodomestico();
        System.out.print("Ingrese la carga: ");
        this.carga = Entrada.nextDouble();
    }
    
    public void precioFinal(){
    
        super.precioFinal();
        
        if(this.carga > 30){
            this.setPrecio(this.getPrecio() + 500);
        }
    
    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }
    
    
}
