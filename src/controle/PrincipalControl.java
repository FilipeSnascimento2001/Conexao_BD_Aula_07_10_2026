package controle;

import Visao.PrincipalView;

public class PrincipalControl {

    private PrincipalView view;

    public PrincipalControl() {
        this.view = new PrincipalView();
    }

    public void exibeJanela() {
        this.view.setVisible(true);
    }
}