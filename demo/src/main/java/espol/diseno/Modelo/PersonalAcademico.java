package espol.diseno.Modelo;

public class PersonalAcademico extends Usuario {

    public PersonalAcademico(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    }
    
    public void reportarError(String email, String contenido){} 
    
    public void solicitarAsesoramientoDelSitema(String email, String contenido){}

    public void comentar (Foro foro, String comentario){}
}
