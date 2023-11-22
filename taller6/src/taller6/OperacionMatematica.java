package taller6;

import java.util.Scanner;

public class OperacionMatematica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num;
        num = teclado.nextInt();
        switch (num) {
            case 1:
                System.out.println("Suma: ");
                break;
            case 2:
                System.out.println("Resta: ");
                break;
            case 3:
                System.out.println("Multiplicacion: ");
                break;
            case 4:
                System.out.println("Division: ");
                break;
            default:
                System.out.println("No existe la operacion");

        }
    }

}
