
public class Principal {
    public static void main(String[] args) {
        Vehiculo camion = new Camion();
        Vehiculo moto = new Moto();
        
//        Moto m = new Vehiculo();

        camion.mover();
        moto.mover();
        
        //Vehiculo v = new Vehiculo();
    }
}
