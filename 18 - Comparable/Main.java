import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Estudiante e1 = new Estudiante("Erick", 123);
        e1.setNota("Ejercicio 1", 100);
        e1.setNota("Ejercicio 2", 90);
        e1.setNota("Lab 1", 100);

        Estudiante e2 = new Estudiante("Ana", 456);
        e2.setNota("Ejercicio 1", 80);
        e2.setNota("Ejercicio 2", 75);
        e2.setNota("Lab 1", 64);

        estudiantes.add(e1);
        estudiantes.add(e2);

        Collections.sort(estudiantes);

        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}