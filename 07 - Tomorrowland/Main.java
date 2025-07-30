public class Main 
{
    public static void main(String[] args) 
    {
        // Ticket t = new Ticket();
        // Ticket t2 = new Ticket();
        // Ticket t3 = new Ticket();

        // System.out.println(t);
        // System.out.println(t2);
        // System.out.println(t3);
        
        Tomorrowland tml = new Tomorrowland();

        Cliente c1 = new Cliente("Erick Marroquin", "efmarroquin@uvg.edu.gt", 2, 2500);
        Ticket t1 = new Ticket();
        c1.setTicket(t1);

        tml.nuevoTicket(c1);
    }
}
