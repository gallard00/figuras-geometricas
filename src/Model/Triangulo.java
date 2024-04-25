
package Model;
import Interface.ICalcularFig;

public class Triangulo implements ICalcularFig {
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    

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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcSup() {
        double sup = (lado1 + lado1 + base) / 2;
        return (float) Math.sqrt(sup * (sup - lado1) * (sup - lado2) * (sup - base));
    }

    @Override
    public double calcPer() {
        return lado1 + lado2 + base;
    }
    
     public double calcularAltura(){
        double area = calcSup();
        return (2 * area) / base;
        
    }
}
