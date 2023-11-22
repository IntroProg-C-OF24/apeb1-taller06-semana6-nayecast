package taller6;

import java.util.Scanner;

public class FacturaciondedosProductos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double iphone, ipad, iphoneCosto, ipadCosto, iphoneTotal, ipadTotal, subtotal, descuento1, descuento2, envio, subtotalIva, montoFacturar, montoFacturar2;
        System.out.println("Ingresar el envio a adquirir: ");
        envio = teclado.nextDouble();
        System.out.println("Ingresar la cantidad de Iphone: ");
        iphone = teclado.nextDouble();
        System.out.println("Ingresar la cantidad de Ipads: ");
        ipad = teclado.nextDouble();
        System.out.println("Ingresar el costo del Iphone por unidades: ");
        iphoneCosto = teclado.nextDouble();
        iphoneTotal = iphone * iphoneCosto;
        System.out.println("Ingresar el costo por unidades del IPAD: ");
        ipadCosto = teclado.nextDouble();
        ipadTotal = ipad * ipadCosto;
        subtotal = (ipadTotal + iphoneTotal);
        subtotalIva = ((ipadTotal + iphoneTotal) * 0.12) + subtotal;
        descuento1 = (subtotal * 0.20);
        descuento2 = (subtotal * 0.050);
        montoFacturar = (subtotal + (subtotal - descuento1) * 0.12) + envio;
        montoFacturar2 = (subtotal + (subtotal - descuento1) * 0.12);
        System.out.println("Costo Iphones: " + iphoneTotal);
        System.out.println("Costo Ipads. " + ipadTotal);
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("Subtotal + IVA: " + subtotalIva);
        if (montoFacturar > 1000) {
            System.out.println("Descuento: " + descuento1);
        } else {
            System.out.println("Descuento: " + descuento2);
        }
        if (subtotal < 5000) {
            System.out.println("Envio: " + envio);
        }
        System.out.println("Monto Facturar: " + montoFacturar);
    }

}
