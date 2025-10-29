package espol.diseno.Modelo;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    

    public Usuario(String apellido, String contraseña, String nombre, String usuario) {
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    
    protected boolean login(){return false;}
    protected boolean logout(){return false;}
}
