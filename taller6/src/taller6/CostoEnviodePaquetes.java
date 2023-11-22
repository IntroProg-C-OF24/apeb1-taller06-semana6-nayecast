package taller6;

import java.util.Scanner;

public class CostoEnviodePaquetes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double paquete;
        double peso;
        String region;
        double costoEnvio;
        System.out.println("Ingresar el precio: ");
        paquete = teclado.nextDouble();
        System.out.println("Ingresar el peso: ");
        peso = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingresar la region: ");
        region = teclado.nextLine();
        costoEnvio = 0;
        switch (region) {
            case "local":
                if (peso < 5) {
                    paquete = paquete + 5;
                    System.out.println("El costo del paquete es: " + paquete);
                } else if (peso < 10.0) {
                    paquete = paquete + 10;
                    System.out.println("El costo del paquete es: " + paquete);
                } else {
                    paquete = paquete + 15;
                    System.out.println("El costo del paquete es: " + paquete);
                }
                break;
            case "nacional":
                if (peso >= 5 && peso < 10.0) {
                    paquete = paquete + 10;
                    System.out.println("El costo del paquete es: " + paquete);
                } else {
                    paquete = paquete + 15;
                    System.out.println("El costo del paquete es: " + paquete);
                }
                break;
            default:
                paquete = paquete + 15;
                System.out.println("El costo del paquete es: " + paquete);
                break;
        }

    }
}
