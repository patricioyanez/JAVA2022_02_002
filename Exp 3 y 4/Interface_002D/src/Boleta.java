
public class Boleta extends Venta{

    @Override
    public int grabar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiar() {
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
