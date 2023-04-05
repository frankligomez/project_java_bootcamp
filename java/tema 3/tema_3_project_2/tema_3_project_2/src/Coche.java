public class Coche {
    private int numPuertas;

    public Coche(int numPuertas)
    {
        this.numPuertas = numPuertas;
    }
    public void masPuerta()
    {
        this.numPuertas++;
    }
    public int getNumPuertas()
    {
        return numPuertas;
    }
    public static void main(String[] args)
    {
        Coche miCoche = new Coche(3);
        miCoche.masPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }

}
