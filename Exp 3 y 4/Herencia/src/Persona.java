
public class Persona {
    private int rut;
    private String nombre;
    
    public Persona()    
    {
        System.out.println("Persona...");
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "**** Persona ****" + 
                "\nrut      = " + rut + 
                "\nnombre   = " + nombre;
    }
    
}
