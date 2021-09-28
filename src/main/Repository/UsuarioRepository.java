package main.Repository;

import main.domain.Conexao;
import main.domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRepository {
    public Usuario buscarUsuarioPeloNome(String nomeUsuario) throws SQLException {
        ResultSet resultSet = null;
        Conexao conexao = new Conexao();
        Connection connection = conexao.getConexao();
        Usuario usuario = new Usuario();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID, USUARIO, SENHA, IDVENDEDOR FROM USUARIO WHERE USUARIO = ?");
            preparedStatement.setString(1, nomeUsuario);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            usuario.setId(resultSet.getInt("id"));
            usuario.setUsuario(resultSet.getString("usuario"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setIdVendedor(resultSet.getInt("idvendedor"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            connection.close();
        }
        return usuario;

    }
}
