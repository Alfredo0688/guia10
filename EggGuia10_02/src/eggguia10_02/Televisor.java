
package eggguia10_02;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, char consumoEnergetico, double peso, int resolucion,boolean sintonizadorTDT) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
    
    }
    public void precioFinal(){
        
        super.precioFinal();
        if(this.resolucion > 40 && !this.isSintonizadorTDT()){
            double porcentaje = this.getPrecio() * 0.30;
            this.setPrecio(this.getPrecio() + porcentaje);
            //this.setPrecio(this.getPrecio() * (1 + 0.3));
        }else if(this.resolucion > 40 && this.isSintonizadorTDT()){
            this.setPrecio(this.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        
        return "Televisor{" + "Precio=" + this.getPrecio() +", Color=" + this.getColor() +", Consumo Energetico=" + this.getConsumoEnergetico()+ ", Peso=" + this.getPeso()  +", Resolucion=" + resolucion + ", SintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
}
