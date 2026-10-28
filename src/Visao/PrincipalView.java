package Visao;

import utils.SessaoUsuario;
import javax.swing.*;
import java.awt.*;

public class PrincipalView extends JFrame {

    public PrincipalView() {
        setTitle("Sistema Acadêmico - Painel Principal");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JPanel dados = new JPanel(new GridLayout(2, 1));

        String nomeUsuario = SessaoUsuario
                .getUsuarioLogado().getLogin();

        boolean ehAdmin = SessaoUsuario.isAdmin();

        JLabel lblBoasVindas = new JLabel(
            "Bem-vindo, " + nomeUsuario + "!",
            SwingConstants.CENTER
        );
        lblBoasVindas.setFont(
            new Font("Arial", Font.BOLD, 16)
        );

        JLabel lblPerfil = new JLabel(
            "Perfil de acesso: " +
            (ehAdmin ? "Administrador" : "Usuário Comum"),
            SwingConstants.CENTER
        );

        dados.add(lblBoasVindas);
        dados.add(lblPerfil);

        panel.add(dados, BorderLayout.CENTER);

        add(panel);
    }
}