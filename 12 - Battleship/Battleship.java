// controlador

import java.util.Random;

public class Battleship
{
    private final int N = 5;
    private final int BARCOS = 3;
    private final int DISPAROS_MAX = 12;

    private final Tablero tablero;
    private final Consola vista;

    private final Random rnd;
    private int disparosUsados;

    public Battleship()
    {
        this.tablero = new Tablero(this.N);
        this.vista = new Consola();
        this.rnd = new Random();
        this.disparosUsados = 0;
    }

    public void jugar() {
        // instrucciones
        this.vista.mostrarBienvenida(this.N, this.BARCOS, this.DISPAROS_MAX);

        // poner los barcos
        this.tablero.colocarBarcosAleatorios(this.BARCOS, this.rnd);
        

        // logica de juego (while)
        while(this.disparosUsados < this.DISPAROS_MAX && !this.tablero.todosHundidos()) {
            // pintar el tablero
            this.vista.dibujarTablero(this.tablero);

            String entrada = this.vista.pedirEntrada("Comando > ");
            entrada = entra.trim().toUpperCase();

            if (entrada.equals("SALIR")) {
                vista.mensaje("Muchas gracias por jugar, nos vemos pronto");
                return;
            }

            if (entrada.equals("REVELAR")) {
                this.dibujarBarcos(this.tablero);
                continue;
            }
            
        }
    }
}