import java.util.Random;

public class Gerente {
    public boolean disponibilidad;

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public int generarNumero() {
        Random r = new Random();
        int numero = r.nextInt(15000) + 1;
        return numero;
    }

    public boolean validarNumero(int numeroBoleto, int a, int b) {
        int menor = Math.min(a, b);
        int mayor = Math.max(a, b);
        if (numeroBoleto >= menor && numeroBoleto <= mayor) {
            return true;
        } else {
            return false;
        }
    }
}
