public class Equipo
{
    private String nombre;
    private int puesto, tirosEsquina, ganados, perdidos;
    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int faltas;

    public Equipo(String nombre)
    {
        this.nombre = nombre;
        this.puesto = 0;
        this.tirosEsquina = 0;
        this.ganados = 0;
        this.perdidos = 0;
        this.goles = 0;
        this.tarjetasAmarillas = 0;
        this.tarjetasRojas = 0;
        this.faltas = 0;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getGoles()
    {
        return this.goles;
    }

    public void setGoles(int g)
    {
        this.goles = g;
    }

    public String toString()
    {
        return "\nNombre: " + this.nombre +
            "\nPuesto: " + this.puesto + 
            "\nGoles: " + this.goles + "\n";
    }
}