package sistemaresarvashotel;

import model.entities.Pasajero;
import model.exceptions.NotFoundException;
import model.storage.Dao;
import model.storage.implementations.PasajeroDaoImp;

public class Progam {

    public static void main(String[] args) throws NotFoundException {
        
        PasajeroDaoImp pasajeroDao = new PasajeroDaoImp();
        
        
        Pasajero otroPasajeroNuevo = new Pasajero (4555666, "Carlos", "Dominguez", "12546247795", "carlosD@gmail.com", "Juncal 2356", "Buenos Aires", "Argentina");      
        Pasajero otroPasajeroMas = new Pasajero (40233455, "Luana", "Gonzalvez", "37483928323823", "lug@gmail.com", "rua 123", "Floripa", "Brasil");
        Pasajero otroPasajeroMasNuevo = new Pasajero (123456789, "Marcos", "Lopez", "112223334445556", "marcoslp@gmail.com", "Calle 123", "Mar del Plata", "Argentina");
         
      
       
       
       
    }
    
}
