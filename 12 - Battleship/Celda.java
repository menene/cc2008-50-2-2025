// modelo

public class Celda
{
    private boolean tieneBarco;
    private boolean disparada;
    private boolean debug;

    public Celda()
    {
        this.tieneBarco = false;
        this.disparada = false;
        this.debug = false;
    }

    // getters
    public boolean tieneBarco() {
        return this.tieneBarco;
    }

    public boolean estaDisparada() {
        return this.disparada;
    }

    // setters
    public void ponerBarco() {
        this.tieneBarco = true;
    }

    public void disparar() {
        this.disparada = true;
    }

    public void debug() {
        this.debug = true;
    }

    public void production() {
        this.debug = false;
    }

    @Override
    public String toString() {
        if (this.disparada && this.tieneBarco) {
            return "X";
        } else if(this.tieneBarco && this.debug) {
            return "S";
        } else if (this.disparada) {
            return "O";
        } else {
            return ".";
        }
    }
}