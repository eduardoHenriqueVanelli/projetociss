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
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID, USUARIO, SENHA, IDVENDEDOR FROM dba.USUARIO_TR30 WHERE USUARIO = ?");
            preparedStatement.setString(1, nomeUsuario);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            usuario.setId(resultSet.getInt("id"));
            usuario.setUsuario(resultSet.getString("usuario"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setIdVendedor(resultSet.getInt("idvendedor"));
            return usuario;
        } catch (SQLException throwables) {
            System.out.println("");
        } finally {
            connection.close();
        }
        return null;

    }

    public void salvarUsuario(Usuario usuario) {
        PreparedStatement preparedStatement = null;
        Conexao conexao = new Conexao();
        Connection connection = conexao.getConexao();
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO DBA.USUARIO_TR30 (USUARIO, SENHA) VALUES (?, ?)");
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getSenha());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void pesquisarUsuario(String nomeDigitado) throws SQLException {
        ResultSet resultSet = null;
        Conexao conexao = new Conexao();
        Connection connection = conexao.getConexao();
        Usuario usuario = new Usuario();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID, USUARIO, SENHA, IDVENDEDOR FROM dba.USUARIO_TR30 WHERE USUARIO = ?");
            preparedStatement.setString(1, nomeDigitado);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            usuario.setId(resultSet.getInt("id"));
            usuario.setUsuario(resultSet.getString("usuario"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setIdVendedor(resultSet.getInt("idvendedor"));
            System.out.println(usuario.toString());
            return;
        } catch (SQLException throwables) {
            System.out.println("");
        } finally {
            connection.close();
        }
        System.out.println("Usuario não encontrado");

    }
}
