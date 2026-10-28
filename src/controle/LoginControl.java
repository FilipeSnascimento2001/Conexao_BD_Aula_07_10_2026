package controle;

import Visao.LoginView;

public class LoginControl {
    private LoginView view;


    public LoginControl() {
        this.view = new LoginView();
        this.view.addEntrarListener(e -> efetuarLogin());
    }
    private void efetuarLogin() {
        String login = view.getUsuaruio();
        String senha = view.getSenha();
        System.out.println("Apertou o botão: " +login+" | " +senha);
    }
    public void exibreJanela() {
        this.view.setVisible(true);
    }
}
