import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Random r = new Random();

        Localidad l1 = new Localidad(1, 20);
        Localidad l2 = new Localidad(2, 20);
        Localidad l3 = new Localidad(3, 20);

        Localidad[] localidades = { l1, l2, l3 };

        while (true) {
            System.out.println("1. Comprar");
            System.out.println("2. Salir");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                int numeroBoleto = gerente.generarNumero();
                int a = gerente.generarNumero();
                int b = gerente.generarNumero();

                System.out.println("Tu boleto: " + numeroBoleto);
                System.out.println("Rango: " + Math.min(a, b) + " - " + Math.max(a, b));

                boolean valido = gerente.validarNumero(numeroBoleto, a, b);

                if (valido == false) {
                    System.out.println("No puedes comprarlo bro");
                }

                if (valido == true) {
                    int seleccion = r.nextInt(3);
                    Localidad loc = localidades[seleccion];

                    int espacios = loc.getEspacio();

                    if (espacios == 0) {
                        System.out.println("no hay espacio");
                    }

                    if (espacios > 0) {
                        loc.ingresarPersona("Persona");

                        Boleto boleto = new Boleto(0, 1);

                        if (loc.getLocalidad() == 1) {
                            boleto.precio = 100;
                        }

                        if (loc.getLocalidad() == 2) {
                            boleto.precio = 500;
                        }

                        if (loc.getLocalidad() == 3) {
                            boleto.precio = 1000;
                        }

                        System.out.println("Localidad: " + loc.getLocalidad());
                        System.out.println("Precio del boleto: Q" + boleto.getPrecio());
                        System.out.println("Puedes tener: " + boleto.getCantidad());
                        System.out.println("Muchas gracias amigo");
                    }
                }
            }

            if (opcion == 2) {
                break;
            }
        }

        sc.close();
    }
}
