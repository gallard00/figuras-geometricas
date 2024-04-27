
package Model;
import Interface.ICalcularFig;

public class Cuadrado implements ICalcularFig {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodos ICalcularFigura">
    @Override
    public double calcArea(){
        return lado * lado; 
    }
    
    @Override
    public double calcPer() {
       return 4 * lado;
    }
//</editor-fold>
}
