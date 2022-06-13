package Principal;

public class Factura extends Plato{

    private int cantidad;

    public Factura() {
        this.cantidad = 1;
    }

    public Factura(String codigo, String nombre, double precio, int cantidad) {
        super(codigo, nombre, precio);
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
