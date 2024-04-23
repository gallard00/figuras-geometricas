package Controller;

import Model.Circulo;
import Model.Cuadrado;
import Model.Triangulo;
import Interface.ICalcularFig;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FiguraController {
    private static FiguraController Instance;
    private List<ICalcularFig> ListaFig = new ArrayList<ICalcularFig>();
    
    public static FiguraController GetInstance() throws SQLException {
        if (Instance == null) {
            Instance = new FiguraController();
        }
        return Instance;
    }
    
    
}
