package espol.diseno.Modelo;

public class Profesor extends PersonalAcademico{

    public Profesor(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    } 
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    public void cargarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}
    public void aceptarInscripcion(Curso curso, Estudiante estudiante){}
    public void crearNuevoForo(Foro foro){}

}
