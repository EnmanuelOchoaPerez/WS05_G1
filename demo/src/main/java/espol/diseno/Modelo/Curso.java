package espol.diseno.modelo;

public class Curso {
    private String id;
    private String nombre;
    private Boolean estado;
    private java.util.Collection foros = new java.util.TreeSet();
    private java.util.Collection actividadesSumativas = new java.util.TreeSet();
}
