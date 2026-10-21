import bd.BD;
import controle.LoginControl;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] dadosEntrada) {
        BD.iniciarBD();


        SwingUtilities.invokeLater(() -> {
            LoginControl loginControl = new LoginControl();
            loginControl.exibreJanela();
        });
    }
}