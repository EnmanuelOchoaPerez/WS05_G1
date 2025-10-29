package espol.diseno.modelo;

import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private Boolean estado;
    private Profesor responsable;
    protected ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList();
    protected ArrayList<Estudiante> estudiantesInscritos = new ArrayList();
    private java.util.Collection foros = new java.util.TreeSet();
    private java.util.Collection actividadesSumativas = new java.util.TreeSet();

}
