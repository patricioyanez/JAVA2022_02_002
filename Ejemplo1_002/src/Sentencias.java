
public class Sentencias {
    // psvm + tab
    public static void main(String[] args) {
        System.out.println("Aplicación ejecutando....");
        // crear 2 variables
        int numero1;
        numero1 = 20;
        
        int numero2 = 20;
        
        // if o si
        if(numero1 == numero2)
        {
            System.out.println("Los valores son iguales.");
        }

        numero2 = 40;
        if(numero1 == numero2)
        {
            System.out.println("Los valores son iguales.");
        }
        else
        {
            System.out.println("Los valores No son iguales.");
        }
        
        int edad = 10;        
        if(edad < 14)
        {
            System.out.println("Niño");
        }
        else if(edad < 19)
        {
            System.out.println("Adolescente");
        }
        else if(edad < 65)
        {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("Adulto mayor");
        }
        
        
    }
}
