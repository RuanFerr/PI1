package control.login;

import javax.swing.JOptionPane;
import control.cadastro.*;
import java.util.ArrayList;

public class Login {

    private Pessoa pessoa;

    private ArrayList<Pessoa> grpPessoa = new ArrayList();
    
    private static int indexLogin;

    public Login() {

    }

    public static boolean login(String login, String senha) {

        Pessoa ps = new Pessoa();

        ps.setEmail("teste@gmail.com");
        ps.setSenha("123456");

        if (login.equals(ps.getEmail()) && (senha.equals(ps.getSenha()))) {
            JOptionPane.showMessageDialog(null, "Login Efetuado Com Sucesso");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos");
        }

        return false; // apenas por conveniencia por enquanto;

    }

    public static boolean newLogin() {

        Pessoa[] pss = {new Pessoa()};

        return true;
    }

    public boolean pssAddFirst(String login, String senha) {

        grpPessoa.add(new Pessoa());
        grpPessoa.get(0).setEmail("teste@gmail.com");
        grpPessoa.get(0).setSenha("123456");
        
        

        Pessoa p = new Pessoa();

        for (int i = 0; i < grpPessoa.size(); i++) {

            if (login.equals(grpPessoa.get(i).getEmail()) && senha.equals(grpPessoa.get(i).getSenha())) {

                p = grpPessoa.get(i);
                i = grpPessoa.size();
                
                JOptionPane.showMessageDialog(null, "Login Efetuado Com Sucesso");
                
                indexLogin = i;
                
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Email ou senha incorretos");
        return false;
    }

}
