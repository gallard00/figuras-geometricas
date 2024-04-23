
package Model;
import Interface.ICalcularFig;

public class Circulo implements ICalcularFig {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcSup() {
        return (double) (Math.PI * radio * radio);
    }

    @Override
    public double calcPer() {
        return (double) (2 * Math.PI * radio);
    }
}
