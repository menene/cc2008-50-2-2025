public class Perro
{
    private String nombre;

    public Perro(String n)
    {
        this.nombre = n;
    }

    public void ladrar()
    {
        System.out.println(this.nombre + " dice: Woof Woof");
    }
}