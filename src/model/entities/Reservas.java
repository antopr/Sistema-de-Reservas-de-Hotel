package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "reserva")
public class Reservas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idReserva;
    
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private List<Habitacion> habitaciones;
    private Pasajero pasajero;
    private String senia;

    public Reservas() {
    }

    public Reservas(LocalDate fechaCheckIn, LocalDate fechaCheckOut, List<Habitacion> habitaciones, Pasajero pasajero, String senia) {
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
    
    
   
   
}
