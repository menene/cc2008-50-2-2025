public class Tomorrowland {
    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;

    public Tomorrowland()
    {
       this.localidad1 = new Localidad("General", 100, 20);
       this.localidad5 = new Localidad("VIP", 1000, 20); 
    }

    public boolean nuevoTicket(Cliente cliente)
    {
        if (!cliente.getTicket().getPuedeVender()) {
            return false;
        }

        if (cliente.getTicket().getLocalidad() == 1) {
            System.out.println("Validando la localidad 1");

            if (this.localidad1.getPuedeVender()) {
                System.out.println("Localidad con espacio");
            }
        } else if (cliente.getTicket().getLocalidad() == 2) {
            System.out.println("Validando la localidad 2");

            if (this.localidad5.getPuedeVender()) {
                System.out.println("Localidad con espacio");
            }
        } else if (cliente.getTicket().getLocalidad() == 3) {
            System.out.println("Validando la localidad 3");

            if (this.localidad10.getPuedeVender()) {
                System.out.println("Localidad con espacio");
            }
        }else {
            System.out.println("Localidad inválida");
            return false;
        }


        return true;
    }

    public void disponibilidadTotal()
    {

    }

    public void diponibilidadLocalidad(int codigo)
    {

    }

    public void reporteCaja()
    {
        
    }
}
