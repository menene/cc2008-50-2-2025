public class Hijo extends Padre
{
    // private int privado;
    // protected int protegido;
    // public int publico;

    public Hijo(int num1, int num2, int num3)
    {
        super(num1, num2, num3);
    }

    public void mostrar()
    {
        System.out.println(this.protegido);
        System.out.println(this.publico);
        // System.out.println(this.privado);
    }

    @Override
    public void saludar()
    {
        super.saludar();
        System.out.println("Qué onda?");  
    }
}