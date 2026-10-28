package utils;

import modelo.Usuario;

public class SessaoUsuario {

    private static Usuario usuarioLogado;

    public static void iniciarSessao(Usuario usuario) {
        usuarioLogado = usuario;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static boolean isLogado() {
        return usuarioLogado != null;
    }

    public static boolean isAdmin() {
        return usuarioLogado != null && usuarioLogado.isAdmin();
    }

    public static void encerrarSessao() {
        usuarioLogado = null;
    }
}