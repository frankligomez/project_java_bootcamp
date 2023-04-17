public class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}