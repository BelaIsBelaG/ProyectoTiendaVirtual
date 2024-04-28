import java.util.ArrayList;
import java.util.List;

public class Categoria {
    public String nombreCategoria;
    public String descripcionCategoria;
    private List<Producto> productos;
    public Categoria() {
        productos = new ArrayList<Producto>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public String getNombreCategoria() {
        return nombreCategoria;
    }
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
    public void registrarCategoria() {

    }

}
