package modelo;

public class Habitacion {
    private String numero;
    private String piso;
    private String categoria;
    private String descripcion;
    private float precio;

    public Habitacion() {
    }

    public Habitacion(String numero, String piso, String categoria, String descripcion, float precio) {
        this.numero = numero;
        this.piso = piso;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
