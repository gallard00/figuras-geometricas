package Controller;

import Model.Circulo;
import Model.Cuadrado;
import Model.Triangulo;
import Interface.ICalcularFig;
import View.ViewFiguras;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FiguraController {
    private static FiguraController Instance;
    private ViewFiguras vista;
    private ICalcularFig figura;
    
    public static FiguraController GetInstance(ViewFiguras vista) throws SQLException {
        if (Instance == null) {
            Instance = new FiguraController(vista);
        }
        return Instance;
    }

    public FiguraController(ViewFiguras vista) {
        this.vista = vista;
        this.vista.setFiguraController(this);
    }
    
    public void calcularFigura (String tipoFigura, double... parametros){
        switch (tipoFigura) {
            case "Cuadrado":
                if (parametros.length == 1) {
                    figura = new Cuadrado (parametros[0]);
                } else {
                   JOptionPane.showMessageDialog(null, "Número de parámetros incorrecto para un cuadrado.");
                    return; 
                }
                break;
                case "Triangulo":
                if (parametros.length == 3) {
                    figura = new Triangulo(parametros[0], parametros[1], parametros[2]);
                } else {
                    JOptionPane.showMessageDialog(null, "Número de parámetros incorrecto para un triángulo.");
                    return;
                }
                break;
            case "Circulo":
                if (parametros.length == 1) {
                    figura = new Circulo(parametros[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "Número de parámetros incorrecto para un círculo.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Figura no reconocida.");
                return;
        }
        
        if (figura != null) {
            double perimetro = figura.calcPer();
            double superficie = figura.calcSup();
            vista.mostrarResultado(perimetro, superficie);
            if (figura instanceof Triangulo) {
                double altura = ((Triangulo) figura).calcularAltura();
                vista.mostrarAltura(altura);
            } else {
                vista.ocultarAltura();
            }
    }
    
}
