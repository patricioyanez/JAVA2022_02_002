
package Modelo;


public class Administrativo {
    private int rut;
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private char genero;
    private long sueldo;

    public Administrativo() {
        this.rut = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.altura = 0;
        this.genero = ' ';
        this.sueldo = 0;
    }
    public Administrativo(int rut, String nombre, String apellido, int edad, double altura, char genero, long sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.sueldo = sueldo;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void limpiar()
    {
        this.rut = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.altura = 0;
        this.genero = ' ';
        this.sueldo = 0;
    }

    public String imprimirDatos() {
        return "\nrut=" + rut + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", edad=" + edad + 
                ", altura=" + altura + 
                ", genero=" + genero + 
                ", sueldo=" + sueldo;
    }
    
}
