
public class Pizza {
    // 1.- Atributos
    private String nombre;
    private String tamano;
    private String masa;
    // 2.- Constructor
    public Pizza()
    {
        this.nombre = "";
        this.masa = "";
        this.tamano = "";
        System.out.println("Constructor vacio");
    }
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
    // 3.- getter and setter
    
    // 4.- Metodos customer o personalizado
    public void preparar()
    {
        System.out.println("La pizza se está preparando");
    }
    public void cocinar()
    {
        System.out.println("La pizza está cocinandose");
    } 
    
} // llave de cierre de la clase   

