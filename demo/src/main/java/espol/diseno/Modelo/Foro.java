package espol.diseno.modelo;

public class Foro {
    private String id;
    private String nombre;
    private int numeroDeComentarios;
    public Curso curso;
    
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
    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }
    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
