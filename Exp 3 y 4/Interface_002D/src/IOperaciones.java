
public interface IOperaciones {
// definir metodos abstractos que por defectos son publicos
// tambien variables finales o constantes.
    int grabar();
    void limpiar();
    int totalDeLaVenta();
    int descuento(int porcentaje);// numero entero
    
    int IVA = 19;
    double ILA = 31.5;
    int ICA = 5;
    
}
