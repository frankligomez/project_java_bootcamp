public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();
        
    }
}

class Vehiculo {
    public void diHola() {
    System.out.println("Digo hola");
    }
}

class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un coche");
    }
}