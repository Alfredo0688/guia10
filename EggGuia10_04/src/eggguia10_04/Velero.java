
package eggguia10_04;


public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, int eslora, int anio_fabricacion, int numeroMastiles) {
        super(matricula, eslora, anio_fabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public int obtenerElModulo(){
        return super.obtenerElModulo() + this.numeroMastiles;
    }
}
