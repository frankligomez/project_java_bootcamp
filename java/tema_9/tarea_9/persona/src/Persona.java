public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;    
    }

    public String getNombre() {
        return nombre;    
    }

    public String getTelefono() {
        return telefono;    
    }
}