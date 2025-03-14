package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public static void cadastrarUsuario(Usuario usuario) {
        
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            // Ajuste dos índices para corresponder às posições dos placeholders
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute(); // Executa o comando SQL
            ps.close();   // Fecha o PreparedStatement

        } catch (SQLException e) {
            e.printStackTrace(); // Exibe o erro em caso de falha
        }
    }
}
