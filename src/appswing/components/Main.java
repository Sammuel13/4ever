package appswing.components;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Event;
import java.awt.LinearGradientPaint;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import appswing.TelaEventos;
import appswing.TelaIngressos;
import appswing.TelaParticipantes;
import modelo.Convidado;
import modelo.Evento;
import modelo.Ingresso;
import modelo.Participante;
import regras_negocio.Fachada;

public class Listar extends JPanel {

    public Listar() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(width, height); // Gradiente diagonal
        float[] fractions = {0.0f, 0.5f, 1.0f};
        // Ajuste essas cores para combinar com a imagem enviada
        Color[] colors = {new Color(255, 105, 180), new Color(75, 0, 130), new Color(0, 191, 255)};

        LinearGradientPaint gp = new LinearGradientPaint(start, end, fractions, colors);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        eventoTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(606, 641));

        eventoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Capacidade", "Preço", "Qtd. Ingressos", "Total Arrecadado", "Está Lotado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(eventoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void updateScrollPane(int janela) {
        if (janela == 0) {
            ArrayList<Evento> eventos = Fachada.listarEventos();
            System.out.println(eventos);
            
            DefaultTableModel model = (DefaultTableModel) eventoTable.getModel();
            model.setRowCount(0);
            
            for (Evento evento : eventos) {
                model.addRow(new Object[] { evento.getId(), evento.getData(), evento.getCapacidade(), evento.getPreco(), evento.getIngressos().size(), evento.totalArrecadado(), evento.lotado() });
            }
            jScrollPane1.setViewportView(eventoTable);
            
        } else if (janela == 1) {
            ArrayList<Ingresso> ingressos = Fachada.listarIngressos();
            
            DefaultTableModel model = (DefaultTableModel) IngressoTable.getModel();
            model.setRowCount(0);
            
            for (Ingresso ingresso : ingressos) {
                model.addRow(new Object[] { ingresso.getCodigo(), ingresso.getTelefone(), ingresso.calcularPreco(), ingresso.getEvento().getPreco(), ingresso.getEvento().getData(), ingresso.getParticipante().calcularIdade() });
            }
            jScrollPane1.setViewportView(IngressoTable);
            
        } else if (janela == 2) {
            ArrayList<Participante> participantes = Fachada.listarParticipantes();
            
            DefaultTableModel model = (DefaultTableModel) participanteTable.getModel();
            model.setRowCount(0);
            
            for (Participante participante : participantes) {
                model.addRow(new Object[] { participante.getCpf(), participante.getNascimento(), participante.calcularIdade(),
                    participante instanceof Convidado ? ((Convidado) participante).getEmpresa() : "" });
                }
                jScrollPane1.setViewportView(participanteTable);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable eventoTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
