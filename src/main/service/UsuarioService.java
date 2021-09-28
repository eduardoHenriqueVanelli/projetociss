package main.service;

import main.Repository.UsuarioRepository;
import main.domain.Usuario;

import java.sql.SQLException;
import java.util.Scanner;

public class UsuarioService {
   public boolean existeNoBanco(String usuario) throws SQLException {
       UsuarioRepository usuarioRepository = new UsuarioRepository();
       Usuario usuarioBanco = usuarioRepository.buscarUsuarioPeloNome(usuario);
       return usuarioBanco != null;
   }


    public void criarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome:");
        String nomeDigitado = sc.nextLine();
        System.out.println("Informe Senha:");
        String senhaDigitado = sc.nextLine();
        Usuario usuario = new Usuario();
        usuario.setUsuario(nomeDigitado);
        usuario.setSenha(senhaDigitado);
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        usuarioRepository.inserirUsuario(usuario);
    }

    public void pesquisarUsuario() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Usuario:");
        String nomeDigitado = sc.nextLine();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        usuarioRepository.pesquisarUsuario(nomeDigitado);
    }

    public void editarUsuario() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Usuario a Editar:");
        String nomeDigitado = sc.nextLine();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuarioBanco = usuarioRepository.buscarUsuarioPeloNome(nomeDigitado);
        System.out.println("Informe nome:");
        String novoNome = sc.nextLine();
        System.out.println("Informe Senha:");
        String novaSenha = sc.nextLine();
        usuarioBanco.setUsuario(novoNome);
        usuarioBanco.setSenha(novaSenha);
        usuarioRepository.updateUsuario(usuarioBanco);
    }

    public void excluirUsuario() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Usuario a Excluir:");
        String nomeDigitado = sc.nextLine();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuarioBanco = usuarioRepository.buscarUsuarioPeloNome(nomeDigitado);
        usuarioRepository.excluirUsuario(usuarioBanco);
    }
}
