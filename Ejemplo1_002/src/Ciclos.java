import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor = 0;
        int contador = 0;
        System.out.print("Ingrese un numero:");
        valor = leer.nextInt();
        
        while(contador < valor && 1 == 1)
        {
            contador++;// contador += 1;
            System.out.println("Nro:" + contador);
        }
    }
}
