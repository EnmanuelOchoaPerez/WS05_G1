package espol.diseno.Modelo;

public class Administrador extends Usuario {
    
    public Administrador(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    }

    public void crearUsuarioConRol(String usuario, String contraseña ){}
    public void asignarPermiso(String usuario){}
    public void actualizarSoftware(){} 
    public void asignarResponsable(Curso curso, Profesor responsable){}

}
