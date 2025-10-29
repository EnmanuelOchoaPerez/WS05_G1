package espol.diseno.modelo;

import java.util.ArrayList;

public class Estudiante extends PersonalAcademico{
    protected ArrayList<Curso> cursosEnEsperaPorAprobar = new ArrayList();
    protected ArrayList<Curso> cursosInscrito = new ArrayList();

    public Estudiante(String apellido, String contraseña, String nombre, String usuario) {
        super(apellido, contraseña, nombre, usuario);
    }
    
    
    public void solicitarInscripcion(Curso curso){}
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    
}
