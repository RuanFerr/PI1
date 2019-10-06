/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Kelli
 */
import view.CadastroEquipamento;

import View.Reserva;
import control.cadastro.Funcionario;
import control.cadastro.Gerente;
import control.cadastro.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroPessoa extends javax.swing.JFrame {


    static ArrayList<Object> allP = new ArrayList();
    
    public CadastroPessoa() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox<>();
        nome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        addPessoa = new javax.swing.JButton();
        updatePessoa = new javax.swing.JButton();
        deletePessoa = new javax.swing.JButton();
        cadEquip = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        regReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPessoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nome");

        jLabel2.setText("sobrenome");

        jLabel3.setText("email");

        jLabel4.setText("senha");

        jLabel5.setText("CPF");

        jLabel6.setText("Cargo");

        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"cargo", "Gerente", "Funcionario", "Usuario"}));

        addPessoa.setText("Adicionar");
        addPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPessoaActionPerformed(evt);
            }
        });

        updatePessoa.setText("Atualizar");
        updatePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePessoaActionPerformed(evt);
            }
        });

        deletePessoa.setText("Excluir");

        cadEquip.setText("Cadastrar Equipamento");
        cadEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEquipActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cadastrar Pessoa");

        regReserva.setText("Registrar Reserva");
        regReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regReservaActionPerformed(evt);
            }
        });

        tabPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "sobrenome", "CPF", "Cargo", "Email"
            }
        ));
        jScrollPane1.setViewportView(tabPessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadEquip)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(regReserva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addPessoa)
                                .addGap(18, 18, 18)
                                .addComponent(updatePessoa)
                                .addGap(18, 18, 18)
                                .addComponent(deletePessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cpf)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 110, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sobrenome)
                                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regReserva))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPessoa)
                    .addComponent(updatePessoa)
                    .addComponent(deletePessoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEquipActionPerformed

        CadastroEquipamento cadastroItem = new CadastroEquipamento();
        cadastroItem.setVisible(true);
        this.dispose();

        cadastroItem.addTab();
    }//GEN-LAST:event_cadEquipActionPerformed

    private void regReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regReservaActionPerformed

        Reserva reserva = new Reserva();
        reserva.setVisible(true);
        dispose();

    }//GEN-LAST:event_regReservaActionPerformed

    private void addPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPessoaActionPerformed

        if (preencherCampos()) {

            String crg = (String) cargo.getSelectedItem();

            switch (crg) {

                case "funcionario":
                    
                    allP.add(new Funcionario());

                    break;
                case "gerente":
                    
                    allP.add(new Gerente());
                    
                    break;
                case "usuario":
                    
                    allP.add(new Usuario());
                    
                    break;
            }
        } else {

            JOptionPane.showMessageDialog(null, "Deve-se preencher todos os campos");

        }

    }//GEN-LAST:event_addPessoaActionPerformed

    private void updatePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePessoaActionPerformed
       
        
        
    }//GEN-LAST:event_updatePessoaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
            }
        });
    }

    public boolean preencherCampos() {

        boolean nome = !this.nome.getText().equals("");
        boolean sobrenome = !this.sobrenome.getText().equals("");
        boolean email = !this.email.getText().equals("");
        boolean senha = !this.senha.getText().equals("");
        boolean cpf = !this.cpf.getText().equals("");
        boolean cargo = !this.cargo.getSelectedItem().equals("");

        return (nome & sobrenome & email & senha & cpf & cargo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPessoa;
    private javax.swing.JButton cadEquip;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton deletePessoa;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton regReserva;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JTable tabPessoa;
    private javax.swing.JButton updatePessoa;
    // End of variables declaration//GEN-END:variables
}
