/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kelli
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/stardust";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {

            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {

            throw new RuntimeException(" SUA CONEXÃO NÃO VENCEU A GUERRA DO SANTO GRAAL POR CAUSA DE: ", ex); //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public static void closeConnection(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("O Q ACONTECE SE VC ABRE 500 ABAS, E TIRA O MOUSE E O TECLADO: ", ex);//Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    //OVERLOAD DA CLOSECONNECTION ANTERIOR, PRA FECHAR A CONEXÃO E O STATEMENT
    public static void closeConnection(Connection connection, PreparedStatement pst) {

        closeConnection(connection);
        
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("O Q ACONTECE SE VC ABRE 500 ABAS, E TIRA O MOUSE E O TECLADO: ", ex);//Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    //OVERLOAD DAS ANTERIORES, QUE FECHA TUDO, ATÉ O OBJETO Q ESTAMOS GUARDANDO OS RESULTADOS DAS CONSULTAS AO BANCO
    public static void closeConnection(Connection connection, PreparedStatement pst, ResultSet rSet) {

        closeConnection(connection, pst);
        
        
        try {
            if (rSet != null) {
                rSet.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("O Q ACONTECE SE VC ABRE 500 ABAS, E TIRA O MOUSE E O TECLADO: ", ex);//Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
    

}
