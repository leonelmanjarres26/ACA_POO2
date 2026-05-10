import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("\u001B[43m");
        System.out.print("\u001B[30m");
        System.out.println("Ingrese el precio por entrada: $");
        double precio = scanner.nextDouble();
        Entrada entrada = new Entrada(precio);

        // ciclo for
        System.out.println("\n--- Ciclo For ---");
        CicloFor(entrada);

        // ciclo while
        System.out.println("\n--- Ciclo While ---");
        CicloWhile(entrada);
    }

    //For
    public static void CicloFor(Entrada entrada){
        System.out.print("Numero de entradas (1 - 4): ");
        int cantidad = scanner.nextInt();

        if (cantidad < 1 && cantidad > 4) {
            System.out.println("Cantidad invalida. Solo 1 a 4 entradas.");
            return;
        }

        for (int i = 1; i <= cantidad; i++){
            if (i == cantidad) {
                Compra compra = new Compra (cantidad, entrada);
                CalculadoraDescuento.mostrarFactura(compra);
            }
        }
    }

    //While

    public static void CicloWhile(Entrada entrada) {
        int cantidad = 0;
        boolean valido = false;

        while(!valido) {
            System.out.print("Numero de entradas (1 - 4): ");
            cantidad = scanner.nextInt();
            if (cantidad >= 1 && cantidad <= 4) {
                valido = true;
            } else {
                System.out.println("Valor invalido. debe ser entre 1 y 4 entradas.");
            }
        }

        Compra compra = new Compra(cantidad, entrada);
        CalculadoraDescuento.mostrarFactura(compra);
    }
}
