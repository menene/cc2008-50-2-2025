public class Perro extends Animal
{
    private String nombre;
    private String raza;

    public Perro(String nombre, String raza)
    {
        super("Mamifero", "Cannis Familiaris");

        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public void hablar()
    {
        System.out.println("Guau Guau");
    }
}