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
    
}