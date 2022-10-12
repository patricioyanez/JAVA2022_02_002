
public abstract class Venta implements IOperaciones{
    private int folio;
    private int totalNeto;
    private int totalIva;
    private int totalAPagar;
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(int totalNeto) {
        this.totalNeto = totalNeto;
    }

    public int getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(int totalIva) {
        this.totalIva = totalIva;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
    
}
