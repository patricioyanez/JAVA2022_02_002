
package Modelo;

public class Automovil {
    private String patente;
    private Double cilindrada;
    private String marca;
    private String modelo;
    private int puertas;
    private Double maletero;
    private Boolean encendidoElectronico;

    public Automovil() {
        this.patente = "";
        this.cilindrada = 0D;
        this.marca = "";
        this.modelo = "";
        this.puertas = 0;
        this.maletero = 0D;
        this.encendidoElectronico = false;
    }
    public Automovil(String patente, Double cilindrada, String marca, String modelo, int puertas, Double maletero, Boolean encendidoElectronico) {
        this.patente = patente;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.maletero = maletero;
        this.encendidoElectronico = encendidoElectronico;
    }

    public Boolean getEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(Boolean encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public Double getMaletero() {
        return maletero;
    }

    public void setMaletero(Double maletero) {
        this.maletero = maletero;
    }
    
    public void limpiar()
    {
        this.patente = "";
        this.cilindrada = 0D;
        this.marca = "";
        this.modelo = "";
        this.puertas = 0;
        this.maletero = 0D;
        this.encendidoElectronico = false;
    }

    public String obtenerDatos() {
        return "Automovil{" + "patente=" + patente + ", cilindrada=" + cilindrada + ", marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + ", maletero=" + maletero + ", encendidoElectronico=" + encendidoElectronico + '}';
    }
    
}
