package model.storage.implementations;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            em.flush();
            em.refresh(pasajero);
            System.out.println("ID generado: " + pasajero.getIdPasajero());

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
            return em.createQuery("SELECT p FROM Pasajero p", Pasajero.class).getResultList();
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
            
            System.out.println("ID recibido para modificar en metodo modificar: " + pasajero.getIdPasajero());
           
            Pasajero pasajeroExistente = em.find(Pasajero.class, pasajero.getIdPasajero()); 
            System.out.println("ID recibido para modificar: " + pasajero.getIdPasajero());
            if (pasajeroExistente == null) {
                throw new Exception("Pasajero no encontrado para actualizar");                
            } 
            
            //actualizo los campos
            pasajeroExistente.setNombre(pasajero.getNombre());
            pasajeroExistente.setApellido(pasajero.getApellido());
            pasajeroExistente.setEmail(pasajero.getEmail());
            pasajeroExistente.setDni(pasajero.getDni());
            pasajeroExistente.setTelefono(pasajero.getTelefono());
            pasajeroExistente.setDireccion(pasajero.getDireccion());
            pasajeroExistente.setCiudad(pasajero.getCiudad());
            pasajeroExistente.setPais(pasajero.getPais());
            
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            Logger.getLogger(PasajeroDaoImp.class.getName()).log(Level.SEVERE, null, e);
            throw new NotFoundException("Error al modificar el pasajero: " + e.getMessage());
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
    // ok
    @Override
    public Pasajero obtenerPorId(Integer id) throws NotFoundException {
        EntityManager em = getEntityManager();
        try {
            Pasajero pasajero = em.find(Pasajero.class, id);
            if (pasajero == null) {
                throw new NotFoundException("Persona con id: " + id + " no encontrada.s");
            }
            return pasajero;
        } finally {
            em.close();
        }
    }

    
}