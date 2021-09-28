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

        } else {
            System.out.println("Usuario invalido");
        }
    }
}

