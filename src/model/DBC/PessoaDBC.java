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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            pst.setInt(5, pss.getMatricula());
            pst.setString(5, pss.getCargo());
            pst.setString(5, pss.getNomeUsuario());
            pst.setLong(5, pss.getCpf());

            JOptionPane.showMessageDialog(null, "parece q salvou, vai la ver no banco");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "HAYABUSA NÃO CONSEGUIU ULTAR AQUI PORQUE: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, pst);
        }

    }

    public List<Pessoa> listar() {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rSet = null;

        List<Pessoa> pessoas = new ArrayList();

        try {

            pst = conn.prepareStatement("SELECT * FROM Pessoa");

            rSet = pst.executeQuery();

            while (rSet.next()) {

                Pessoa pss = new Pessoa();

                pss.setNome(rSet.getString("nome"));
                pss.setSobrenome(rSet.getString("sobrenome"));
                pss.setEmail(rSet.getString("Email"));
                pss.setSenha(rSet.getString("Senha"));
                pss.setMatricula(rSet.getInt("matricula"));
                pss.setCargo(rSet.getString("cargo"));
                pss.setNomeUsuario(rSet.getString("nomeUser"));
                pss.setCpf(rSet.getInt("CPF"));
                pessoas.add(pss);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, pst, rSet);
        }

        return pessoas;

    }

    public void update(Pessoa pss) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pst = null;

        try {

            pst = conn.prepareStatement("UPDATE INTO Pessoa (nome, sobrenome, email, senha, matricula, cargo, nomeUser, CPF) values (?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setString(1, pss.getNome());
            pst.setString(2, pss.getSobrenome());
            pst.setString(3, pss.getEmail());
            pst.setString(4, pss.getSenha());
            pst.setInt(5, pss.getMatricula());
            pst.setString(5, pss.getCargo());
            pst.setString(5, pss.getNomeUsuario());
            pst.setLong(5, pss.getCpf());

            JOptionPane.showMessageDialog(null, "Deve ter alterado, vai la ver no banco");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ctrl + R n funciona aqui porque: " + ex);
        }

    }

}
