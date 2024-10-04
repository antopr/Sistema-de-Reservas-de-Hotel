package model.storage.implementations;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.entities.Pasajero;
import model.storage.Dao;

public class PasajeroDaoImp implements Dao<Pasajero> {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("resarvasHotelPU");
    EntityManager em = emf.createEntityManager();

    @Override
    public void insertar(Pasajero pasajero) {
        em.getTransaction().begin();
        em.persist(pasajero);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(Pasajero entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Pasajero entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pasajero> seleccionar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
