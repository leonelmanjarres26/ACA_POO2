public class CalculadoraDescuento {

    //metodo para obtener el porcentaje de descuento

    public static double obtenerPorcentajeDescuento(int cantidad) {
        switch (cantidad){
            case 2: return 0.10;
            case 3: return 0.15;
            case 4: return 0.20;
            default: return 0.0;
        }
    }

    // metodo para calcular el total con descuento
    public static double calcularTotal(Compra compra){
        double subtotal = compra.calcularSubtotal();
        double descuento = obtenerPorcentajeDescuento(compra.getCantidadEntradas());
        double montoDescuento = subtotal * descuento;
        return subtotal - montoDescuento;
    }

    // metodo para mostrar factura de compra
    public static void mostrarFactura (Compra compra) {
        double subtotal = compra.calcularSubtotal();
        int cantidad = compra.getCantidadEntradas();
        double porcentaje = obtenerPorcentajeDescuento(cantidad);
        double montoDescuento = subtotal * porcentaje;
        double total = subtotal - montoDescuento;

        System.out.println("\n=== Factura ===");
        System.out.println("Entradas: " + cantidad);
        System.out.println("Precio unitario $" + compra.getEntrada().getPrecio());
        System.out.println("Subtotal: $" + total);
        System.out.println("Descuento aplicado: " + (porcentaje * 100) + "% ($" + montoDescuento + ")");

        System.out.println("Total a pagar: $" + total);
        System.out.println("================\n");
    }
}
