package appswing.components;

import javax.swing.JPanel;
import java.awt.Event;
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

public class ListarEventos extends JPanel {

    public ListarEventos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        
        setPreferredSize(new java.awt.Dimension(606, 641));
        
        table = new javax.swing.JTable();

        ArrayList<Evento> eventos = Fachada.listarEventos();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);

        model.addColumn("ID");
        model.addColumn("Data");
        model.addColumn("Capacidade");
        model.addColumn("Preço");
        model.addColumn("Ingresso");
        model.addColumn("Total");
        model.addColumn("Lotado");

        for (Evento evento : eventos) {
            model.addRow(new Object[] { evento.getId(), evento.getData(), evento.getCapacidade(), evento.getPreco(), evento.getIngressos().size(), evento.totalArrecadado(), evento.lotado() });
        }

        table.setModel(model);

        table.getTableHeader().setReorderingAllowed(false);

        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // public void updateScrollPane() {
    //     if (janela == 0) {
    //         ArrayList<Evento> eventos = Fachada.listarEventos();
    //         System.out.println(eventos);
            
    //         model.setRowCount(0);
    //         for (Evento evento : eventos) {
    //             model.addRow(new Object[] { evento.getId(), evento.getData(), evento.getCapacidade(), evento.getPreco(), evento.getIngressos().size(), evento.totalArrecadado(), evento.lotado() });
    //         }
            
    //         table.setModel(new javax.swing.table.DefaultTableModel(
    //             new Object [][] {

    //             },
    //             new String [] {
    //                 "ID", "Data", "Capacidade", "Preço", "Ingressos", "Total", "Lotado"
    //             }
    //         ) {
    //             Class[] types = new Class [] {
    //                 java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
    //             };
    //             boolean[] canEdit = new boolean [] {
    //                 false, false, false, false, false, false, false
    //             };

    //             public Class getColumnClass(int columnIndex) {
    //                 return types [columnIndex];
    //             }

    //             public boolean isCellEditable(int rowIndex, int columnIndex) {
    //                 return canEdit [columnIndex];
    //             }
    //         });
            
    //     } else if (janela == 1) {
    //         ArrayList<Ingresso> ingressos = Fachada.listarIngressos();
            
    //         for (Ingresso ingresso : ingressos) {
    //             model.addRow(new Object[] { ingresso.getCodigo(), ingresso.getTelefone(), ingresso.calcularPreco(), ingresso.getEvento().getPreco(), ingresso.getEvento().getData(), ingresso.getParticipante().calcularIdade() });
    //         }

    //         table.setModel(new javax.swing.table.DefaultTableModel(
    //             new Object [][] {

    //             },
    //             new String [] {
    //                 "Código", "Telefone", "P Ingresso", "P Evento", "Data", "Idade"
    //             }
    //         ) {
    //             Class[] types = new Class [] {
    //                 java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    //             };
    //             boolean[] canEdit = new boolean [] {
    //                 false, false, false, false, false, false
    //             };

    //             public Class getColumnClass(int columnIndex) {
    //                 return types [columnIndex];
    //             }

    //             public boolean isCellEditable(int rowIndex, int columnIndex) {
    //                 return canEdit [columnIndex];
    //             }
    //         });
            
    //     } else if (janela == 2) {
    //         ArrayList<Participante> participantes = Fachada.listarParticipantes();
            
    //         for (Participante participante : participantes) {
    //             model.addRow(new Object[] { participante.getCpf(), participante.getNascimento(), participante.calcularIdade(),
    //                                         participante instanceof Convidado ? ((Convidado) participante).getEmpresa() : "" });
    //         }

    //         table.setModel(new javax.swing.table.DefaultTableModel(
    //             new Object [][] {

    //             },
    //             new String [] {
    //                 "CPF", "Dt Nasc", "Idade", "Empresa"
    //             }
    //         ) {
    //             Class[] types = new Class [] {
    //                 java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    //             };
    //             boolean[] canEdit = new boolean [] {
    //                 false, false, false, false
    //             };

    //             public Class getColumnClass(int columnIndex) {
    //                 return types [columnIndex];
    //             }

    //             public boolean isCellEditable(int rowIndex, int columnIndex) {
    //                 return canEdit [columnIndex];
    //             }
    //         });   
    //     }
    //     table.getTableHeader().setReorderingAllowed(false);
    //     jScrollPane1.setViewportView(table);
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
