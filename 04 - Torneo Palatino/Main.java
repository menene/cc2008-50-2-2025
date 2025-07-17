public class Main
{
    public static void main(String[] args)
    {
        Equipo t1 = new Equipo();
        t1.setNombre("FC BArcelona");
        t1.setPuesto(1);
        t1.setGoles(100);

        Equipo t2 = new Equipo("Atletico de Madrid", 2, 60);

        t2.amonestar();
        t2.amonestar();

        System.out.println(t2.getNombre() + " - Amarillas: " + t1.getAmarillas());

        System.out.println(t1);
        System.out.println(t2);



        // Equipo t1 = new Equipo("Barça", 1, 30, 20, 1, 100, 3, 2, 5);
        // Equipo t2 = new Equipo("Atlético de Madrid", 2, 300, 17, 4, 75, 13, 20, 50);

        // System.out.println(t1.getNombre());
        // System.out.println(t1.getGoles());

        // System.out.println(t2.getNombre());
        // System.out.println(t2.getGoles());

        int totalGoles = t1.getGoles() + t2.getGoles();
        System.out.println(totalGoles);
    }
}