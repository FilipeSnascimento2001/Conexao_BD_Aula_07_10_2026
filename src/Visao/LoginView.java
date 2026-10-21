package Visao;
import javax.swing.*;
public class LoginView extends JFrame {
    public LoginView() {
        setTitle("Tela de Login");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel = new JPanel();
        add(panel);
    }
}
