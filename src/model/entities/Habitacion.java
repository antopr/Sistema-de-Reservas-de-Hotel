package model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idHabitacion;
    
    @Column(name = "numeroDeHabitacion")
    private int numero;
    
    @Column(name = "piso")
    private String piso;
    
    @Column(name = "categoria")
    private String categoria;
    
    @Column (name = "configuracion")
    private String configuracion;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "precio")
    private double precio;

    // Relación inversa con Reservas (ManyToMany)
    @ManyToMany(mappedBy = "habitaciones")
    private List<Reservas> reservas;
    
    public Habitacion() {
    }

    public Habitacion(int numero, String piso, String categoria, String configuracion, String descripcion, double precio) {
        this.numero = numero;
        this.piso = piso;
        this.categoria = categoria;
        this.configuracion = configuracion;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public String getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservas> reservas) {
        this.reservas = reservas;
    }
    
    @Override
    public String toString() {
        return "Habitacion {" + "ID Habitacion: " + idHabitacion +
                ", numero: " + numero + ", piso: " + piso + 
                ", categoria: " + categoria + ", descripcion: " + descripcion + 
                ", precio: " + precio + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(numero, piso);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Objects.equals(numero, that.numero) &&
               Objects.equals(piso, that.piso);
    }
    
}
