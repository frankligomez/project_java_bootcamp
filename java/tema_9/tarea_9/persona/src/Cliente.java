public class Cliente extends Persona {
    private double credito;
    
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}