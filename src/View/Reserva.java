/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.CadastroItem;

/**
 *
 * @author Kelli
 */
public class Reserva extends javax.swing.JFrame {

    public Reserva() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaReserva = new javax.swing.JTable();
        btnDia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cxItem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cadPessoa = new javax.swing.JButton();
        cadEquip = new javax.swing.JButton();
        nomeResponsavel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regReserva = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMes.setModel(new javax.swing.DefaultComboBoxModel<>(control.reserva.Reserva.getMes()));
        btnMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesActionPerformed(evt);
            }
        });

        tabelaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Equipamento", "Responsável"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaReserva);

        btnDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mês");

        jLabel2.setText("Dia");

        jLabel3.setText("Equipamento");

        cadPessoa.setText("Cadastrar Pessoa");
        cadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPessoaActionPerformed(evt);
            }
        });

        cadEquip.setText("Cadastrar Equipamento");
        cadEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEquipActionPerformed(evt);
            }
        });

        jLabel4.setText("Responsavel");

        regReserva.setText("Registrar Reserva");
        regReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regReservaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Registrar Reserva");

        jButton1.setText("Cancelar reserva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(regReserva))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadEquip)
                                .addGap(18, 18, 18)
                                .addComponent(cadPessoa)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadPessoa)
                    .addComponent(cadEquip)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(regReserva))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesActionPerformed
        btnDia.setModel(new javax.swing.DefaultComboBoxModel<>(retornaDias()));
    }//GEN-LAST:event_btnMesActionPerformed

    private void btnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaActionPerformed
        cxItem.setModel(new javax.swing.DefaultComboBoxModel<>(control.reserva.Reserva.retornaNomeItem()));
    }//GEN-LAST:event_btnDiaActionPerformed

    private void cadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoaActionPerformed
        View.CadastroPessoa cadastroPessoa = new CadastroPessoa();
        cadastroPessoa.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadPessoaActionPerformed

    private void cadEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEquipActionPerformed

        CadastroItem cadItem = new CadastroItem();
        cadItem.setVisible(true);
        dispose();
        
        cadItem.addTab();
        
    }//GEN-LAST:event_cadEquipActionPerformed

    private void regReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regReservaActionPerformed

        String data = (btnDia.getSelectedItem() + " de " + btnMes.getSelectedItem());
        String item = (String) cxItem.getSelectedItem();
        
        control.reserva.Reserva res = new control.reserva.Reserva(item, data, nomeResponsavel.getText());
        
        if (control.reserva.Reserva.validarReserva(res)){
            
            control.reserva.Reserva.reservas.add(res);
            
            control.reserva.Reserva.getLogReservas().add(res);

        DefaultTableModel dtm = (DefaultTableModel) tabelaReserva.getModel();
        String[] row = {data, item, nomeResponsavel.getText()};
        dtm.addRow(row);
        
            JOptionPane.showMessageDialog(null, "Reserva registrada com sucesso");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "equipamento indisponível para reserva nessa data");
            
        }
  
        
    }//GEN-LAST:event_regReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        if (tabelaReserva.getSelectedRow() != -1) {
            
            Object[] opcoes = {"Confirmar", "Cancelar"};
            
            if (JOptionPane.showOptionDialog(null, "Deseja cancelar esta reserva?", "Cancelar reserva", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) == 0){
            
                control.reserva.Reserva.reservas.remove(tabelaReserva.getSelectedRow());
                
                DefaultTableModel dtm = (DefaultTableModel) tabelaReserva.getModel();
                
                dtm.removeRow(tabelaReserva.getSelectedRow());
                
                btnMes.setSelectedIndex(0);
                nomeResponsavel.setText("");
                btnDia.setSelectedIndex(0);
                
        }
            
        } else {
            JOptionPane.showMessageDialog(null,"Selecione a ocorrência antes");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public Reserva(JComboBox<String> btnMes, JScrollPane jScrollPane1, JTable tabelaReserva) throws HeadlessException {
        this.btnMes = btnMes;
        this.jScrollPane1 = jScrollPane1;
        this.tabelaReserva = tabelaReserva;
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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    public String[] retornaDias() {

        if (btnMes.getSelectedItem().equals("abril") || btnMes.getSelectedItem().equals("junho") || btnMes.getSelectedItem().equals("setembro") || btnMes.getSelectedItem().equals("novembro")) {
            return control.reserva.Reserva.getDia30();
        } else if (btnMes.getSelectedItem().equals("fevereiro")) {
            return control.reserva.Reserva.getDia28();
        } else if (btnMes.getSelectedItem().equals("mês")) {
            String[] vazio = {"dia"};
            return vazio;
        } else {

            return control.reserva.Reserva.getDia31();

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> btnDia;
    private javax.swing.JComboBox<String> btnMes;
    private javax.swing.JButton cadEquip;
    private javax.swing.JButton cadPessoa;
    private javax.swing.JComboBox<Object> cxItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeResponsavel;
    private javax.swing.JButton regReserva;
    private javax.swing.JTable tabelaReserva;
    // End of variables declaration//GEN-END:variables
}
