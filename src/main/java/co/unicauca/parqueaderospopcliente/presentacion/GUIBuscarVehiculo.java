/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopcliente.presentacion;

import co.unicauca.parqueaderospopcliente.negocio.GestorRegVehiculo;
import co.unicauca.parqueaderospopcliente.negocio.GestorVehiculo;
import co.unicauca.parqueaderospopcliente.negocio.RegVehiculo;
import co.unicauca.parqueaderospopcliente.negocio.Vehiculo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author danny
 */
public class GUIBuscarVehiculo extends javax.swing.JFrame {

    /**
     * Creacion de variables y atributos publicos estaticos que podran ser usadas por otras vistas
     */
    public static String Placa ;
    public static String HoraFechaEntrada;
    public static String atrTipoVehiculo;
    
    public GUIBuscarVehiculo() {
        initComponents();
        jtxtFFicha.setEnabled(false);
        jtxtFPlaca.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRBPlaca = new javax.swing.JRadioButton();
        jRBFicha = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtFPlaca = new javax.swing.JTextField();
        jtxtFFicha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Vehiculo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jRBPlaca.setBackground(new java.awt.Color(255, 255, 255));
        jRBPlaca.setText("Placa");
        jRBPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPlacaActionPerformed(evt);
            }
        });

        jRBFicha.setBackground(new java.awt.Color(255, 255, 255));
        jRBFicha.setText("Numero de Ficha");
        jRBFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFichaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Buscar Vehiculo");

        jtxtFFicha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFFichaKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbtnRegresar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jbtnRegresar.setText("Regresar");
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBFicha)
                            .addComponent(jRBPlaca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtFFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jtxtFPlaca)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnRegresar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPlaca)
                    .addComponent(jtxtFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBFicha)
                    .addComponent(jtxtFFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jbtnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Metodo que se encargara de lanzar la vista de GUISalidaVehiculo o GUISalidaVehiculo segun el vehiculo
       que se busque, cuando le den click en el boton buscar 
   */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jtxtFPlaca.getText().isEmpty() && jtxtFFicha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "por favor ingresar una placa o numero de ficha");
        } else {
            GestorRegVehiculo gestorR = new GestorRegVehiculo();
            GestorVehiculo gestorV = new GestorVehiculo();
            RegVehiculo regVehi = new RegVehiculo();
            Vehiculo vehi = new Vehiculo();
            try {

                if (jRBFicha.isSelected()) {//si se selecciona la ficha al objeto regVehi le asignamos gestorR.consultarRegVehiculoFicha 
                    regVehi = gestorR.consultarRegVehiculoFicha(jtxtFFicha.getText());

                }
                if (jRBPlaca.isSelected()) {// si selecciona la placa al objeto regVehi y vehi le asignamos gestorV.ConsultarVehiculo 
                    regVehi = gestorR.consultarRegVehiculoPlaca(jtxtFPlaca.getText());
                    vehi = gestorV.ConsultarVehiculo(jtxtFPlaca.getText());
                }
                System.out.println("Consulta realizada");
            } catch (Exception e) {
                System.out.println(e);
            }
            if (jRBPlaca.isSelected()) {

                if (vehi == null || !regVehi.getRegEstadoVehiculo().equals("Ingresado")) {//comprobamos si el vehiculo ingresa por primera vez o si ya ingreso pero fue retirado
                    Placa = jtxtFPlaca.getText();
                    GUIRegistrarVehiculo vistaReg = new GUIRegistrarVehiculo();
                    vistaReg.setVisible(true);
                    vistaReg.setLocationRelativeTo(null);
                } else {
                    Placa = regVehi.getRegPlacaVehiculo();
                    HoraFechaEntrada = regVehi.getRegHoraYFechaEntrada();
                    atrTipoVehiculo = regVehi.getRegTipoVehiculo();
                    
                    GUISalidaVehiculo salida = new GUISalidaVehiculo();
                    salida.setVisible(true);
                    salida.setLocationRelativeTo(null);

                }
        
            }
            if (jRBFicha.isSelected()) {//comprobamos si el vehiculo ingresa por primera vez o si ya ingreso pero fue retirado
                if (vehi == null || !regVehi.getRegEstadoVehiculo().equals("Ingresado")) {
                    Placa = jtxtFPlaca.getText();
                    GUIRegistrarVehiculo vistaReg = new GUIRegistrarVehiculo();
                    vistaReg.setVisible(true);
                    vistaReg.setLocationRelativeTo(null);
                } else {
                    Placa = regVehi.getRegPlacaVehiculo();
                    HoraFechaEntrada = regVehi.getRegHoraYFechaEntrada();
                    atrTipoVehiculo = regVehi.getRegTipoVehiculo();
                    GUISalidaVehiculo salida = new GUISalidaVehiculo();
                    salida.setVisible(true);
                    salida.setLocationRelativeTo(null);
                }
            }
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


//habilitamos o deshabilitamos campos para que no se puedan llenar datos de ficha y placa a la vez
    private void jRBPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPlacaActionPerformed
        
        jtxtFPlaca.setEnabled(true);
        jtxtFFicha.setEnabled(false);
        jRBFicha.setSelected(false);
    }//GEN-LAST:event_jRBPlacaActionPerformed
//habilitamos o deshabilitamos campos para que no se puedan llenar datos de ficha y placa a la vez
    private void jRBFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFichaActionPerformed
       jtxtFPlaca.setEnabled(false);
       jtxtFFicha.setEnabled(true);
       jRBPlaca.setSelected(false);
    }//GEN-LAST:event_jRBFichaActionPerformed
//Cerrar la ventana de buqueda y regresar al menu principal
    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed
//Metodo para que solo de ingresen numeros en la ficha 
    private void jtxtFFichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFFichaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9')
        evt.consume();
    }//GEN-LAST:event_jtxtFFichaKeyTyped

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
            java.util.logging.Logger.getLogger(GUIBuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBuscarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBFicha;
    private javax.swing.JRadioButton jRBPlaca;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JTextField jtxtFFicha;
    private javax.swing.JTextField jtxtFPlaca;
    // End of variables declaration//GEN-END:variables
}