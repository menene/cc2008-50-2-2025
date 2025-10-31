public class Squirtle extends Pokemon implements IWater
{
    public Squirtle()
    {
        super("Squrtle", 4);
    }

    @Override
    public void attack()
    {
        this.ChillingWater();
        this.Dive();
        this.HydroVortex();
    }

    @Override
    public void ChillingWater()
    {
        System.out.println("Squirtle is chilling water...");
    }

    @Override
    public void Dive()
    {
        System.out.println("Squirtle is diving...");
    }

    @Override
    public void HydroVortex()
    {
        System.out.println("Squirtle is hydro vortexing...");
    }
}