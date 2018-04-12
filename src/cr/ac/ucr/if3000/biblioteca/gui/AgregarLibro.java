/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import cr.ac.ucr.if3000.biblioteca.domain.Libro;
import java.util.Calendar;

/**
 *
 * @author daniela
 */
public class AgregarLibro extends javax.swing.JFrame {

    Biblioteca biblioteca;

    /**
     * Creates new form agregarLibro
     */
    public AgregarLibro() {
        biblioteca = new Biblioteca();

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAgregarLibro = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFechaIngreso = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelIsbn = new javax.swing.JLabel();
        jLabelTema = new javax.swing.JLabel();
        jLabelSubtema = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jDateChooserFechaIngreso = new com.toedter.calendar.JDateChooser();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldIsbn = new javax.swing.JTextField();
        jTextFieldTema = new javax.swing.JTextField();
        jTextFieldSubtema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Libro");

        jLabelAgregarLibro.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelAgregarLibro.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAgregarLibro.setText("         Agregar Libro");

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Titulo :");

        jLabelFechaIngreso.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelFechaIngreso.setForeground(new java.awt.Color(0, 51, 255));
        jLabelFechaIngreso.setText("Fecha de ingreso:");

        jLabelAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAutor.setText("Autor:");

        jLabelIsbn.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelIsbn.setForeground(new java.awt.Color(0, 51, 255));
        jLabelIsbn.setText("ISBN:");

        jLabelTema.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTema.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTema.setText("Tema:");

        jLabelSubtema.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelSubtema.setForeground(new java.awt.Color(0, 51, 255));
        jLabelSubtema.setText("Subtema");

        jButtonAgregar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.setBorder(null);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
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

        jDateChooserFechaIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldIsbn.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldIsbn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldTema.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldTema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldSubtema.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldSubtema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabelAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelFechaIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAutor)
                            .addComponent(jLabelIsbn))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSubtema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldSubtema, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAgregarLibro)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaIngreso)
                    .addComponent(jDateChooserFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIsbn)
                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTema)
                    .addComponent(jTextFieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSubtema)
                    .addComponent(jTextFieldSubtema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        OpcionesCatalogo catalogo = new OpcionesCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
<<<<<<< HEAD
        Autor autor1 = new Autor("andres Calamaro", "opp", "ppo", "njsvn", "hsbdvj");
        Autor autor2 = new Autor("rocio", "a", "a", "a", "a");
=======
        Autor autor1 = new Autor("andres Calamaro", "opp", "andresCalamaro", "njsvn", "hsbdvj");
        Autor autor2 = new Autor("rocio", "jdbv", "bvj", "djkb", "jk");
>>>>>>> a402110397bf3ed0a1c9ad42500ce11198e564d1
        biblioteca.agregarPersona(autor1);
        biblioteca.agregarPersona(autor2);

        String titulo = jTextFieldTitulo.getText();
        String dia = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(jDateChooserFechaIngreso.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "-" + mes + "-" + año);
        String nombreAutor = jTextFieldAutor.getText();
        String isbn = jTextFieldIsbn.getText();
        String tema = jTextFieldTema.getText();
        String subtema = jTextFieldSubtema.getText();
        Autor autor = biblioteca.buscaAutorPorNombreUnico(nombreAutor);

      
        Libro libro = new Libro(isbn, tema, subtema, titulo, fecha, autor);

        biblioteca.agregarCatalogo(libro);
        dispose();

        OpcionesCatalogo catalogo = new OpcionesCatalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIngreso;
    private javax.swing.JLabel jLabelAgregarLibro;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelFechaIngreso;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelSubtema;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldSubtema;
    private javax.swing.JTextField jTextFieldTema;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
