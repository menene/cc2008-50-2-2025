import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // AuthController controller = new AuthController();
        // controller.start();

        ArrayList<Object> objetos = new ArrayList<>();

        Object controller = new AuthController();
        Object vista = new View();

        objetos.add(controller);
        objetos.add(vista);
        objetos.add(objetos);
    }
}