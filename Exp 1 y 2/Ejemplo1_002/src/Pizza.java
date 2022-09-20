
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
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getTamano()
    {
        return this.tamano;
    }
    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }
    public String getMasa()
    {
        return this.masa;
    }
    public void setMasa(String masa)
    {
        this.masa = masa;
    }
    
    // 4.- Metodos customer o personalizado
    public void preparar()
    {
        System.out.println("La pizza se está preparando");
    }
    public void cocinar()
    {
        System.out.println("La pizza está cocinandose");
    } 
    public void imprimir()
    {
        System.out.println("**** Datos de la Pizza ****");
        System.out.println("Nombre  : " + this.nombre);
        System.out.println("Tamano  : " + this.tamano);
        System.out.println("Masa    : " + this.masa);
        System.out.println("***************************");
        
    }
    
} // llave de cierre de la clase   

