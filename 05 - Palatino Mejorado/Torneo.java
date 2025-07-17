public class Torneo
{
    String nombre;
    int cantidadEquipos;
    Equipo[] equipos;

    public Torneo(String nombre, int cantidad)
    {
        this.nombre = nombre;
        this.cantidadEquipos = cantidad;
        this.equipos = new Equipo[cantidad];
    }

    public void agregarEquipo(int numero, Equipo equipo)
    {
        this.equipos[numero] = equipo;
    }

    public String getResumen()
    {
        String summary = "=== Resúmen " + this.nombre + " ===\n";

        for (Equipo e : this.equipos) {
            summary += e;
        }

        return summary;
    }

    public void anotar(int equipo, int goles)
    {
        this.equipos[equipo].setGoles(goles);
    }
}