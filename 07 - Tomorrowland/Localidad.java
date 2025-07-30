public class Localidad {
    private String nombre;
    private double precio;
    private int capacidad;
    private int vendido;

    public Localidad(String nombre, double precio, int capacidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.vendido = 0;
    }

    public boolean puedeVender()
    {
        return (this.vendido >= this.capacidad ? false : true);
    }

    // public int boletosDisponibles()
    // {
    // }

    // public int vender(int cantidad)
    // {
    // }

    // public double getPrecio()
    // {
    // }

    // public String getNombre()
    // {
    // }
}
