public class Loro extends Animal
{
    private String nombre;

    public Loro(String nombre)
    {
        super("Ave", "Lorus Lorocus");

        this.nombre = nombre;
    }

    @Override
    public void hacerPopo()
    {
        super.hacerPipi();
        super.hacerPopo();
    }

    @Override
    public void hacerPipi()
    {
        this.hacerPopo();
    }

    @Override
    public void hablar()
    {
        System.out.println("Hooooola!!!");
    }
}