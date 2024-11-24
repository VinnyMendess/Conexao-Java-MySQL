import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        


        Usuario u = new Usuario();
        u.setNome("Vinicius");
        u.setLogin("rogerio");
        u.setSenha("1234");
        u.setEmail("vinicius@gmail.com");

        

        new UsuarioDAO().cadastrarUsuario(u);

    }
}
