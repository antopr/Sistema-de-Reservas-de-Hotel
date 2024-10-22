package model.storage;

import java.util.List;
import model.exceptions.NotFoundException;

public interface Dao<T,ID> {
    public abstract void insertar(T entidad) throws Exception;
    
    public abstract T obtenerPorId(ID id) throws NotFoundException;
    
    public abstract List<T> obtenerTodos();
    
    public abstract void modificar(T entidad) throws Exception;
    
    public abstract void eliminar(ID id) throws Exception;
}
