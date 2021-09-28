package main.service;

import main.Repository.UsuarioRepository;
import main.domain.Usuario;

import java.sql.SQLException;

public class UsuarioService {
   public boolean existeNoBanco(String usuario) throws SQLException {
       UsuarioRepository usuarioRepository = new UsuarioRepository();
       Usuario usuarioBanco = usuarioRepository.buscarUsuarioPeloNome(usuario);
       return usuarioBanco != null;
   }



}
