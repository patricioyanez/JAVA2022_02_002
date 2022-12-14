import java.time.LocalDate;
import java.util.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date vigencia;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vigencia = new Date(); // null;
        this.trabajador = new Trabajador(); //null;
    }
    
    
    public GiftCard(long codigo, int clave, int monto, Date vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "**** Datos de GiftCard ****\n" + 
                    "Codigo     = " + codigo + "\n" +
                    "Clave      = " + clave + "\n" + 
                    "Monto      = " + monto + "\n" +
                    "Vigencia   = " + vigencia + "\n" + 
                     trabajador;
    }
    
    public long generarCodigo(long codigo)
    {
        this.codigo = codigo + 1 ;
        return this.codigo;
    }
    public void generarClave()
    {
        //String clave = Integer.toString(this.trabajador.getRut());
        String clave = "" + this.trabajador.getRut();
        clave = clave.substring(0, 4);
        this.clave = Integer.parseInt(clave); // convierte str a int
    }
    public boolean verificarSaldo(int montoCompra)
    {
        if(montoCompra > this.monto)
            return false;
        else
            return true;
    }
    
    public int descontar(int montoCompra)
    {
        if(montoCompra <= this.monto)
        {
            this.monto -= montoCompra; // saldo o cero
            return this.monto;
        }
        else
        {
            return -1;
        }
    }
    public boolean validarVigencia()
    {
        if(this.vigencia.before(java.sql.Date.valueOf(LocalDate.now())))
            return false;
        else
            return true;
    }
    
}
