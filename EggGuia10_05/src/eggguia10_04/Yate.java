
package eggguia10_04;


public class Yate extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(String matricula, int eslora, int anio_fabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anio_fabricacion);
        this.numeroCamarotes = numeroCamarotes;
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    @Override
    public int obtenerElModulo(){
        
        return super.obtenerElModulo() + this.potenciaCV + this.numeroCamarotes;
    }
    
    
}
