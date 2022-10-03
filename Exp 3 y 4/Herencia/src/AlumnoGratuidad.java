
public class AlumnoGratuidad extends Alumno {
    private boolean aprobado;
    
    public AlumnoGratuidad()
    {
        super();
        System.out.println("Alumno con gratuidad...");
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String datos() {
        return "*** Datos Alumno Gratuidad ***" + 
                "\nRut      :   " + getRut()+ 
                "\nNombre   :   " + getNombre() + 
                "\nCarrera  :   " + getCarrera()+ 
                "\nAprobado :   " + (this.aprobado?"Si":"No") 
                ;
    }
    
}
