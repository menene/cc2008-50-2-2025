public class Padre extends Abuelo
{
    private int privado;
    protected int protegido;
    public int publico;

    public Padre(int a, int b, int c)
    {
        this.privado = a;
        this.protegido = b;
        this.publico = c;
    }

    public void saludar()
    {
        super.saludar();
        System.out.println("Muy buenos días.");
    }
}