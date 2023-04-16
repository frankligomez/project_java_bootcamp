public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRR"); 
        System.out.println(coche.getSonido());
        
    }
}

abstract class Vehiculo {
    int vehiculoMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("Estoy en el constructor de Vehículo:");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

}  

class Coche extends Vehiculo {
    public String getSonido() {
        System.out.println("Soy un super sonido: " + this.sonido);
        return "Soy un sonido de moto: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

}


class Moto extends Vehiculo {
    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

}
