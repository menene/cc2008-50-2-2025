import java.util.ArrayList;

public class Estudiante implements Comparable<Estudiante>
{
    private String nombre;
    private int carnet;
    private ArrayList<Nota> notas;

    public Estudiante(String nombre, int carnet)
    {
        this.nombre = nombre;
        this.carnet = carnet;
        this.notas = new ArrayList<Nota>();
    }

    // public void setNota(Nota n)
    // {
    //     this.notas.add(n);
    // }

    public void setNota(String nombre, int calificacion)
    {
        this.notas.add(
            new Nota(nombre, calificacion)
        );
    }

    public int promedio()
    {
        int suma = 0;
        int n = this.notas.size();

        for (Nota nota : this.notas) {
            suma += nota.getCalificacion();
        }

        return (suma / n);
    }

    @Override
    public int compareTo(Estudiante otro){
        // return Integer.compare(this.promedio(), otro.promedio());
        // return Integer.compare(otro.promedio(), this.promedio());
        return Integer.compare(this.promedio(), otro.promedio()) * -1;
    }
    
    @Override
    public String toString()
    {
        String res =  this.carnet + " - " + this.nombre + "\n" +
            "Promedio: " + this.promedio() + "\n" +
            "Notas: \n";

        for (Nota n : this.notas) {
            res += n + "\n";
        }

        return res;
    }
}