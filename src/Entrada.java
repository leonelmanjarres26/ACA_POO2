public class Entrada {
    private double precio;

    //constructor
    public Entrada (double precio) {
        this.precio = precio;
    }

    //getter
    public double getPrecio() {
        return precio;
    }

    // creamos un setter por si se llega a modificar despues
    public void setPrecio(){
        this.precio = precio;
    }

}