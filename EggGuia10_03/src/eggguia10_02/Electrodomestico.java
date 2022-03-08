package eggguia10_02;

import java.util.Scanner;

public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;
    Scanner Entrada = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso) {
        this.precio = 1000;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {

        if (letra < 'A' || letra > 'F') {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("gris")) {

            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        //System.out.print("Precio: ");
        //double precio = Entrada.nextDouble();
        //if (precio < 1000) {
        //    precio = 1000;
        //}
        System.out.print("Color: ");
        this.color = Entrada.next();
        System.out.print("Consumo Energetico: ");
        this.consumoEnergetico = Entrada.next().charAt(0);
        System.out.print("Peso: ");
        this.peso = Entrada.nextDouble();
        this.precioFinal();
        //Electrodomestico elec = new Electrodomestico(color, consumoEnergetico, peso);
    }

    public void precioFinal() {

        switch (this.consumoEnergetico) {

            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;

            case 'C':
                this.precio += 600;
                break;

            case 'D':
                this.precio += 500;
                break;

            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        
        if(this.peso >= 1 && this.peso <= 19){
            this.precio += 100;
        }
        if(this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        }
        if(this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        }
        if(this.peso >= 80){
            this.precio += 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", Entrada=" + Entrada + '}';
    }
    
    
}
