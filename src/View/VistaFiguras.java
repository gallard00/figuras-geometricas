
package View;

import Controller.FiguraController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class VistaFiguras extends javax.swing.JFrame {

    private JFrame ventanaActual;
    FiguraController controladora;
    
    public VistaFiguras() throws SQLException {
        controladora = FiguraController.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTriangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnPoligono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FIGURAS GEOMETRICAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTriangulo.setBackground(new java.awt.Color(255, 102, 102));
        btnTriangulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTriangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnTriangulo.setText("Triangulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnCirculo.setBackground(new java.awt.Color(255, 102, 102));
        btnCirculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCirculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCirculo.setText("Circulo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnCuadrado.setBackground(new java.awt.Color(255, 102, 102));
        btnCuadrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnPoligono.setBackground(new java.awt.Color(255, 102, 102));
        btnPoligono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPoligono.setForeground(new java.awt.Color(255, 255, 255));
        btnPoligono.setText("Poligono");
        btnPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoligonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCirculo)
                .addGap(18, 18, 18)
                .addComponent(btnCuadrado)
                .addGap(27, 27, 27)
                .addComponent(btnPoligono)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTriangulo)
                    .addComponent(btnCirculo)
                    .addComponent(btnCuadrado)
                    .addComponent(btnPoligono))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    ViewTriangulo vistaTriangulo = null;
        try {
            vistaTriangulo = new ViewTriangulo();
        } catch (SQLException ex) {
            Logger.getLogger(VistaFiguras.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    vistaTriangulo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaTriangulo.setVisible(true);
                    
                    ventanaActual = vistaTriangulo;
                    
                    this.setVisible(false);
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    ViewCirculo vistaCirculo = null;
        try {
            vistaCirculo = new ViewCirculo();
        } catch (SQLException ex) {
            Logger.getLogger(VistaFiguras.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    vistaCirculo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCirculo.setVisible(true);
                    
                    ventanaActual = vistaCirculo;
                    
                    this.setVisible(false);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    ViewCuadrado vistaCuadrado = null;
        try {
            vistaCuadrado = new ViewCuadrado();
        } catch (SQLException ex) {
            Logger.getLogger(VistaFiguras.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    vistaCuadrado.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCuadrado.setVisible(true);
                    
                    ventanaActual = vistaCuadrado;
                    
                    this.setVisible(false);
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoligonoActionPerformed
        if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    ViewPoligono vistaPoligono = null;
        try {
            vistaPoligono = new ViewPoligono();
        } catch (SQLException ex) {
            Logger.getLogger(VistaFiguras.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                    vistaPoligono.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaPoligono.setVisible(true);
                    
                    ventanaActual = vistaPoligono;
                    
                    this.setVisible(false);
    }//GEN-LAST:event_btnPoligonoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaFiguras().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaFiguras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnPoligono;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
