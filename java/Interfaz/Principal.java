
package Interfaz;

import java.util.ArrayList;
import my.seleccionfutbol.Global;
import my.seleccionfutbol.Jugador;
import my.seleccionfutbol.SeleccionFutbol;

/**
 *
 * @author roy
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnJugador = new javax.swing.JButton();
        BtnEntrenador = new javax.swing.JButton();
        BtnMasajista = new javax.swing.JButton();
        BtnLista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccion de futbol Mexicana");

        BtnJugador.setText("Jugador");
        BtnJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJugadorActionPerformed(evt);
            }
        });

        BtnEntrenador.setText("Entrenador");
        BtnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrenadorActionPerformed(evt);
            }
        });

        BtnMasajista.setText("Masajista");

        BtnLista.setText("Lista Partido");
        BtnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnJugador)
                .addGap(76, 76, 76)
                .addComponent(BtnEntrenador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(BtnMasajista)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnJugador)
                    .addComponent(BtnEntrenador)
                    .addComponent(BtnMasajista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLista)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJugadorActionPerformed
        InterfazJugador jugador = new InterfazJugador();
        jugador.setVisible(true);
    }//GEN-LAST:event_BtnJugadorActionPerformed

    private void BtnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaActionPerformed
        MostrarPartido lista = new MostrarPartido();
        lista.setVisible(true);
        
    }//GEN-LAST:event_BtnListaActionPerformed

    private void BtnEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrenadorActionPerformed
        InterfazEntrenador entrenador = new InterfazEntrenador();
        entrenador.setVisible(true);
    }//GEN-LAST:event_BtnEntrenadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarSeleccion seleccion = new MostrarSeleccion();
        seleccion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrenador;
    private javax.swing.JButton BtnJugador;
    private javax.swing.JButton BtnLista;
    private javax.swing.JButton BtnMasajista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
