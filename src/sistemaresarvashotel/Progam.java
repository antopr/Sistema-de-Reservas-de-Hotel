package sistemaresarvashotel;

import model.entities.Pasajero;
import model.storage.Dao;
import model.storage.implementations.PasajeroDaoImp;

public class Progam {

    public static void main(String[] args) {
        Dao pasajeroDAO = new PasajeroDaoImp();
        Pasajero nuevoPasajero = new Pasajero (1234, "Lucia", "Perez", "223598765", "lupe@gmail.com", "Av. Luro 2323", "Mar del Plta", "Argentina");
        pasajeroDAO.insertar(nuevoPasajero);
    }
    
}
