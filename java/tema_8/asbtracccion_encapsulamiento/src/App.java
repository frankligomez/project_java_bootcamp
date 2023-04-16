public class App {
    public static void main(String[] args) 
    {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
    }
}

    class Vehiculo
    {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getTipo() 
    {
        return this.tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) 
    {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() 
    {
        return this.velocidadMaxima;
    }

    public void setRapido(boolean rapido) 
    {
        this.rapido = rapido;
    }

    public boolean isRapido() 
    {
        return this.rapido;
    }
}
