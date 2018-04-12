/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import cr.ac.ucr.if3000.biblioteca.domain.Revista;
import java.util.Calendar;

/**
 *
 * @author daniela
 */
public class ModificarRevista extends javax.swing.JFrame {

    Biblioteca biblioteca;
    Revista revistaVieja;
    

    /**
     * Creates new form AgregarRevista
     */
    public ModificarRevista(Catalogo catalogoViejo) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        this.revistaVieja = (Revista) catalogoViejo;
        jTextFieldTitulo.setText(this.revistaVieja.getTitulo());
        jTextFieldFechaIngresoActual.setText(this.revistaVieja.getFechaIngreso());
        jTextFieldAutor.setText(this.revistaVieja.getAutor().getNombreCompleto());
        jTextFieldIssn.setText(this.revistaVieja.getIssn());
        jTextFieldEdicion.setText(this.revistaVieja.getEdicion());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAgregarRevista = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFechaIngreso = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelIssn = new javax.swing.JLabel();
        jLabelEdicion = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEdicion = new javax.swing.JTextField();
        jTextFieldIssn = new javax.swing.JTextField();
        jDateChooserFechaIngresoACambiar = new com.toedter.calendar.JDateChooser();
        jTextFieldFechaIngresoActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Revista");

        jLabelAgregarRevista.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelAgregarRevista.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAgregarRevista.setText("Modificar Revista");

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setText("Titulo:");

        jLabelFechaIngreso.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelFechaIngreso.setForeground(new java.awt.Color(0, 51, 255));
        jLabelFechaIngreso.setText("Fecha de ingreso:");

        jLabelAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(0, 51, 255));
        jLabelAutor.setText("Autor:");

        jLabelIssn.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelIssn.setForeground(new java.awt.Color(0, 51, 255));
        jLabelIssn.setText("ISSN:");

        jLabelEdicion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelEdicion.setForeground(new java.awt.Color(0, 51, 255));
        jLabelEdicion.setText("Edición");

        jButtonAgregar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonAgregar.setText("Modificar");
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

        jTextFieldAutor.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldEdicion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldEdicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTextFieldIssn.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTextFieldIssn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jDateChooserFechaIngresoACambiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabelAgregarRevista))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechaIngreso)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIssn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEdicion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFechaIngresoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserFechaIngresoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIssn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelAgregarRevista)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitulo)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelFechaIngreso)
                                .addComponent(jTextFieldFechaIngresoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooserFechaIngresoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAutor)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelIssn)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdicion)
                    .addComponent(jTextFieldEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
        menuBibliotecologo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
         String titulo = jTextFieldTitulo.getText();
        String nombreUnico = jTextFieldAutor.getText();
        String dia = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(jDateChooserFechaIngresoACambiar.getCalendar().get(Calendar.YEAR));
        String fechaIngreso = (dia+"-"+mes+"-"+año);
        Autor autor = biblioteca.buscaAutorPorNombreUnico(nombreUnico);
        String issn = jTextFieldIssn.getText();
        String edicion = jTextFieldEdicion.getText();
        Catalogo catalogoModificado = new Revista(issn, edicion, titulo, fechaIngreso, autor);
        biblioteca.modificarCatalogo(revistaVieja, catalogoModificado);
        dispose();
        Cátalogo catalogo = new Cátalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIngresoACambiar;
    private javax.swing.JLabel jLabelAgregarRevista;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelEdicion;
    private javax.swing.JLabel jLabelFechaIngreso;
    private javax.swing.JLabel jLabelIssn;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldEdicion;
    private javax.swing.JTextField jTextFieldFechaIngresoActual;
    private javax.swing.JTextField jTextFieldIssn;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
