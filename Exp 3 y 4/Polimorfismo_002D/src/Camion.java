
public class Camion extends Vehiculo {
    public void mover()
    {
        System.out.println("El Camión se mueve... prrrrrrr ");
    }

    @Override
    public boolean estaEncendido() {
        System.out.println("Camión encendido");
        return true;
    }
}
