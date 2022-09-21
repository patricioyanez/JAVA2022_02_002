import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        ArrayList<String> nombres2;
        nombres2 = new ArrayList<String>();
        
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Angel");
        System.out.println(nombres);
        
        System.out.println("Valor indice 3: " + nombres.get(3));
        nombres.set(3,"Candy");
        System.out.println("Valor indice 3: " + nombres.get(3));
        
        // recorrer la coleccion mediante un for que muestre
        // el nombre es: xxxx
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("El nombre es: " + nombres.get(i));
        }
        // for each (optimizada)
        System.out.println("For each (optimizado)");
        for(String aux: nombres)
        {
            System.out.println("El nombre es: " + aux);
        }
        
        // eliminar un elemento
        nombres.remove("Ana");
        System.out.println("nombres = " + nombres);
        nombres.remove(1);
        System.out.println("nombres = " + nombres);
        
        // contains devuelve V o F
        boolean res = nombres.contains("Candy");
        
        if (res) {
            System.out.println("Está en la colección");
        } else {
            System.out.println("No está en la colección");
        }

        System.out.println("Cantidad de elementos: " + nombres.size());
        nombres.clear();
        System.out.println("Cantidad de elementos: " + nombres.size());
    }
    
}
