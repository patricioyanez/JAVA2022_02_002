import java.util.Scanner;

public class Ciclos4 {
    // solicitar edad y contar cuantos son mayores de edad 
    // y menores de edad hay n personas.
    // crear menu para el ingreso de la edad, reporte y salir 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        int opcion= 0;
        int edad  = 0;
        while(opcion != 3)
        {
            System.out.println("*** Contador de edad ***");
            System.out.println("1.- Ingresar edad");
            System.out.println("2.- Reporte");
            System.out.println("3.- Salida");
            System.out.print("Ingrese su opción: ");
            opcion = leer.nextInt();
            if(opcion < 1 || opcion > 3)
            {
                System.out.println("Opción no es válida.");
            }
            else if(opcion == 1)
            {
                System.out.println("== ingreso de edad ==");
                System.out.print("Ingrese su edad:");
                edad = leer.nextInt();
                if(edad < 18)
                    menor++;
                else
                    mayor++;
            }
            else if(opcion == 2)
            {
                System.out.println("*** Reporte ***");
                System.out.println("Cantidad de menores de edad : " + menor);
                System.out.println("Cantidad de mayores de edad : " + mayor);
                System.out.println("total                       : " + (menor + mayor));
            }
        }
    }    
}
