public class Producto {
    private String nombreProducto;
    private double precioProducto;
    private Categoria categoria;
    public Producto(String nombreProducto, double precioProducto, Categoria categoria)
    {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.categoria = categoria;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }
    public double calculoTotal() {
        return 0.0;
    }

    public Categoria getCategoria() {
        return categoria;
    }


}
