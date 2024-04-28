public class Envio {
    private double costoEnvio;
    private String direccion;

    public Envio(double costoEnvio, String direccion) {
        this.costoEnvio = costoEnvio;
        this.direccion = direccion;
    }

    public double getCostoEnvio() {
        return 10000;
    }


    @Override
    public String toString() {
        return "Envio{" + "direccion: " + direccion + '\'' +
                "costo del envío: " + costoEnvio +
                '}';
    }


}
