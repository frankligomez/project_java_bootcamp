public class tarea_4 {
    public static void main(String[] args) {
        
        //Ejemplo del if:

        int numeroIf = -8;

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        }
        else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        }
        else {
            System.out.println("El número es 0.");
        }
    
        // Ejemplo del while:

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor del numero While es: " + numeroWhile);
        }

        // Ejemplo del Do While:

        int numeroDowhile = 0;
        do {
            numeroDowhile++;
            System.out.println("El valor del numero Do While es: " + numeroDowhile);
        }
            while (numeroDowhile < 3);

        // Ejemplo del For:

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
        {
            System.out.println("El valor del numero For: " + numeroFor);
        }

        //Ejemplo de switch:

        String estacion = "PRIMAVERA";
        
        switch (estacion)
        {
            case "INVIERNO":
                System.out.println("Estamos en Invierno.");
                break;
            case "VERANO":
                System.out.println("Estamos en Verano.");
                break;
            case "OTOÑO":
                System.out.println("Estamos en Otoño.");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en Primavera.");
                break;
            default:
                System.out.println("NO es una estación válida.");
        }

    }  
         
}

