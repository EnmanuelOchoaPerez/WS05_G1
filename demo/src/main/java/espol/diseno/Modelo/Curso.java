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
<<<<<<< HEAD
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public java.util.Collection getForos() {
        return foros;
    }
    public void setForos(java.util.Collection foros) {
        this.foros = foros;
    }
    public java.util.Collection getActividadesSumativas() {
        return actividadesSumativas;
    }
    public void setActividadesSumativas(java.util.Collection actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
=======

>>>>>>> 9f3ecfd7ccab47ca417d59139f22e9f0911bdce4
}
