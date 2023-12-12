/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appswing.components;

import appswing.TelaPrincipal;
import regras_negocio.Fachada;

/**
 *
 * @author anton
 */
public class CriarParticipante extends javax.swing.JPanel {

        /**
         * Creates new form Criar
         */
        public CriarParticipante() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jFormattedTextField1 = new javax.swing.JFormattedTextField();
                jTextField4 = new javax.swing.JTextField();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTextArea2 = new javax.swing.JTextArea();
                jTextArea2.setText(TelaPrincipal.output);
                jButton1 = new javax.swing.JButton();
                jFormattedTextField2 = new javax.swing.JFormattedTextField();

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(102, 102, 102));
                jLabel1.setText("Criar Participante");

                jLabel2.setForeground(new java.awt.Color(102, 102, 102));
                jLabel2.setText("CPF");

                jLabel3.setBackground(new java.awt.Color(102, 102, 102));
                jLabel3.setForeground(new java.awt.Color(102, 102, 102));

                jLabel4.setBackground(new java.awt.Color(102, 102, 102));
                jLabel4.setForeground(new java.awt.Color(102, 102, 102));
                jLabel4.setText("Data de Nascimento");

                jLabel5.setBackground(new java.awt.Color(102, 102, 102));
                jLabel5.setForeground(new java.awt.Color(102, 102, 102));
                jLabel5.setText("Empresa");

                jFormattedTextField1.setBackground(new java.awt.Color(242, 242, 242));
                jFormattedTextField1
                                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,
                                                new java.awt.Color(255, 204, 0)));
                jFormattedTextField1.setForeground(new java.awt.Color(102, 102, 102));
                try {
                        jFormattedTextField1.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("##/##/####")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                jFormattedTextField1.setText("");
                jFormattedTextField1.setToolTipText("01/01/2024");
                jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jFormattedTextField1ActionPerformed(evt);
                        }
                });

                jTextField4.setBackground(new java.awt.Color(242, 242, 242));
                jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jTextField4.setForeground(new java.awt.Color(102, 102, 102));
                jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,
                                new java.awt.Color(255, 204, 0)));

                jScrollPane2
                                .setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0,
                                                new java.awt.Color(255, 204, 0)));

                jTextArea2.setColumns(20);
                jTextArea2.setRows(5);
                jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0,
                                new java.awt.Color(255, 204, 0)));
                jScrollPane2.setViewportView(jTextArea2);

                jButton1.setBackground(new java.awt.Color(255, 204, 0));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("CONFIRMAR");
                jButton1.setBorder(
                                javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton1MouseClicked(evt);
                        }
                });
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jFormattedTextField2.setBackground(new java.awt.Color(242, 242, 242));
                jFormattedTextField2
                                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,
                                                new java.awt.Color(255, 204, 0)));
                jFormattedTextField2.setForeground(new java.awt.Color(102, 102, 102));
                try {
                        jFormattedTextField2.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("###.###.###-##")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                jFormattedTextField2.setToolTipText("01/01/2024");
                jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jFormattedTextField2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                181,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(340, 340,
                                                                                                                                340))
                                                                                                .addComponent(jFormattedTextField1,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                181,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jFormattedTextField2,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                180,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addGap(351, 351,
                                                                                                                                351))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jButton1,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jTextField4,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addGap(350, 350,
                                                                                                                                350))))
                                                                .addContainerGap(56, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jFormattedTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jFormattedTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                275,
                                                                                Short.MAX_VALUE)));
        }// </editor-fold>//GEN-END:initComponents

        private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFormattedTextField1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jFormattedTextField1ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFormattedTextField2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jFormattedTextField2ActionPerformed

        private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked

                String cpf = jFormattedTextField2.getText();
                cpf = cpf.replace(".", "").replace("-", "");
                String dataNascimento = jFormattedTextField1.getText();
                String empresa = jTextField4.getText();

                try {
                        if (empresa.trim().isEmpty()) {
                                Fachada.criarParticipante(cpf, dataNascimento);
                                jTextArea2.append("\n" + "Participante criado com sucesso!");
                                TelaPrincipal.output = jTextArea2.getText();
                        } else {
                                Fachada.criarConvidado(cpf, dataNascimento, empresa);
                                jTextArea2.append("\n" + "Convidado criado com sucesso!");
                                TelaPrincipal.output = jTextArea2.getText();
                        }
                } catch (Exception ex) {
                        jTextArea2.append("\n" + "Erro ao criar participante!");
                        TelaPrincipal.output = jTextArea2.getText();
                }
        }// GEN-LAST:event_jButton1MouseClicked

        public void updateOutput() {
                jTextArea2.setText(TelaPrincipal.output);
            }
            
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JFormattedTextField jFormattedTextField1;
        private javax.swing.JFormattedTextField jFormattedTextField2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextArea jTextArea2;
        private javax.swing.JTextField jTextField4;
        // End of variables declaration//GEN-END:variables
}
