public class Person
{
    private int age;

    public void setAge(String age) throws InvalidAgeException
    {
        int entero = -1;

        try {
            entero = Integer.parseInt(age);
        } catch (Exception e) {
            throw new InvalidAgeException("La edad debe ser numérica");
        }

        if (entero < 0) {
            throw new InvalidAgeException("La edad no puede ser negativa");
        }

        if (entero > 150) {
            throw new InvalidAgeException("La eda máxima son 150");
        }

        this.age = entero;
    }
}