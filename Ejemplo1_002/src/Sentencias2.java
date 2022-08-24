import java.util.Scanner;

public class Sentencias2 {
    
    public static void main(String[] args) {
        // leer el teclado
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int opcion = 0;
        System.out.println("*** Mesa de votos ***");
        System.out.println("1.- Apruebo");
        System.out.println("2.- Rechazo");
        System.out.println("3.- Nulo / blanco");
        System.out.print("Seleccione opción: ");
        opcion = leer.nextInt();
        
        if(opcion < 1 || opcion > 3) // && => and
        {
            System.out.println("Opcion no es válida.");
        }        
        else
        {
            if(opcion == 1)
            {
                System.out.println("Ud. votó apruebo.");
            }
            else if(opcion == 2)
            {
                System.out.println("Ud. votó rechazo.");
            }
            else
            {
                System.out.println("Ud. votó en blanco o nulo.");
            }

            String nombre;
            System.out.print("Escriba su nombre:");
            nombre = leer.next();
            System.out.println("Gracias " + nombre + " por votar");
        }
        // 211 y 221 ppt
        
        
    }
}
