public class Efectivo extends Pago{
    private double cantidad;

    public Efectivo(double subTotal, double impuestos, double cantidad) {
        super(subTotal, impuestos);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double calculoTotal() {
        return getSubTotal();
    }

}


