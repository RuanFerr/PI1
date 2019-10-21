/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import control.reserva.*;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kelli
 */
public class DetalheReserva extends javax.swing.JFrame {

    /**
     * Creates new form DetalheReserva
     */
    public DetalheReserva() {

        setLocationRelativeTo(null);
        initComponents();

    }
    control.reserva.Reserva res;

    public DetalheReserva(control.reserva.Reserva res) throws ParseException {

        initComponents();

        setLocationRelativeTo(null);

        this.res = res;

        String a = "" + res.getEquipamento().getNumSerie();

        labNome.setText(res.getEquipamento().getNome());
        labMarca.setText(res.getEquipamento().getMarca());
        labDescricao.setText(res.getEquipamento().getDescricao());
        labNumSerie.setText(a);

        labNomePess.setText(res.getNomeResponsavel());

        labCpfPess.setText("" + res.getCpfResp());

        labDataReserva.setText(res.getDataHoraReserva());

        labSituacao.setText(control.reserva.Reserva.verSituacao(res.getDataHoraReserva()));

        this.ret = 1;

    }

    public DetalheReserva(HistoricoDevolucao hist) throws ParseException {

        initComponents();

        String a = "" + hist.getReserva().getEquipamento().getNumSerie();

        labNome.setText(hist.getReserva().getEquipamento().getNome());
        labMarca.setText(hist.getReserva().getEquipamento().getMarca());
        labDescricao.setText(hist.getReserva().getEquipamento().getDescricao());
        labNumSerie.setText(a);

        labNomePess.setText(hist.getReserva().getNomeResponsavel());

        labCpfPess.setText("" + hist.getReserva().getCpfResp());

        labDataReserva.setText(hist.getReserva().getDataHoraReserva());

        labSituacao.setText(control.reserva.Reserva.verSituacao(hist.getReserva().getDataHoraReserva()));

        txtDano.setText(hist.getDano().getDano());
        
        this.ret = 2;

        btnDevolucao.setEnabled(false);
        checkDano.setEnabled(false);
        txtDano.setEnabled(true);

        btnDevolucao.setVisible(false);

        txtDano.setEditable(false);
        
        

    }
    private int ret;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        pnlEquip = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labMarca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labDescricao = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labNumSerie = new javax.swing.JLabel();
        panelPessoa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labNomePess = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labCpfPess = new javax.swing.JLabel();
        pnlStatus = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labDataReserva = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labSituacao = new javax.swing.JLabel();
        btnDevolucao = new javax.swing.JButton();
        pnlDano = new javax.swing.JPanel();
        checkDano = new javax.swing.JCheckBox();
        txtDano = new javax.swing.JTextField();
        btnRetornar = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEquip.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipamento"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        labNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labNome.setText("nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Marca:");

        labMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labMarca.setText("marca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Descricao:");

        labDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labDescricao.setText("descricao");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("numero de serie:");

        labNumSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labNumSerie.setText("numserie");

        javax.swing.GroupLayout pnlEquipLayout = new javax.swing.GroupLayout(pnlEquip);
        pnlEquip.setLayout(pnlEquipLayout);
        pnlEquipLayout.setHorizontalGroup(
            pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquipLayout.createSequentialGroup()
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEquipLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEquipLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)))
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labNumSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEquipLayout.setVerticalGroup(
            pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labNome)
                    .addComponent(jLabel3)
                    .addComponent(labMarca))
                .addGap(18, 18, 18)
                .addGroup(pnlEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(labNumSerie))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        jLabel2.setText("Nome:");

        labNomePess.setText("nomePess");

        jLabel10.setText("CPF:");

        labCpfPess.setText("CPF");

        javax.swing.GroupLayout panelPessoaLayout = new javax.swing.GroupLayout(panelPessoa);
        panelPessoa.setLayout(panelPessoaLayout);
        panelPessoaLayout.setHorizontalGroup(
            panelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labNomePess, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labCpfPess, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        panelPessoaLayout.setVerticalGroup(
            panelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(labCpfPess))
                    .addGroup(panelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labNomePess)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jLabel4.setText("Reservado para: ");

        labDataReserva.setText("dataReserva");

        jLabel6.setText("Situação: ");

        labSituacao.setText("situacao");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(labSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labDataReserva)
                    .addComponent(jLabel6)
                    .addComponent(labSituacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDevolucao.setText("registrar devolucao");
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });

        pnlDano.setBorder(javax.swing.BorderFactory.createTitledBorder("Dano"));

        checkDano.setText("Dano no aparelho");
        checkDano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDanoActionPerformed(evt);
            }
        });

        txtDano.setEnabled(false);
        txtDano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDanoLayout = new javax.swing.GroupLayout(pnlDano);
        pnlDano.setLayout(pnlDanoLayout);
        pnlDanoLayout.setHorizontalGroup(
            pnlDanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(checkDano)
                .addGap(18, 18, 18)
                .addComponent(txtDano)
                .addContainerGap())
        );
        pnlDanoLayout.setVerticalGroup(
            pnlDanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkDano)
                    .addComponent(txtDano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEquip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnDevolucao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetornar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetornar)
                .addGap(13, 13, 13)
                .addComponent(pnlEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnDevolucao)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed

        HistoricoDevolucao hsD = new HistoricoDevolucao(res, "DEVOLUCAO", new Date(), (control.login.Login.getSessao().getNome() + " " + control.login.Login.getSessao().getSobrenome()));
        if (checkDano.isSelected()) {
            hsD.setDano(new Dano(res.getEquipamento(), new Date(), txtDano.getText()));
            
        } else {

            hsD.setDano(null);

        }

        HistoricoDevolucao.getHistoricoDevolucao().add(hsD);

        control.reserva.Reserva.reservas.remove(hsD.getReserva());

        JOptionPane.showMessageDialog(null, "Sucess!");

        Reserva reser = new Reserva();
        reser.setVisible(true);
        dispose();
        reser.resetTab();

    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void txtDanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDanoActionPerformed

    }//GEN-LAST:event_txtDanoActionPerformed

    private void checkDanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDanoActionPerformed

        if (checkDano.isSelected()) {

            txtDano.setEnabled(true);

        } else {
            txtDano.setEnabled(false);
        }

    }//GEN-LAST:event_checkDanoActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        switch (ret) {
            case 1:
                Reserva reser = new Reserva();
                reser.setVisible(true);
                this.dispose();
                reser.resetTab();
                break;
            case 2:
                Historico hist = new Historico();
                hist.setVisible(true);
                this.dispose();
                hist.resetTab();
                break;
        }
    }//GEN-LAST:event_btnRetornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(DetalheReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalheReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalheReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalheReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalheReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JCheckBox checkDano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labCpfPess;
    private javax.swing.JLabel labDataReserva;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labMarca;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNomePess;
    private javax.swing.JLabel labNumSerie;
    private javax.swing.JLabel labSituacao;
    private javax.swing.JPanel panelPessoa;
    private javax.swing.JPanel pnlDano;
    private javax.swing.JPanel pnlEquip;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JTextField txtDano;
    // End of variables declaration//GEN-END:variables
}
