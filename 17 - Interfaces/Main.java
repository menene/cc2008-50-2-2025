public class Main
{
    public static void main(String[] args)
    {
        Pokemon c = new Charmander();

        // c.BurnUp(); ESTO NO JALA

        // ((Charmander) c).BurnUp();

        // ((IFire) c).BurnUp();

        c.attack();
    }
}