/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DBC;

import control.cadastro.Pessoa;
import control.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelli
 */
public class PessoaDBC {

    public void insert(Pessoa pss) {

        Connection conn = ConnectionFactory.getConnection();

        PreparedStatement pst = null;

        try {

            pst = conn.prepareStatement("INSERT INTO Pessoa (nome, sobrenome, email, senha, matricula, cargo, nomeUser, CPF) values (?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setString(1, pss.getNome());
            pst.setString(2, pss.getSobrenome());
            pst.setString(3, pss.getEmail());
            pst.setString(4, pss.getSenha());
            pst.setString(5, String.valueOf(pss.getMatricula()));
            pst.setString(5, pss.getCargo());
            pst.setString(5, pss.getNomeUsuario());
            pst.setString(5, String.valueOf(pss.getCpf()));

            JOptionPane.showMessageDialog(null, "parece q salvou, vai la ver no banco");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "HAYABUSA NÃO CONSEGUIU ULTAR AQUI PORQUE: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, pst);
        }

    }

}
