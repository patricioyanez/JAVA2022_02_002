
public class Principal {
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
        ag.setRut("1-9");
        ag.setNombre("Juan");
        ag.setCarrera("Parvulo");
        ag.setActivo(true);
        
        System.out.println(ag.datos());
        
        Persona p1 = new Persona();
        p1.setRut("2-7");
        p1.setNombre("Alex");
        
        System.out.println(p1.datos());
        
        Alumno a1 = new Alumno();
        a1.setRut("3-5");
        a1.setNombre("Ana");
        a1.setCarrera("Analista");
        
        System.out.println(a1.datos());
        
        // sobre carga
        ag.calcularMatricula();
        ag.calcularMatricula(124000);
        ag.calcularMatricula(124000, 10);
        
    }
}
