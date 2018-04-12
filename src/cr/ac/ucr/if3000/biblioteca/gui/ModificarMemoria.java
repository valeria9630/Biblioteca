/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import cr.ac.ucr.if3000.biblioteca.domain.Memoria;
import java.util.Calendar;

/**
 *
 * @author daniela
 */
public class ModificarMemoria extends javax.swing.JFrame {

    Biblioteca biblioteca;
    Memoria memoriaVieja;

    /**
     * Creates new form AgregarMemoria
     */
    public ModificarMemoria(Catalogo catalogo) {
        biblioteca = new Biblioteca();
        initComponents();
        memoriaVieja = (Memoria) catalogo;
        setLocationRelativeTo(null);
        setResizable(false);
        jTextFieldTitulo.setText(this.memoriaVieja.getTitulo());
        jTextFieldFechaIngesoActual.setText(memoriaVieja.getFechaIngreso());
           jTextFieldAutor.setEnabled(false);
        jTextFieldAutor.setText(this.memoriaVieja.getAutor().getNombreUnico());
        jTextFieldResumen.setText(this.memoriaVieja.getResumen());
        jTextFieldAbstract.setText(this.memoriaVieja.getAbstracto());
        jTextFieldNombreDeConferencia.setText(this.memoriaVieja.getNombreConferencia());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAgregarMemoria = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFechaIngreso = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelResumen = new javax.swing.JLabel();
        jLabelAbstract = new javax.swing.JLabel();
        jLabelNombreConferencia = new javax.swing.JLabel();
        jDateChooserFechaIngresoACambiar = new com.toedter.calendar.JDateChooser();
        jTextFieldFechaIngesoActual = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldResumen = new javax.swing.JTextField();
        jTextFieldAbstract = new javax.swing.JTextField();
        jTextFieldNombreDeConferencia = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Memoria");

        jLabelAgregarMemoria.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelAgregarMemoria.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAgregarMemoria.setText("Modificar memoria ");

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Titulo:");

        jLabelFechaIngreso.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelFechaIngreso.setForeground(new java.awt.Color(0, 51, 255));
        jLabelFechaIngreso.setText("Fecha de ingreso:");

        jLabelAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(0, 21, 255));
        jLabelAutor.setText("Autor:");

        jLabelResumen.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelResumen.setForeground(new java.awt.Color(0, 51, 255));
        jLabelResumen.setText("Resumen:");

        jLabelAbstract.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelAbstract.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAbstract.setText("Abstract:");

        jLabelNombreConferencia.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelNombreConferencia.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNombreConferencia.setText("Nombre de conferencia:");

        jDateChooserFechaIngresoACambiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldResumen.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldResumen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldAbstract.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldAbstract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldNombreDeConferencia.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldNombreDeConferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAbstract)
                    .addComponent(jLabelNombreConferencia)
                    .addComponent(jLabelResumen)
                    .addComponent(jLabelAutor)
                    .addComponent(jLabelFechaIngreso)
                    .addComponent(jLabelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombreDeConferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jTextFieldAbstract, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jTextFieldResumen, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldFechaIngesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserFechaIngresoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabelAgregarMemoria)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelAgregarMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserFechaIngresoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaIngesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelAbstract)
                                            .addComponent(jTextFieldAbstract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelNombreConferencia)
                                            .addComponent(jTextFieldNombreDeConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancelar))
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFechaIngreso)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
        menuBibliotecologo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Catalogo catalogoModificado = null;
        String titulo = jTextFieldTitulo.getText();
        String nombreUnico = jTextFieldAutor.getText();

        Autor autor = biblioteca.buscaAutorPorNombreUnico(nombreUnico);
        String remunen = jTextFieldResumen.getText();
        String abstracto = jTextFieldAbstract.getText();
        String nombreConferencia = jTextFieldNombreDeConferencia.getText();
        if (jDateChooserFechaIngresoACambiar.getDate() == null) {
            catalogoModificado = new Memoria(remunen, abstracto, nombreConferencia, titulo, jTextFieldFechaIngesoActual.getText(), autor, memoriaVieja.getCodigoCatalogo());
        } else if (jDateChooserFechaIngresoACambiar.getDate() != null) {
            String dia = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.MONTH) + 1);
            String año = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.YEAR));
            String fechaIngreso = (dia + "-" + mes + "-" + año);
            catalogoModificado = new Memoria(remunen, abstracto, nombreConferencia, titulo, fechaIngreso, autor, memoriaVieja.getCodigoCatalogo());
        }
        biblioteca.modificarCatalogo(memoriaVieja, catalogoModificado);
        dispose();
        OpcionesCatalogo catalogo = new OpcionesCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModificarMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModificarMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModificarMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModificarMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModificarMemoria().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIngresoACambiar;
    private javax.swing.JLabel jLabelAbstract;
    private javax.swing.JLabel jLabelAgregarMemoria;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelFechaIngreso;
    private javax.swing.JLabel jLabelNombreConferencia;
    private javax.swing.JLabel jLabelResumen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAbstract;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldFechaIngesoActual;
    private javax.swing.JTextField jTextFieldNombreDeConferencia;
    private javax.swing.JTextField jTextFieldResumen;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
