public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(45, "Franli", "123456789", 5000);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
    
        Trabajador trabajador = new Trabajador(50, "Carlos", "987654321", 4500);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Crédito: " + trabajador.getSalario());
   
    }
}

