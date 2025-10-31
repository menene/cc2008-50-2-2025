public class Charmander extends Pokemon implements IFire
{
    public Charmander()
    {
        super("Charmander", 4);
    }

    @Override
    public void attack()
    {
        this.BurnUp();
        this.FireBlast();
        this.FireSpin();
    }

    @Override
    public void BurnUp()
    {
        System.out.println("Charmander is burning up...");
    }

    @Override
    public void FireBlast()
    {
        System.out.println("Charmander is fire blasting...");
    }

    @Override
    public void FireSpin()
    {
        System.out.println("Charmander is fire spinning...");
    }
}