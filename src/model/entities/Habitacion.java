package model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idHabitacion;
    
    @Column(name = "numero de habitacion")
    private String numero;
    
    @Column(name = "piso")
    private String piso;
    
    @Column(name = "categoria")
    private String categoria;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "precio")
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

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
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

    @Override
    public String toString() {
        return "Habitacion {" + "ID Habitacion: " + idHabitacion +
                ", numero: " + numero + ", piso: " + piso + 
                ", categoria: " + categoria + ", descripcion: " + descripcion + 
                ", precio: " + precio + '}';
    }
    
    
}
