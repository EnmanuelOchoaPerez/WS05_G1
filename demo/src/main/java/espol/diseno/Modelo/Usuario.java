package espol.diseno.modelo;

import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes = new ArrayList();

    public Usuario(String apellido, String contraseña, String nombre, String usuario) {
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    
    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }


    public void setIncidentes(ArrayList<Incidente> incidentes) {
        this.incidentes = incidentes;
    }


    protected boolean login(){return false;}
    protected boolean logout(){return false;}
}
