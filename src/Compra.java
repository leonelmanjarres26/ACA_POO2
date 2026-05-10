public class Compra {
private int cantidadEntradas;
private Entrada entrada;

// constructor
    public Compra(int cantidadEntradas, Entrada entrada){
        if (cantidadEntradas < 1 || cantidadEntradas > 4) {
            throw new IllegalArgumentException("Solo se permite entre 1 y 4 entradas.");
        }
        this.cantidadEntradas = cantidadEntradas;
        this.entrada = entrada;
    }

    public int getCantidadEntradas(){
        return cantidadEntradas;
    }

    public double calcularSubtotal() {
        return cantidadEntradas * entrada.getPrecio();
    }

    public Entrada getEntrada() {
        return entrada;
    }
}
