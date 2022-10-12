
public class Factura extends Venta {

    private String rut;

    public Factura() {
        int total = 1000;
        // se puede ocupar sin IOperaciones
        total += (total * IOperaciones.IVA / 100);
        System.out.println("Total :" + total);
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public int grabar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiar() {
        this.rut = "";
        this.setFolio(0);
        this.setTotalAPagar(0);
        this.setTotalIva(0);
        this.setTotalNeto(0);
    }

    @Override
    public int totalDeLaVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int descuento(int porcentaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
