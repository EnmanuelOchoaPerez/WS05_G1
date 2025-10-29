package espol.diseno.modelo;

import java.util.ArrayList;

public class Profesor extends PersonalAcademico{
    protected ArrayList<Incidente> incidentes = new ArrayList();
    protected ArrayList<Curso> cursosAcargo = new ArrayList();
    
    public Profesor(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    } 
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    public void cargarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}
    public void aceptarInscripcion(Curso curso, Estudiante estudiante){}
    public void crearNuevoForo(Foro foro){}
    
    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }
    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
    public ArrayList<Curso> getCursosAcargo() {
        return cursosAcargo;
    }
    public void setCursosAcargo(ArrayList<Curso> cursosAcargo) {
        this.cursosAcargo = cursosAcargo;
    }
    

}
