package bd;

import DAO.UsuarioDAO;
import modelo.Usuario;
import java.util.Scanner;

public class BD {

    public static void iniciarBD() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        int totalAdmins = usuarioDAO.contar("admin = true");

        if (totalAdmins == 0) {
            System.out.println("\n--- INICIALIZAÇÃO DO SISTEMA ---");
            System.out.println("Nenhum usuário administrador encontrado no banco de dados.");

            Scanner scanner = new Scanner(System.in);
            String senha;

            do {
                System.out.print("Digite a senha para o novo usuário 'admin': ");
                senha = scanner.nextLine().trim();

                if (senha.isEmpty()) {
                    System.err.println("A senha não pode ser vazia!");
                }
            } while (senha.isEmpty());

            Usuario admin = new Usuario("admin", senha, true);
            int idGerado = usuarioDAO.cadastrar(admin);

            if (idGerado > 0) {
                System.out.println("Usuário 'admin' cadastrado com sucesso! (ID gerado: "
                        + idGerado + ")");
            } else {
                System.err.println("Falha ao cadastrar o usuário 'admin'.");
            }

            scanner.close();

        } else if (totalAdmins == 1) {
            System.out.println("Inicialização do BD: Já existe 1 administrador no sistema.");
        } else {
            System.out.println("Inicialização do BD: Já existem " + totalAdmins
                    + " administradores no sistema.");
        }
    }
}
