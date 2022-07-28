package Switch;

public class Main {
    public static void main(String[] args) {
        String estacion = "INVIERNO";

        switch (estacion){
            case "OTOÑO":
                System.out.println(" Estamos en OTOÑO ");
                break;
            case "INVIERNO":
                System.out.println(" Estamos en INVIERNO ");
                break;
            case "PRIMAVERA":
                System.out.println(" Estamos en PRIMAVERA");
                break;
            case "VERANO":
                System.out.println(" Estamos en VERANO");
                break;

            default:
                System.out.println(" Frio y mas frio, sin estacion ");
        }
    }
}
