
package Model;
import Interface.ICalcularFig;

public class Cuadrado implements ICalcularFig {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcSup(){
        return lado * lado; 
    }
    
    @Override
    public double calcPer() {
       return 4 * lado;
    }
}
