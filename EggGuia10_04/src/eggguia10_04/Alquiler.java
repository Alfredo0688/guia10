
package eggguia10_04;

import java.util.Date;


public class Alquiler {
    private String nombre;
    private long documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long documentoCliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(long documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public int calcularAlquiler(){
        int diasAlquiler = 0;
        diasAlquiler = fechaDevolucion.getDay() - fechaAlquiler.getDay();
        return diasAlquiler * this.barco.obtenerElModulo();
    }
}
