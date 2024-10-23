package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reserva")
public class Reservas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idReserva;
    
    @Column(name = "fechaReserva")
    private LocalDate fechaReserva;
    
    @Column(name = "fechaDeIngreso")
    private LocalDate fechaCheckIn;
    
    @Column(name = "fechaDeSalida")
    private LocalDate fechaCheckOut;
    
    //relecion con pasajero 
    @ManyToOne
    @JoinColumn(name = "idPasajero") // fk en tabla reserva
    private Pasajero pasajero;
    
    
    @ManyToMany
    @JoinTable(
            name = "reservasHabitaciones",
            joinColumns = @JoinColumn(name = "reservaId"),
            inverseJoinColumns = @JoinColumn(name = "habitacionId")
    
    )
    private List<Habitacion> habitaciones;
    
    private String senia;

    public Reservas() {
    }

    public Reservas(LocalDate fechaReserva, LocalDate fechaCheckIn, LocalDate fechaCheckOut, List<Habitacion> habitaciones, Pasajero pasajero, String senia) {
        this.fechaReserva = fechaReserva;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.habitaciones = habitaciones;
        this.pasajero = pasajero;
        this.senia = senia;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDate fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(LocalDate fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getSenia() {
        return senia;
    }

    public void setSenia(String senia) {
        this.senia = senia;
    }

    @Override
    public String toString() {
        return "Reservas{" + "fechaCheckIn=" + fechaCheckIn + ", fechaCheckOut=" + fechaCheckOut + 
                ", habitaciones=" + habitaciones + ", pasajero=" + pasajero + ", senia=" + senia + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(fechaReserva, pasajero);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reservas = (Reservas) o;
        return Objects.equals(fechaReserva, reservas.fechaReserva) &&
           Objects.equals(pasajero, reservas.pasajero);
    }
   
   
}
