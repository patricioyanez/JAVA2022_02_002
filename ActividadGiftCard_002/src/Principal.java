
import java.sql.Date;


public class Principal {
    public static void main(String[] args) {
        long codigoAuxiliar = 1000000000000000l;
        Trabajador t1 = new Trabajador(10500600, "K", "Juan");
        Trabajador t2 = new Trabajador(1200800, "1", "Ana");
        
//        System.out.println(codigoAuxiliar);
        GiftCard g1 = new GiftCard();
        codigoAuxiliar = g1.generarCodigo(codigoAuxiliar);
        g1.setTrabajador(t1);
        g1.generarClave();
        g1.setMonto(100000);
        g1.setVigencia(Date.valueOf("2023-01-01"));
//        System.out.println(codigoAuxiliar);
        GiftCard g2 = new GiftCard();
        codigoAuxiliar = g2.generarCodigo(codigoAuxiliar);
        g2.setTrabajador(t2);
        g2.generarClave();
        g2.setMonto(200000);        
        g2.setVigencia(Date.valueOf("2022-01-01")); //import java.sql.Date;
//        System.out.println(codigoAuxiliar);
        
        System.out.println(g1.toString());
        System.out.println(g2);
        
        int saldo = g1.descontar(50000);
        if(saldo >= 0)
            System.out.println("g1: Saldo de la GiftCard: " + saldo);
        else
            System.out.println("g1: Saldo insuficiente");
        
        saldo = g2.descontar(500000);
        if(saldo >= 0)
            System.out.println("g2: Saldo de la GiftCard: " + saldo);
        else
            System.out.println("g2: Saldo insuficiente");
        
        if(g1.validarVigencia())
            System.out.println("g1: Puede comprar");
        else
            System.out.println("g1: NO puede comprar");
        
        if(g2.validarVigencia())
            System.out.println("g2: Puede comprar");
        else
            System.out.println("g2: NO puede comprar vencio el: " + g2.getVigencia());
        
    }
}
