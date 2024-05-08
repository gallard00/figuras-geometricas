package Controller;

import Model.Circulo;
import Model.Cuadrado;
import Model.Poligono;
import Model.Triangulo;
import java.sql.SQLException;

public class FiguraController {
    private FiguraController() {
    }
    private static FiguraController Instance;

    public static FiguraController GetInstance() throws SQLException {
        if (Instance == null) {
            Instance = new FiguraController();
        }
        return Instance;
    }
//<editor-fold defaultstate="collapsed" desc=" Metodos de Cuadrado ">
    public double calcularAreaCuadrado(double lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        double area = cuadrado.calcArea();

        return area;
    }

    public double calcularPerimetroCuadrado(double lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        double perimetro = cuadrado.calcPer();
        return perimetro;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc=" Metodos de Triangulo ">
    public double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        double  area = triangulo.calcArea();
        return area;
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double base) {
       Triangulo triangulo = new Triangulo(lado1, lado2, base);
        double  perimetro = triangulo.calcPer();
        return perimetro;
    }
    
    public double calcularAlturaTriangulo(double lado1, double lado2, double base){
        Triangulo triangulo = new Triangulo(lado1, lado2, base);
        double  altura = triangulo.calcularAltura();
        return altura;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc=" Metodos de Circulo ">
    public double calcularAreaCirculo(double radio) {
        Circulo circulo = new Circulo(radio);
        double area = circulo.calcArea();
        return area;
        
    }

    public double calcularPerimetroCirculo(double radio) {
        Circulo circulo = new Circulo(radio);
        double perimetro = circulo.calcPer();
        return perimetro;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc=" Metodos de Poligono ">
    public double calcularAreaPoligono (int cantLado, double lado ) {
       Poligono poligono = new Poligono( cantLado, lado);
       double area = poligono.calcArea();
       return area;
    }
    
    public double calcularPerimetroPoligono(int cantLado, double lado) {
        Poligono poligono = new Poligono (cantLado, lado);
        double perimetro = poligono.calcPer();
        return perimetro;
    }
//</editor-fold>
}
