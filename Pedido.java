public class Pedido {
    public String id;
    public int totalPedido;
    public String fechaEstimadaDeEntrega;
    public Producto producto;
    public Usuario usuario;
    public Pago pago;

    public Pedido(String id, int totalPedido, String fechaEstimadaDeEntrega) {
        this.id = id;
        this.totalPedido = totalPedido;
        this.fechaEstimadaDeEntrega = fechaEstimadaDeEntrega;
        this.producto = producto;
        this.usuario = usuario;
        this.pago = pago;
    }
}
