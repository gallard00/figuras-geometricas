
package Model;
import Interface.ICalcularFig;

public class Triangulo implements ICalcularFig {
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo(double lado1, double lado2, double lado3, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getlado3() {
        return lado3;
    }

    public void setlado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos ICalcularFigura">
    @Override
    public double calcArea() {
        double semiperimetro = calcPer() / 2;
        return (double) Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public double calcPer() {
        return lado1 + lado2 + lado3;
    }
    
     public double calcularAltura(){
        double area = calcArea();
        return (2 * area) / lado3;
        
    }
//</editor-fold>
}
