package model.storage.implementations;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import model.entities.Pasajero;
import model.exceptions.NotFoundException;
import model.storage.Dao;

public class PasajeroDaoImp implements Dao<Pasajero, Integer> {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("resarvasHotelPU");
    private EntityManager getEntityManager(){
        return emf.createEntityManager();
    } 

    // Insertar pasajero (ok)
    @Override
    public void insertar(Pasajero pasajero) throws Exception {
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(pasajero);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback(); 
            throw e;
        } finally {
            em.close();
        }
        
    }
    
    // obtener pasajero por dni (ok)
    @Override 
    public Pasajero obtenerPor(Integer documento) throws NotFoundException {
        EntityManager em = getEntityManager();
        try {
        Pasajero pasajero = em.createQuery("SELECT p FROM Pasajero p WHERE p.dni = :dni", Pasajero.class)
                              .setParameter("dni", documento)
                              .getSingleResult();
        return pasajero;
        } catch (NoResultException e) {
            throw new NotFoundException("Persona con documento: " + documento + " no encontrada");
        } finally {
            em.close();
        }
    }
    
    // obteber todos los pasajeros
    @Override
    public List<Pasajero> obtenerTodos(){
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("FROM Pasajero", Pasajero.class).getResultList();
        } finally {
            em.close();
        }
        
    }
    
    // modificar pasajeros 
    @Override
    public void modificar(Pasajero pasajero) throws NotFoundException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            /*
            Pasajero existente = em.find(Pasajero.class, pasajero.getIdPasajero());
            if (existente == null) {
                throw new NotFoundException("Pasajero con ID: " + pasajero.getIdPasajero() + " no encontrado.");
            }
            */
            em.merge(pasajero);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();  
        }
    }
    
    // eliminar pasajeros 
    @Override
    public void eliminar(Integer documento) throws Exception {
        EntityManager em = getEntityManager();
        try {          
            em.getTransaction().begin();
            int deletedPasajero = em.createQuery("DELETE FROM Pasajero p WHERE p.dni = :dni")
                                 .setParameter("dni", documento)
                                 .executeUpdate();           
            if (deletedPasajero == 0) {
                throw new NotFoundException("Persona con documento: " + documento + " no encontrada");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    
}
