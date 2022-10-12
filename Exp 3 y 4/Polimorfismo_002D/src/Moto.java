
public class Moto extends Vehiculo{
    public void mover()
    {
        System.out.println("La moto se mueve... ran ran rannnn");
    }

    @Override
    public boolean estaEncendido() {
        System.out.println("La moto esta encendida");
        return true;
    }
}
