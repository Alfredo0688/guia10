
package eggguia10_04;


public class BarcoAMotor extends Barco{
    private int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, int eslora, int anio_fabricacion,int potenciaCV) {
        super(matricula, eslora, anio_fabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public int obtenerElModulo(){
        return super.obtenerElModulo() + this.potenciaCV;
    }
    
}
