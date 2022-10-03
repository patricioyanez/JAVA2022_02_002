
public class Principal {
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
        ag.setRut(1000);
        ag.setNombre("Juan");
        ag.setCarrera("Parvulo");
        ag.setAprobado(true);
        
        System.out.println(ag.datos());
        
        Persona p1 = new Persona();
        System.out.println(p1.toString());
        p1.setRut(1);
        p1.setNombre("Ana");
        Alumno a1 = new Alumno();
        a1.setRut(2);
        a1.setNombre("Pedro");
        a1.setCarrera("Agronomía");
        System.out.println(a1.toString());
    }
}
