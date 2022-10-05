
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
    public void calcularMatricula()
    {
        if(activo)
            System.out.println("Matricula costo cero");
        else
            System.out.println("Debe pagar la matricula");
    }
    public void calcularMatricula(int valor)
    {
        System.out.println("Debe Pagar: " + valor);
    }    
    public void calcularMatricula(int valor, int descuento)
    {
        int total = valor - (valor * descuento / 100);
        System.out.println("Debe Pagar: " + total);
    }
}
