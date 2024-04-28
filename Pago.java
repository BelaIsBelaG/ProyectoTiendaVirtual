public class Pago {
    private double subTotal;
    private double impuestos;
    public Pago(double subTotal, double impuestos) {
        this.subTotal = subTotal;
        this.impuestos = impuestos;
    }
    public double getSubTotal() {
        return subTotal;
    }

    public double getImpuestos() {
        return impuestos;
    }
    public double calculoTotal(){
        return subTotal+ impuestos;
    }

}
