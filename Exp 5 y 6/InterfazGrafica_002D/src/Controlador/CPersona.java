package Controlador;
import Conexion.Conexion;
import Modelo.Persona;

public class CPersona {
    private Conexion conexion = new Conexion();
    public boolean agregar(Persona persona)
    {
        return true;
    }
    public Persona leer(int id)
    {
        return new Persona();
    }
}
