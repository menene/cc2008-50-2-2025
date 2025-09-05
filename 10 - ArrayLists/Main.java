import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // for (String arg : args) {
        //     System.out.println(args);
        // }

        ArrayList<String> elementos = new ArrayList<>();

        elementos.add("Hidrógeno");
        elementos.add("Oxigeno");
        elementos.add("Deuterio");

        elementos.add(0, "Potasio");

        elementos.set(1, "Radio");

        elementos.remove(0);

        elementos.remove("Oxigeno");

        System.out.println(elementos.get(0));
        System.out.println(elementos.get(1));

        // elementos.set(100, "Mangenesio");

        System.out.println(elementos);


        String[] elementosArray = new String[118];

        System.out.println(elementosArray.length);
        System.out.println(elementos.size());

        int cuenta = 0;
        for (int i = 0; i < elementosArray.length; i++) {
            if (elementosArray[i] != null) {
                cuenta++;
            }
        }

        System.out.println(cuenta);
    }
}