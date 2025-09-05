// vista

import java.util.Scanner;

public class Consola
{
    private final Scanner sc;

    public Consola() {
        this.sc = new Scanner(System.in);
    }

    public void mostrarBienvenida(int n, int barcos, int disparosMax) {
        println("=== 🚢 BATTLESHIP 💣 ===");
        println("Tablero: " + n + " x " + n);
        println("Filas: A - " + (char) ('A' + (n - 1)) + ", Columnas: 1 - " + n);
        println("Barcos: " + barcos);
        println("Comandos: \n\tCoordenada - E1 por ejemplo\n\tREVELAR - hacer trampa\n\tSALIR - para terminar");
        println("");
    }

    public void dibujarTablero(Tablero t) {
        int n = t.getN();
        
        print("  ");
        for (int i = 1; i <= n; i++) {
            print(i + " ");
        }
        println("");

        for (int i = 0; i < n; i++) {

            print((char) ('A'+ i) + " ");

            for (int j = 0; j < n; j++) {
                print(t.getCelda(i, j) + " ");
            }

            println("");
        }

        println("");
    }

    // helpers
    private void print(String s) {
        System.out.print(s);
    }

    private void println(String s) {
        System.out.println(s);
    }
}