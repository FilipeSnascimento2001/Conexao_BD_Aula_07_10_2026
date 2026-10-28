import bd.BD;
import controle.LoginControl;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] dadosEntrada) {
        BD.iniciarBD();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            LoginControl loginControl = new LoginControl();
            loginControl.exibreJanela();
        }});
    }
}