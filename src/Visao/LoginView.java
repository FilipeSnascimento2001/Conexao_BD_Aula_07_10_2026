package Visao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    public LoginView() {
        setTitle("Tela de login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Usuário:"));
        txtUsuario = new JTextField();
        panel.add(txtUsuario);

        panel.add(new JLabel("Senha:"));
        txtSenha = new JPasswordField();
        panel.add(txtSenha);

        panel.add(new JLabel("")); // Espaçador
        btnEntrar = new JButton("Entrar");
        panel.add(btnEntrar);
        add(panel);

    
    }
    public String getUsuaruio() {
        return txtUsuario.getText().trim();
    }
    public String getSenha() {
        return new String(txtSenha.getPassword());
    }
    public void addEntrarListener
    (ActionListener listener) {
        btnEntrar.addActionListener(listener);
    }
}