package espol.diseno.modelo;

import java.util.ArrayList;

public class Profesor extends PersonalAcademico{
    protected ArrayList<Incidente> incidentes = new ArrayList();

    public Profesor(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    } 
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    public void cargarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}
    public void aceptarInscripcion(Curso curso, Estudiante estudiante){}
    public void crearNuevoForo(Foro foro){}
    

}
