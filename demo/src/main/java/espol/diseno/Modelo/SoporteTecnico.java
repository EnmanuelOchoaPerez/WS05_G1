package espol.diseno.modelo;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    }
    
    public void brindarAsistencia(Usuario usuario){} 
    public void resolverProblemaTecnico(Usuario usuario){}
    public void derivarProblemaDeGestion(Administrador administrador){}
    
}
