package main;

import main.service.UsuarioService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        constroiLogin();
    }

    private static void constroiLogin() throws SQLException {
        Scanner sc = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        System.out.println("Informe o Usuario: ");
        String usuarioDigitado = sc.nextLine();
        if (usuarioService.existeNoBanco(usuarioDigitado)) {
            construirMenuInicial();
        } else {
            System.out.println("Usuario invalido");
        }
    }

    private static void construirMenuInicial() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("OPÇOES");
        System.out.println("1-Usuario");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                UsuarioService usuarioService = new UsuarioService();
                switch (getComandos()) {
                    case 1:
                        usuarioService.criarUsuario();
                        break;
                    case 2:
                        usuarioService.pesquisarUsuario();
                        break;
                    case 3:
                        usuarioService.editarUsuario();
                        break;
                    case 4:
                        usuarioService.excluirUsuario();
                        break;
                }
        }
    }

    private static int getComandos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Cadastrar");
        System.out.println("2-Pesquisar");
        System.out.println("3-Editar");
        System.out.println("4-Excluir");
        return sc.nextInt();
    }
}

