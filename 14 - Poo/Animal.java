public abstract class Animal
{
    protected String especie;
    protected String nombreCientifico;

    public Animal(String especie, String nc)
    {
        this.especie = especie;
        this.nombreCientifico = nc;
    }

    public void hacerPipi()
    {
        System.out.println("💦💦💦💦");
    }

    public void hacerPopo()
    {
        System.out.println("💩💩💩💩");
    }

    public abstract void hablar();
}