
public class Principal {
    public static void main(String[] args) {
        long codigoAuxiliar = 1000000000000000l;
        Trabajador t1 = new Trabajador(1000, "K", "Juan");
        Trabajador t2 = new Trabajador(1200, "1", "Ana");
        
        System.out.println(codigoAuxiliar);
        GiftCard g1 = new GiftCard();
        codigoAuxiliar = g1.generarCodigo(codigoAuxiliar);
        System.out.println(codigoAuxiliar);
        GiftCard g2 = new GiftCard();
        codigoAuxiliar = g2.generarCodigo(codigoAuxiliar);
        System.out.println(codigoAuxiliar);
        
    }
}
