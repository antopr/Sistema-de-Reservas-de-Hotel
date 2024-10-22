package sistemaresarvashotel;

import model.entities.Pasajero;
import model.storage.Dao;
import model.storage.implementations.PasajeroDaoImp;

public class Progam {

    public static void main(String[] args) {
        PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();
        
        
        Pasajero otroPasajeroNuevo = new Pasajero (4555666, "Carlos", "Dominguez", "12546247795", "carlosD@gmail.com", "Juncal 2356", "Buenos Aires", "Argentina");      
        /*
        try {
            pasajeroDao.insertar(otroPasajeroNuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        // Obtener pasajero por ID ok
        try {
            Pasajero p = pasajeroDao.obtenerPorId(4555666);
            System.out.println("Pasajero obtenido: " + p.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
       /*
        Dao pasajeroDAO = new PasajeroDaoImp();
        Pasajero nuevoPasajero = new Pasajero (1234, "Lucia", "Perez", "223598765", "lupe@gmail.com", "Av. Luro 2323", "Mar del Plta", "Argentina");
        pasajeroDAO.insertar(nuevoPasajero);
        */
       
       
    }
    
}
