
public class Principal {
    public static void main(String[] args) {
        Puesto supervisor = new Puesto(100, "Supervisor");
        Puesto cajero = new Puesto(200, "Cajero");
        
        Empleado e1 = new Empleado("1-9", "Juan", "M", 2, 30, cajero);
        Empleado e2 = new Empleado("2-7", "Ana", "F", 4, 40, cajero);
        Empleado e3 = new Empleado("3-5", "Luis", "M", 5, 50, supervisor);
        
        Empresa mall = new Empresa();
        
        mall.agregar(e3);
        mall.agregar(e2);
        mall.agregar(e1);
        
        mall.listar();
        
        if (mall.buscar("1-9")) {
            System.out.println("Rut existe");
        } else {
            System.out.println("Rut NO existe");
        }
        
        if (mall.buscar("5-1")) {
            System.out.println("Rut existe");
        } else {
            System.out.println("Rut NO existe");
        }
        
        boolean res = mall.eliminar("2-7");
        if (res) {
            System.out.println("Rut eliminado");
        } else {
            System.out.println("Rut no eliminado");
        }
        mall.listar();
       
    }
}
