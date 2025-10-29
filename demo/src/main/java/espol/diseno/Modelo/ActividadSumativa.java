package espol.diseno.modelo;

import java.util.Date;

public abstract class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected Float puntajeMaximo;
    protected String contenido;
    protected Float calificacion;
    protected String id;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }
    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }
    public Float getPuntajeMaximo() {
        return puntajeMaximo;
    }
    public void setPuntajeMaximo(Float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


}
