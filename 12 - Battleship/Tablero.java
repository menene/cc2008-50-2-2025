// modelo

import java.util.Random;

public class Tablero
{
    private final int n;
    private final Celda[][] celdas;
    private int barcosTotales;

    public Tablero(int n) {
        this.n = n;
        this.celdas = new Celda[n][n];
        this.barcosTotales = 0;

        this.initTablero();
    }

    // getters
    public int getN() {
        return this.n;
    }

    public Celda getCelda(int i, int j) {
        return this.celdas[i][j];
    }

    public int getBarcosTotales() {
        return this.barcosTotales;
    }

    // herramientas
    private void initTablero() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                this.celdas[i][j] = new Celda();
            }
        }
    }

    public void colocarBarcosAleatorios(int cantidad, Random rnd) {
        int colocados = 0;

        while (colocados < cantidad) {
            int i = rnd.nextInt(this.n);
            int j = rnd.nextInt(this.n);

            if (!this.celdas[i][j].tieneBarco()) {
                this.celdas[i][j].ponerBarco();
                colocados++;
            }
        }

        this.barcosTotales = cantidad;
    }

    public int barcosHundidos() {
        int aciertos = 0;

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                Celda c = this.celdas[i][j];

                if (c.tieneBarco() && c.estaDisparada()) {
                    aciertos++;
                }
            }   
        }

        return aciertos;
    }

    public boolean todosHundidos() {
        return this.barcosHundidos() == this.barcosTotales;
    }
}