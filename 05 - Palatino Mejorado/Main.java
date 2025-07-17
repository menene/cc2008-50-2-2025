import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Torneo palatino = new Torneo("Torneo Palatino", 5);

        String nombre;
        Equipo t;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            nombre = sc.nextLine();

            t = new Equipo(nombre);

            palatino.agregarEquipo(i, t);
        }

        // Equipo t1 = new Equipo("FC Barcelona");
        // t1.setGoles(100);
        // Equipo t2 = new Equipo("Atletico de Madrid");
        // Equipo t3 = new Equipo("Real Madrid");
        // Equipo t4 = new Equipo("Girona");
        // Equipo t5 = new Equipo("Valencia");

        // palatino.agregarEquipo(0, t1);
        // palatino.agregarEquipo(1, t2);
        // palatino.agregarEquipo(2, t3);
        // palatino.agregarEquipo(3, t4);
        // palatino.agregarEquipo(4, t5);

        // t1.setGoles(200);

        palatino.anotar(0, 300);

        System.out.println(palatino.getResumen());
    }
}