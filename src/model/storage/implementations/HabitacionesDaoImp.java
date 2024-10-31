package model.storage.implementations;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.entities.Habitacion;
import model.exceptions.NotFoundException;
import model.storage.Dao;

public class HabitacionesDaoImp implements Dao<Habitacion, Integer> {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("resarvasHotelPU");
    private EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    @Override
    public void insertar(Habitacion habitacion) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(habitacion);
            em.flush();
            em.refresh(habitacion);
            //me aseguro que se asigne bien
            System.out.println("Id generado de la habitacion " + habitacion.getIdHabitacion());
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }       
    }
    
    // obtener por numero de hab
    @Override
    public Habitacion obtenerPor(Integer numeroHabitacion) throws NotFoundException {
        EntityManager em = getEntityManager();
        try {
            Habitacion habitacion = em.createQuery("SELECT h FROM Habitacion h WHERE h.numero = :numero", Habitacion.class)
                                    .setParameter("numero", numeroHabitacion)
                                    .getSingleResult();
            return habitacion;
            
        } catch (Exception e) {
             throw new NotFoundException("La habitación con número: " + numeroHabitacion + " no existe.");
        } finally{
            em.close();
        }
      
    }

    @Override
    public Habitacion obtenerPorId(Integer id) throws NotFoundException {
        EntityManager em = getEntityManager();
        try {
            Habitacion habitacion = em.find(Habitacion.class, id);
            if (habitacion == null){
                throw new NotFoundException("Habitación con id: " + id + " no encontrada.");
            }
            return habitacion;
        } finally {
            em.close();
        }
       
    }

    @Override
    public List<Habitacion> obtenerTodos() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT h FROM Habitacion h", Habitacion.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void modificar(Habitacion habitacion) throws NotFoundException {
        EntityManager em = getEntityManager();
        
        
    }

    @Override
    public void eliminar(Integer numeroHabitacion) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            int deletedHabitacion = em.createQuery("DELETE FROM Habitacion h WHERE h.numero = :numero")
                                      .setParameter("numero", numeroHabitacion)
                                      .executeUpdate();
            if (deletedHabitacion == 0) {
                throw new NotFoundException("Habitación con número: " + numeroHabitacion + " no encontrada");
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
