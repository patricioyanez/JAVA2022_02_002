
public class Persona {
    private String rut;
    private String nombre;
    
    public Persona() {
        System.out.println("Hola Soy Persona");
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String datos()
    {
        return "Nombre  : " + nombre + 
               "\nRut     : " + rut;
    }
}
