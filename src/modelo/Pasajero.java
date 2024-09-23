package modelo;

public class Pasajero {
    private String nombre;
    private String apellido;
    private int dni;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    private String pais;
    

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, int dni, String telefono, String email, String direccion, String ciudad, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
    
}
