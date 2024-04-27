
package Model;
import Interface.ICalcularFig;

public class Circulo implements ICalcularFig {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodos ICalcularFigura">
    @Override
    public double calcArea() {
        return (double) (Math.PI * radio * radio);
    }

    @Override
    public double calcPer() {
        return (double) (2 * Math.PI * radio);
    }
//</editor-fold>
}
