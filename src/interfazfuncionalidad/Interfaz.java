/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazfuncionalidad;

/**
 *
 * @author alumno
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCelciusConverter = new javax.swing.JPanel();
        jTextFieldCampoValor = new javax.swing.JTextField();
        jLabelCelsius = new javax.swing.JLabel();
        jLabelFahreneti = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldCampoValor.setText(" ");
        jTextFieldCampoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCampoValorActionPerformed(evt);
            }
        });
        jTextFieldCampoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoValorKeyReleased(evt);
            }
        });

        jLabelCelsius.setText("Celsius");

        jLabelFahreneti.setText("Fahrenheit");

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.setEnabled(false);
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCelciusConverterLayout = new javax.swing.GroupLayout(jPanelCelciusConverter);
        jPanelCelciusConverter.setLayout(jPanelCelciusConverterLayout);
        jPanelCelciusConverterLayout.setHorizontalGroup(
            jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCelciusConverterLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConvertir))
                .addGap(68, 68, 68)
                .addGroup(jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFahreneti)
                    .addComponent(jLabelCelsius))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanelCelciusConverterLayout.setVerticalGroup(
            jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCelciusConverterLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelsius))
                .addGap(33, 33, 33)
                .addGroup(jPanelCelciusConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFahreneti)
                    .addComponent(jButtonConvertir))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCelciusConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCelciusConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        // TODO add your handling code here:
        //Parse degrees Celsius as a double and convert to Fahrenheit.
        
        
        try {
            int tempFahr = (int)((Double.parseDouble(jTextFieldCampoValor.getText()))* 1.8 + 32);
            jLabelFahreneti.setText(tempFahr + " Fahrenheit");
        } catch (NumberFormatException e) {
            System.out.println("Exection "+e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void jTextFieldCampoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCampoValorActionPerformed
        // TODO add your handling code here:www
    }//GEN-LAST:event_jTextFieldCampoValorActionPerformed

    private void jTextFieldCampoValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoValorKeyReleased
        // TODO add your handling code here:
        if(isInteger(jTextFieldCampoValor.getText())){
            jButtonConvertir.setEnabled(true);
            
        }else{
            jButtonConvertir.setEnabled(false);
        }
        
    }//GEN-LAST:event_jTextFieldCampoValorKeyReleased

    public boolean isInteger(String numero){
    try{
        Integer.parseInt(numero);
        return true;
    }catch(NumberFormatException e){
        return false;
    }
}
    
    
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JLabel jLabelCelsius;
    private javax.swing.JLabel jLabelFahreneti;
    private javax.swing.JPanel jPanelCelciusConverter;
    private javax.swing.JTextField jTextFieldCampoValor;
    // End of variables declaration//GEN-END:variables
}
