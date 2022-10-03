
public class Alumno extends Persona {
    private String carrera;
    public Alumno()
    {
        System.out.println("Alumno....");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "**** Alumno ****" + 
                "\nrut      = " + getRut() + 
                "\nnombre   = " + super.getNombre() +
                "\ncarrera  = " + carrera;
    }
    
}
