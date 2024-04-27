
package FigurasGeometricas;

import View.VistaFiguras;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nahu
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaFiguras().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FigurasGeometricas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
