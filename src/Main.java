
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        UsersController uc = new UsersController();

        uc.cadastrarUsuario( new Usuario("José",new Date()));
        uc.cadastrarUsuario( new Usuario("Xamuel", "Toalha", new Date(), 890980, 'M', "R Street", "user", "senha", "email") );

        uc.listarUsuarios();
    }

}
