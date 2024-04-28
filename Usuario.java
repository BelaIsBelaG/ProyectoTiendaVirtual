public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String correoElectronico;
    public Usuario(String nombre, String apellido, String direccion, int telefono, String correoElectronico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public void registrarUsuario(){

    }
    public String toString(){
        return "Usuario: " + nombre + " Apellido: " + apellido + " dirección: "+ direccion + " teléfono: " + telefono + " correo electrónico: " + correoElectronico;
    }


}
