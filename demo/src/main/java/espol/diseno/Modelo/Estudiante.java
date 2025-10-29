package espol.diseno.Modelo;

public class Estudiante extends PersonalAcademico{

    public Estudiante(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    }
    

    public void solicitarInscripcion(Curso curso){}
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    
}
