public class App {

    public static void main(String[] args)
    {
        int a = 15;
        int b = 25;
        int c = 48;
        int resultado = sumThreeNumbers(a, b, c);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int sumThreeNumbers(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
