package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Persona buscarPorRut(String rut)
    {
        try {
            Persona persona = new Persona();
            Connection cnx = conexion.obtenerConexion();
            String sql = "SELECT * FROM PERSONA WHERE RUT = ?";
            PreparedStatement sp = cnx.prepareStatement(sql);
            sp.setString(1, rut);
            ResultSet rs = sp.executeQuery();
            
            if(rs.next())
            {
                persona.setRut(rs.getString("rut"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDireccion(rs.getString("direccion"));
                return persona;
            }
            else
            {
                return null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
