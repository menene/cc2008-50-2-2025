public class Equipo
{
    private String nombre;
    private int puesto, tirosEsquina, ganados, perdidos;
    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int faltas;


    public Equipo()
    {
        this.nombre = "";
        this.puesto = 0;
        this.goles = 0;
        this.tarjetasAmarillas = 0;
    }

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

    public Equipo(String nombre, int puesto, int goles)
    {
        this.nombre = nombre;
        this.puesto = puesto;
        this.goles = goles;
        this.tarjetasAmarillas = 0;
    }

    public Equipo(String nombre, int puesto, int esquinas, int ganados, int perdidos, int goles, int amarillas, int rojas, int faltas) 
    {
        this.nombre = nombre;
        this.puesto = puesto;
        this.tirosEsquina = esquinas;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.goles = goles;
        this.tarjetasAmarillas = amarillas;
        this.tarjetasRojas = rojas;
        this.faltas = faltas;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getGoles()
    {
        return this.goles;
    }

    public int getAmarillas()
    {
        return this.tarjetasAmarillas;
    }

    public void setNombre(String n)
    {
        this.nombre = n;
    }

    public void setGoles(int g)
    {
        this.goles = g;
    }

    public void setPuesto(int p)
    {
        this.puesto = p;
    }

    public void amonestar()
    {
        this.tarjetasAmarillas++;

        System.out.println(this.nombre + " ha recibido su tarjeta amarilla número: " + this.tarjetasAmarillas);
    }

    public String toString()
    {
        return "\nNombre: " + this.nombre +
            "\nPuesto: " + this.puesto + 
            "\nGoles: " + this.goles + "\n";
    }
}