/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.cadastro.Pessoa;
import control.reserva.Equipamento;
import static control.reserva.Reserva.reservas;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.CadastroEquipamento;

/**
 *
 * @author Kelli
 */
public class Reserva extends javax.swing.JFrame {

    public Reserva() {

        initComponents();
        setLocationRelativeTo(null);

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
        cxEquip = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cadPessoa = new javax.swing.JButton();
        cadEquip = new javax.swing.JButton();
        nomeResponsavel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regReserva = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cancelReserva = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CpfResp = new javax.swing.JTextField();
        verDetalhe = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stardust - Reservas");

        btnMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesActionPerformed(evt);
            }
        });

        tabelaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nomeResponsavel", "Equipamento", "dataReserva", "funcionario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaReserva.getTableHeader().setReorderingAllowed(false);
        tabelaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaReservaMouseClicked(evt);
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

        cxEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEquipActionPerformed(evt);
            }
        });

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

        cancelReserva.setText("Cancelar reserva");
        cancelReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservaActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF do responsavel");

        verDetalhe.setText("Ver Detalhes");
        verDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDetalheActionPerformed(evt);
            }
        });

        jLabel7.setText("Ano");

        btnAno.setModel(new javax.swing.DefaultComboBoxModel<>(control.reserva.Reserva.getAno()));
        btnAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnoActionPerformed(evt);
            }
        });

        jButton1.setText("Histórico de reservas");
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(cancelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(CpfResp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEquip)
                    .addComponent(cadPessoa)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cxEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(btnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelReserva)
                    .addComponent(regReserva)
                    .addComponent(verDetalhe)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesActionPerformed
        btnDia.setModel(new javax.swing.DefaultComboBoxModel<>(retornaDias()));
    }//GEN-LAST:event_btnMesActionPerformed

    private void btnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaActionPerformed
        cxEquip.setModel(new javax.swing.DefaultComboBoxModel<>(control.reserva.Reserva.retornaNomeItem()));
    }//GEN-LAST:event_btnDiaActionPerformed

    private void cadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPessoaActionPerformed

        view.CadastroPessoa cadastroPessoa = new CadastroPessoa();
        cadastroPessoa.setVisible(true);
        dispose();

        cadastroPessoa.addTab();
    }//GEN-LAST:event_cadPessoaActionPerformed

    private void cadEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEquipActionPerformed

        CadastroEquipamento cadItem = new CadastroEquipamento();
        cadItem.setVisible(true);
        dispose();

        cadItem.addTab();

    }//GEN-LAST:event_cadEquipActionPerformed

    private void regReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regReservaActionPerformed

        try {
            if (testaCampos()) {
                String data = (btnDia.getSelectedItem() + "/" + btnMes.getSelectedItem() + "/" + btnAno.getSelectedItem());

                if (control.reserva.Reserva.testarData(data)) {
                    if (testaCpfNumeros() && Pessoa.testCPF(CpfResp.getText())) {
                        Equipamento equip = CadastroEquipamento.itens.get(cxEquip.getSelectedIndex());

                        String item = (String) cxEquip.getSelectedItem();

                        control.reserva.Reserva res = new control.reserva.Reserva(
                                equip,
                                data,
                                nomeResponsavel.getText(),
                                Long.parseLong(CpfResp.getText())
                        );

                        if (control.reserva.Reserva.validarReserva(res)) {

                            control.reserva.Reserva.reservas.add(res);

                            control.reserva.Reserva.getLogReservas().add(res);

                            DefaultTableModel dtm = (DefaultTableModel) tabelaReserva.getModel();

                            String[] row = {nomeResponsavel.getText(), item, data, control.login.Login.getSessao().getNome()};

                            dtm.addRow(row);

                            JOptionPane.showMessageDialog(null, "Reserva registrada com sucesso");

                            clearCampos();

                        } else {

                            JOptionPane.showMessageDialog(null, "equipamento indisponível para reserva nessa data");

                        }
                    } else {

                        JOptionPane.showMessageDialog(null, "CPF inválido");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Data inválida. seleciona data após o dia de hoje");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro na operação: " + ex);
        }
    }//GEN-LAST:event_regReservaActionPerformed

    private void cancelReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservaActionPerformed

        if (tabelaReserva.getSelectedRow() != -1) {

            String dt = reservas.get(tabelaReserva.getSelectedRow()).getDataHoraReserva();

            try {
                if (control.reserva.Reserva.verSituacao(dt) != "Atrasado") {

                    Object[] opcoes = {"Confirmar", "Cancelar"};

                    if (JOptionPane.showOptionDialog(null, "Deseja cancelar esta reserva?", "Cancelar reserva", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) == 0) {

                        control.reserva.Reserva.reservas.remove(tabelaReserva.getSelectedRow());

                        DefaultTableModel dtm = (DefaultTableModel) tabelaReserva.getModel();

                        dtm.removeRow(tabelaReserva.getSelectedRow());

                        clearCampos();

                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Reservas atrasadas não podem ser canceladas");

                }
            } catch (ParseException ex) {
                Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione a ocorrência antes");
        }

    }//GEN-LAST:event_cancelReservaActionPerformed

    private void cxEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEquipActionPerformed

    }//GEN-LAST:event_cxEquipActionPerformed

    private void tabelaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaReservaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaReservaMouseClicked

    private void verDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDetalheActionPerformed

        if (tabelaReserva.getSelectedRow() != -1) {

            try {
                DetalheReserva detalhe = null;
                detalhe = new DetalheReserva(control.reserva.Reserva.reservas.get(tabelaReserva.getSelectedRow()));
                detalhe.setVisible(true);
                dispose();
            } catch (ParseException ex) {

                Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma reserva");
        }

    }//GEN-LAST:event_verDetalheActionPerformed

    private void btnAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnoActionPerformed
        btnMes.setModel(new javax.swing.DefaultComboBoxModel<>(control.reserva.Reserva.getMes()));
    }//GEN-LAST:event_btnAnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Historico historic = new Historico();
        historic.setVisible(true);
        dispose();


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

    public boolean testaCampos() {

        boolean data = ((btnAno.getSelectedItem() != "ano") && (btnMes.getSelectedItem() != "mes") && (btnDia.getSelectedItem() != "dia"));
        boolean nome = (!"".equals(nomeResponsavel.getText()));
        boolean cpf = (!"".equals(CpfResp.getText()));
        boolean equip;
        int tm = cxEquip.getItemCount();

        if (tm > 0) {
            equip = (!"".equals(cxEquip.getSelectedItem()));
        } else {
            equip = false;
        }
        return (data && nome && cpf && equip);

    }

    private void clearCampos() {

        btnAno.setSelectedIndex(0);
        String[] clr = {""};
        btnMes.setModel(new javax.swing.DefaultComboBoxModel<>(clr));
        btnDia.setModel(new javax.swing.DefaultComboBoxModel<>(clr));
        cxEquip.setModel(new javax.swing.DefaultComboBoxModel<>(clr));
        nomeResponsavel.setText("");
        CpfResp.setText("");

    }

    public void resetTab() {

        DefaultTableModel dtm = (DefaultTableModel) tabelaReserva.getModel();

        dtm.setNumRows(0);

        for (int j = 0; j < control.reserva.Reserva.reservas.size(); j++) {

            Object[] rw = {
                reservas.get(j).getDataHoraReserva(),
                reservas.get(j).getEquipamento().getNome(),
                reservas.get(j).getNomeResponsavel(),
                control.login.Login.getSessao().getNome()};

            dtm.addRow(rw);

        }
    }

    public boolean testaCpfNumeros() {

        try {

            double num = Double.parseDouble(CpfResp.getText());
            return true;

        } catch (Exception e) {

            return false;

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CpfResp;
    private javax.swing.JComboBox<String> btnAno;
    private javax.swing.JComboBox<Object> btnDia;
    private javax.swing.JComboBox<String> btnMes;
    private javax.swing.JButton cadEquip;
    private javax.swing.JButton cadPessoa;
    private javax.swing.JButton cancelReserva;
    private javax.swing.JComboBox<Object> cxEquip;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeResponsavel;
    private javax.swing.JButton regReserva;
    private javax.swing.JTable tabelaReserva;
    private javax.swing.JButton verDetalhe;
    // End of variables declaration//GEN-END:variables
}
