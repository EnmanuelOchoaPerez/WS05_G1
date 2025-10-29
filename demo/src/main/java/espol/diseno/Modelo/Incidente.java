package espol.diseno.modelo;

import java.time.LocalDate;
import java.util.List;

public class Incidente {
    protected int id; 
    protected LocalDate fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String tipo;
    protected String descripcion;
    protected LocalDate fecha_cerrado;
    protected List log_actualizaciones; 
    private Usuario responsable;
    protected Profesor beneficiario;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getFecha_reportado() {
        return fecha_reportado;
    }
    public void setFecha_reportado(LocalDate fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getFecha_cerrado() {
        return fecha_cerrado;
    }
    public void setFecha_cerrado(LocalDate fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }
    public List getLog_actualizaciones() {
        return log_actualizaciones;
    }
    public void setLog_actualizaciones(List log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }
    public Usuario getResponsable() {
        return responsable;
    }
    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }
    public Profesor getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(Profesor beneficiario) {
        this.beneficiario = beneficiario;
    }
    
}