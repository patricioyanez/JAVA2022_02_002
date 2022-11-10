package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CPersona {
    private Conexion conexion = new Conexion();
    public boolean agregar(Persona persona)
    {
        try{
            Connection cnx = conexion.obtenerConexion();
            String sql = "INSERT INTO PERSONA (RUT, NOMBRE, APELLIDO, DIRECCION) VALUES (?,?,?,?)";
            
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, persona.getRut());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setString(4, persona.getDireccion());
            
            ps.executeUpdate();
            ps.close();
            cnx.close();
            return true;
        }
        catch( Exception ex)
        {
            System.out.println("Error en la ejecución de la sentencia");
        }
        return false;
    }
    
    public Persona leer(int id)
    {
        return new Persona();
    }
}
