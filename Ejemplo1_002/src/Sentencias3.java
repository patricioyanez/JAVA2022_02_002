import java.util.Scanner;

public class Sentencias3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String estadoCivil;
        System.out.print("Ingrese su estado civil:");
        estadoCivil = leer.next();
        
        switch(estadoCivil.toLowerCase())
        {
            case "soltero":
                System.out.println("Ud. es soltero");
                break;
            case "casado":
                System.out.println("Ud. es casado");
                break;
            case "viudo":
                System.out.println("Ud. es viudo");
                break;
            case "divorciado":
                System.out.println("Ud. es divorciado");
                break;
            case "auc":
                System.out.println("Ud. es tiene acuerdo de U.C.");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
