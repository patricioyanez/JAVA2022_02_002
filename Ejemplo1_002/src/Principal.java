
public class Principal {
    
    // metodo permite el arranque la aplicación
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo!!!");
        
        Pizza pizza1;
        pizza1 = new Pizza("Texana", "Familiar", "Gruesa");
        
        Pizza pizza2 = new Pizza();
        
        pizza1.preparar();
        pizza1.cocinar();
        pizza2.preparar();
        pizza2.cocinar();
        
        
        
    }    
}
