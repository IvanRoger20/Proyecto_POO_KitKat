/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyconta_proyecto;

/**
 *
 * @author IvanTron
 */
public class Asientos_Contables extends javax.swing.JFrame {

    /**
     * Creates new form Asientos_Contables
     */
    public Asientos_Contables() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxAsientos1 = new javax.swing.JComboBox<>();
        cbxAsientos2 = new javax.swing.JComboBox<>();
        cbxAsientos3 = new javax.swing.JComboBox<>();
        cbxAsientos4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Asiento contable");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cargo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Abono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 30, 70, -1));

        cbxAsientos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Caja", "Banco", "Mercancia", "Proveedores", "Cliente", "Mobiliario", "Documento", "Terreno", "Equipo de reparto", "Renta", "Edificio" }));
        cbxAsientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAsientos1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAsientos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        cbxAsientos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Caja", "Banco", "Mercancia", "Proveedores", "Cliente", "Mobiliario", "Documento", "Terreno", "Equipo de reparto", "Renta", "Edificio" }));
        getContentPane().add(cbxAsientos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));

        cbxAsientos3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Caja", "Banco", "Mercancia", "Proveedores", "Cliente", "Mobiliario", "Documento", "Terreno", "Equipo de reparto", "Renta", "Edificio" }));
        getContentPane().add(cbxAsientos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, -1));

        cbxAsientos4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Caja", "Banco", "Mercancia", "Proveedores", "Cliente", "Mobiliario", "Documento", "Terreno", "Equipo de reparto", "Renta", "Edificio" }));
        getContentPane().add(cbxAsientos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 90, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 90, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 90, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 90, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 90, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 90, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 90, -1));

        jLabel4.setText("    ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel6.setText("$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 10, 20));

        jLabel7.setText("$");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 10, 20));

        jLabel8.setText("$");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 10, 20));

        jLabel9.setText("$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 10, 20));

        jLabel10.setText("$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 10, 20));

        jLabel11.setText("$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 10, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Sin título.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 240));

        jLabel12.setText("$");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 10, 20));

        jLabel13.setText("$");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 10, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAsientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAsientos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAsientos1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Asientos_Contables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asientos_Contables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asientos_Contables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asientos_Contables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asientos_Contables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAsientos1;
    private javax.swing.JComboBox<String> cbxAsientos2;
    private javax.swing.JComboBox<String> cbxAsientos3;
    private javax.swing.JComboBox<String> cbxAsientos4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
