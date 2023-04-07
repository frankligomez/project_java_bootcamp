public class switch_case {
    public static void main(String[] args) 
    {
        var hoy_es = "DOMINGO";

        switch(hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es día hábil");
                break;
            case "SABADO":
            case "DOMINGO":
                    System.out.println("Hoy es día festivo");                         
        }
    }
}
