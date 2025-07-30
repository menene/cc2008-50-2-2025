import java.util.Random;

public class Ticket {
    private int numero;
    private int a;
    private int b;
    private boolean puedeVender;
    private int numLocalidad;

    public Ticket() 
    {
        Random r = new Random();

        this.numero = r.nextInt(1, 15001);
        this.a = r.nextInt(1, 15001);
        this.b = r.nextInt(1, 15001);

        int inferior = Math.min(this.a, this.b);
        int superior = Math.max(this.a, this.b);

        this.numLocalidad = 0;
        if (this.numero >= inferior && this.numero <= superior) {
            this.puedeVender = true;

            this.numLocalidad = r.nextInt(1, 4);
        }
    }

    public int getNumero()
    {
        return this.numero;
    }

    public boolean getPuedeVender()
    {
        return this.puedeVender;
    }

    public int getLocalidad()
    {
        return this.numLocalidad;
    }

    public String toString()
    {
        return "\nNúmero: " + this.numero + 
            "\nA y b: " + this.a + ", " + this.b + 
            "\nPuede vender: " + this.puedeVender + 
            "\nLocalidad: " + this.numLocalidad; 
    }
}
