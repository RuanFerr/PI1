package control.login;

import javax.swing.JOptionPane;
import control.cadastro.*;

public class Login {
    
    

    public static boolean login(String login, String senha) {
        
       Pessoa ps = new Pessoa();
       ps.setEmail("teste@gmail.com");
       ps.setSenha("123456");
       
       if ( login.equals(ps.getEmail()) && (senha.equals(ps.getSenha())) ){
           JOptionPane.showMessageDialog(null, "Login Efetuado Com Sucesso");
           return true;
       } else {
           JOptionPane.showMessageDialog(null, "Email ou senha incorretos");
       }
        
        return false; // apenas por conveniencia por enquanto;
        
    }
}
