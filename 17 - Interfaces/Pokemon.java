public abstract class Pokemon
{
    private String name;
    private int number;

    public Pokemon(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public abstract void attack();
}