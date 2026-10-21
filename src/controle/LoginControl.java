package controle;

import Visao.LoginView;

public class LoginControl {
    private LoginView view;

    public LoginControl() {
        this.view = new LoginView();
    }
    public void exibreJanela() {
        this.view.setVisible(true);
    }
}
