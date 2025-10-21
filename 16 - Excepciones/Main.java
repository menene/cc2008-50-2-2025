import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);

        boolean invalidAge = true;
        
        String age = "";
        while (invalidAge) {
            System.out.print("Ingrese la edad: ");
            age = sc.nextLine();
            
            try {
                p.setAge(age);
                invalidAge = false;
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}