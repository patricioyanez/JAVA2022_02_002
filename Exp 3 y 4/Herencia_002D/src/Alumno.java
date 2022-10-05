
public class Alumno extends Persona{
    private String carrera;
    public Alumno() {
        System.out.println("Soy Alumno");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String datos() {
        return super.datos() +
                "\nCarrera : " + this.carrera;
    }
    
    
}
