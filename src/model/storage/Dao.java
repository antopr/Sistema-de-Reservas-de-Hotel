package model.storage;

import java.util.List;

public interface Dao<T> {
    public abstract void insertar(T entidad);
    public abstract void eliminar(T entidad);
    public abstract void modificar(T entidad);
    public abstract List<T> seleccionar();
}
