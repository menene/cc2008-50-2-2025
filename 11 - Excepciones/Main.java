public class Main
{
    public static void main(String[] args)
    {   
        String[] letras = new String[10];

        try {
            int res = 10 / 1;

            System.out.println(res);

            System.out.println(letras[100]);

        } catch(ArithmeticException e) {
            System.out.println("ERROR ARITMETICO: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR INDICE: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("ERROR GENERICO: " + e.getMessage());
        }

        System.out.println("IT'S ALIVE!!!");
    }
}