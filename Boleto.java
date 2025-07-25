public class Boleto {
    public int precio;
    public int cantidad;
    public int numeroBoleto;
    public int numeroAleatorio;

    public Boleto(int precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String comprarBoleto(int numeroAleatorio) {
        if (numeroAleatorio == numeroBoleto) {
            return "Boleto válido. Compra realizada.";
        } else {
            return "Número no válido para compra.";
        }
    }
}
