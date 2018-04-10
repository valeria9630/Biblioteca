/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class ModificarUsuario extends javax.swing.JFrame {
    Biblioteca biblioteca;
    /**
     * Creates new form AgregarUsuario
     */
    public ModificarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca= new Biblioteca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelNombreCompleto = new javax.swing.JLabel();
        jLabelTipoIdentificacion = new javax.swing.JLabel();
        jComboBoxTipoIdentificacion = new javax.swing.JComboBox<>();
        jLabelNumeroIdentificacion = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldContrasena = new javax.swing.JTextField();
        jTextFieldNombreCompleto = new javax.swing.JTextField();
        jTextFieldNumeroIdentificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Datos Personales");

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Modificar Datos Personales");

        jLabelNombreUsuario.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNombreUsuario.setText("Nombre de usuario:");

        jLabelContraseña.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(0, 51, 255));
        jLabelContraseña.setText("Contraseña:");

        jLabelNombreCompleto.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelNombreCompleto.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNombreCompleto.setText("Nombre Completo:");

        jLabelTipoIdentificacion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTipoIdentificacion.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTipoIdentificacion.setText("Tipo Identificación");

        jComboBoxTipoIdentificacion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jComboBoxTipoIdentificacion.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Extranjero" }));
        jComboBoxTipoIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoIdentificacionActionPerformed(evt);
            }
        });

        jLabelNumeroIdentificacion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelNumeroIdentificacion.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNumeroIdentificacion.setText("N° Identificación");

        jButtonModificar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setBorder(null);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldContrasena.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldNombreCompleto.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldNombreCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldNumeroIdentificacion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldNumeroIdentificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNombreUsuario)
                            .addGap(182, 182, 182)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNombreCompleto)
                                .addComponent(jLabelTipoIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNumeroIdentificacion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(jButtonCancelar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                            .addComponent(jComboBoxTipoIdentificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelTitulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreUsuario)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraseña)
                    .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCompleto)
                    .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoIdentificacion))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroIdentificacion)
                    .addComponent(jTextFieldNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
        menuBibliotecologo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxTipoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoIdentificacionActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
  
        biblioteca.
        
        
        
    }//GEN-LAST:event_jButtonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxTipoIdentificacion;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelNombreCompleto;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelNumeroIdentificacion;
    private javax.swing.JLabel jLabelTipoIdentificacion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    private javax.swing.JTextField jTextFieldNumeroIdentificacion;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
