import java.util.ArrayList;

public class Personas
{
    public static void main(String[] args)
    {
        ArrayList<Persona> personas = new ArrayList<>();

        Persona erick = new Persona("Erick");

        personas.add(erick);
        personas.add(new Persona("Ana"));

        System.out.println(personas);

        Persona ana = personas.get(1);

        personas.remove(ana);

        System.out.println(personas);
    }
}