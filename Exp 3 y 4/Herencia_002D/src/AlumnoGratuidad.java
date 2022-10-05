
public class AlumnoGratuidad extends Alumno{
    private Boolean activo;
    
    public AlumnoGratuidad() {
        System.out.println("Soy Alumno Gratuidad");
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
// sobre escritura o reescribir
    @Override
    public String datos() {
        return super.datos() +
                "\nActivo   : " + (this.activo?"Si":"No");
    }
    
// sobre carga
    
}
