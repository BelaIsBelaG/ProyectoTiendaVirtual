import javax.swing.*;

public class MainTienda {
    public static void main(String[] args) {
        //Agregamos una opcion para que el usuario se registre esta opcion tendrá los atributos de la clase Usuario
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        String direccion = JOptionPane.showInputDialog("Ingrese su dirección");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono"));
        String correoElectronico = JOptionPane.showInputDialog("Ingrese su correo electrónico");
        Usuario usuario = new Usuario(nombre, apellido, direccion, telefono, correoElectronico);

        //creamos una categoria con todos los atributos de la clase Categoria
        Categoria categoria = new Categoria();
        categoria.setNombreCategoria("Ropa");
        categoria.setDescripcionCategoria("Ropa de moda");
        Categoria categoria2 = new Categoria();
        categoria2.setNombreCategoria("Accesorios");
        categoria2.setDescripcionCategoria("Accesorios de moda");
        Categoria categoria3 = new Categoria();
        categoria3.setNombreCategoria("Zapatos");
        categoria3.setDescripcionCategoria("Zapatos de moda");

        //creamos varios productos para cada categoria
        Producto producto = new Producto("Pantalon", 250000, categoria);
        Producto producto2 = new Producto("Camisa", 180000, categoria);
        Producto producto3 = new Producto("Falda", 150000, categoria);
        Producto producto4 = new Producto("Collar", 500000, categoria2);
        Producto producto5 = new Producto("Pulsera", 39000, categoria2);
        Producto producto6 = new Producto("Anillo", 48000, categoria2);
        Producto producto7 = new Producto("Tenis", 390000, categoria3);
        Producto producto8 = new Producto("Sandalias", 250000, categoria3);
        Producto producto9 = new Producto("Botas", 350000, categoria3);

        /*
        creamos un menu en donde el usuario seleccione la categoría y el producto que desea comprar y se le muestre el precio
         */
        String opcion = JOptionPane.showInputDialog("Seleccione la categoría\n" +
                "1. Ropa\n" +
                "2. Accesorios\n" +
                "3. Zapatos\n");
        if (opcion.equals("1")) {
            //selecciona la categoria y se le muestra la descripcion de la categoria
            JOptionPane.showMessageDialog(null, "Descripción de la categoría: " + categoria.getDescripcionCategoria());
            String opcionRopa = JOptionPane.showInputDialog("Seleccione el producto\n" +
                    "1. Pantalon\n" +
                    "2. Camisa\n" +
                    "3. Falda\n");
            if (opcionRopa.equals("1")) {
                JOptionPane.showMessageDialog(null, "El precio del pantalon es: " + producto.getPrecioProducto());
            } else if (opcionRopa.equals("2")) {
                JOptionPane.showMessageDialog(null, "El precio de la camisa es: " + producto2.getPrecioProducto());
            } else if (opcionRopa.equals("3")) {
                JOptionPane.showMessageDialog(null, "El precio de la falda es: " + producto3.getPrecioProducto());
            }
        } else if (opcion.equals("2")) {
            String opcionAccesorios = JOptionPane.showInputDialog("Seleccione el producto\n" +
                    "1. Collar\n" +
                    "2. Pulsera\n" +
                    "3. Anillo\n");
            if (opcionAccesorios.equals("1")) {
                JOptionPane.showMessageDialog(null, "El precio del collar es: " + producto4.getPrecioProducto());
            } else if (opcionAccesorios.equals("2")) {
                JOptionPane.showMessageDialog(null, "El precio de la pulsera es: " + producto5.getPrecioProducto());
            } else if (opcionAccesorios.equals("3")) {
                JOptionPane.showMessageDialog(null, "El precio del anillo es: " + producto6.getPrecioProducto());
            }
        } else if (opcion.equals("3")) {
            String opcionZapatos = JOptionPane.showInputDialog("Seleccione el producto\n" +
                    "1. Tenis\n" +
                    "2. Sandalias\n" +
                    "3. Botas\n");
            if (opcionZapatos.equals("1")) {
                JOptionPane.showMessageDialog(null, "El precio de los tenis es: " + producto7.getPrecioProducto());
            } else if (opcionZapatos.equals("2")) {
                JOptionPane.showMessageDialog(null, "El precio de las sandalias es: " + producto8.getPrecioProducto());
            } else if (opcionZapatos.equals("3")) {
                JOptionPane.showMessageDialog(null, "El precio de las botas es: " + producto9.getPrecioProducto());
            }

        }

          /*
            creamos un menu en donde le confirmamos los datos ingresados por el usuario y le preguntamos si desea continuar
            con la compra, si dice que si continuará con la compra le preguntaremos el metodo de pago que usará, sino
            realizará la compra mostramos el mensaje de compra cancelada
          */
        int confirmacion = JOptionPane.showConfirmDialog(null, "Nombre: " + usuario.getNombre() + "\n" +
                "Apellido: " + usuario.getApellido() + "\n" +
                "Dirección: " + usuario.getDireccion() + "\n" +
                "Teléfono: " + usuario.getTelefono() + "\n" +
                "Correo electrónico: " + usuario.getCorreoElectronico() + "\n" +
                "¿Desea continuar con la compra?");
        String tipoPago = "";
        if (confirmacion == JOptionPane.YES_OPTION) {
            tipoPago = JOptionPane.showInputDialog("Seleccione el método de pago\n" +
                    "1. Efectivo\n" +
                    "2. Crédito\n" +
                    "3. Débito\n");
            //si selecciona credito o debito se le pide el numero de cuenta y el banco
            if (tipoPago.equals("2") || tipoPago.equals("3")) {
                String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta");
                String banco = JOptionPane.showInputDialog("Ingrese el banco");
                //creamos un pago con los atributos de la clase Pago
                Pago pago = new Pago(10000, 19000);
                //creamos un credito con los atributos de la clase Credito
                Credito credito = new Credito(10000, 19000, numeroTarjeta, "Visa", banco);
                JOptionPane.showMessageDialog(null, "El total a pagar es: " + credito.calculoTotal(10.000));
            } else {
                //creamos un pago con los atributos de la clase Pago
                Pago pago = new Pago(10000, 19000);
                JOptionPane.showMessageDialog(null, "El total a pagar es: " + pago.calculoTotal());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Compra cancelada");
        }


        //creamos un envio con los atributos de la clase Envio
        Envio envio = new Envio(10000, usuario.getDireccion());
        JOptionPane.showMessageDialog(null, "El costo del envio es: " + envio.getCostoEnvio());

         /*
         Despues de que el usuario confirme si desea realizar la compra le imprimimos una factura con los datos del usuario,
            tipo de pago, datos del envio, datos del pedido, datos del producto y las politicas de cambio de los productos comprados
          */
        JOptionPane.showMessageDialog(null, "Factura\n" +
                "Datos del usuario\n" + usuario.toString() + "\n" +
                "Tipo de pago\n" + tipoPago + "\n" +
                "Datos del envio\n" + envio.toString() + "\n" +
                //datos del pedido que incluyen el nombre del producto y el precio ademas se debe sumar el precio del envio y los impuestos al subtotal
                "Datos del pedido\n" + "Producto: " + producto.getNombreProducto() + " Precio: " + producto.getPrecioProducto() + "\n" +
                //se debe imprimir el total del pedido incluyendo los impuestos si el pago es con tarjeta se debe sumar el costo del envio
                "Total del pedido: " + producto.getPrecioProducto() +  envio.getCostoEnvio()+ "\n" +
                "Politicas de cambio\n" + "El producto se puede cambiar en un plazo de 30 días\n" +
                "Gracias por su compra");

    }
}
