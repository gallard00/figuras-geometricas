package Controller;

import Model.Circulo;
import Model.Cuadrado;
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

    public double calcularSuperficieCuadrado(double lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        double superficie = cuadrado.calcSup();

        return superficie;
    }

    public double calcularPerimetroCuadrado(double lado) {
        Cuadrado cuadrado = new Cuadrado(lado);
        double perimetro = cuadrado.calcPer();
        return perimetro;
    }

    public double calcularSuperficieTriangulo(double lado1, double lado2, double base) {
        Triangulo triangulo = new Triangulo(lado1, lado2, base);
        double  superficie = triangulo.calcSup();
        return superficie;
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

    public double calcularSuperficieCirculo(double radio) {
        Circulo circulo = new Circulo(radio);
        double superficie = circulo.calcSup();
        return superficie;
        
    }

    public double calcularPerimetroCirculo(double radio) {
        Circulo circulo = new Circulo(radio);
        double perimetro = circulo.calcPer();
        return perimetro;
    }
    
    public String[] obtenerFigurasDisponibles() {
        return new String[]{"Cuadrado", "Triangulo", "Circulo"};
    }
}
