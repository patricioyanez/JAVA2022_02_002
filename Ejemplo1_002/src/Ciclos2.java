import java.util.Scanner;

public class Ciclos2 {
    public static void main(String[] args) {
        // leer el teclado
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        int opcion = 0;
        int apruebo = 0;
        int rechazo = 0;
        int otro = 0;
        
        while(opcion != 4)
        {
            System.out.println("*** Mesa de votos ***");
            System.out.println("1.- Apruebo");
            System.out.println("2.- Rechazo");
            System.out.println("3.- Nulo / blanco");
            System.out.println("4.- Salir");
            System.out.print("Seleccione opción: ");
            opcion = leer.nextInt();

            if(opcion < 1 || opcion > 4) 
            {
                System.out.println("Opción no es válida.");
            }        
            else
            {
                if(opcion == 1)
                {
                    apruebo++;
                }
                else if(opcion == 2)
                {
                    rechazo++;
                }
                else if(opcion == 3)
                {
                    otro++;
                }
            }
        }
        System.out.println("*** Resumen de la mesa ***");
        System.out.println("Apruebo     : " + apruebo);
        System.out.println("Rechazo     : " + rechazo);
        System.out.println("Blanco/Nulo : " + otro);
        System.out.println("*************************");
        System.out.println("Total de votos: " + (apruebo+rechazo+otro));
        System.out.println("*************************");
    }
}
