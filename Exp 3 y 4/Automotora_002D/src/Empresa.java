
import java.util.ArrayList;

public class Empresa {
    // atributo (sin arraylist, nulo)
    private ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        // crea el arrayList
        empleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    public boolean buscar(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equalsIgnoreCase(rut))
                return true;
        }
        return false;
    }

    public void listar()
    {
        System.out.println("**** Listado de empleados ****");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.datos());
        }
    }
    public boolean eliminar(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equalsIgnoreCase(rut))
            {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }
}
