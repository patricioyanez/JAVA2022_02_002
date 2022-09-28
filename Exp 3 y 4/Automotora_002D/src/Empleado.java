
public class Empleado {
    private String rut;
    private String nombre;
    private String genero;
    private int aniosServicio;
    private int edad;
    private Puesto puesto;

    public Empleado() {
        this.rut = "";
        this.nombre = "";
        this.genero = "";
        this.aniosServicio = 0;
        this.edad = 0;
        this.puesto = new Puesto();
    }
    public Empleado(String rut, String nombre, String genero, int aniosServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String datos() {
        return "Empleado:" + 
                "rut=" + rut + 
                ", nombre=" + nombre + 
                ", genero=" + genero + 
                ", aniosServicio=" + aniosServicio + 
                ", edad=" + edad + 
                "\n" + puesto.datos();
    }
    
    
    
    
    
}
