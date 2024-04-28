public class Credito extends Pago {
    private String numeroTarjeta;
    private String tipoTarjeta;
    private String banco;

    public Credito(double subTotal, double impuestos, String numeroTarjeta, String tipoTarjeta, String banco) {
        super(subTotal, impuestos);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.banco = banco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    //se crea un metodo para calcular el total del pedido en donde se suma el subtotal los impuestos y el valor del envío
    public double calculoTotal(double costoEnvio) {
        return getSubTotal() + getImpuestos() + costoEnvio;
    }
}




