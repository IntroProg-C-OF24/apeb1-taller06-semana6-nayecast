package taller6;
import java.util.Scanner;
public class ClasificaciondeunTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, resultado;
        System.out.println("Ingrese valor lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese valor lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese valor lado 3");
        lado3 = teclado.nextDouble();
        resultado = lado1 + lado2;
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo Equilatero");
        } else if (lado1 == lado2 && lado2 != lado3) {
            System.out.println("El triángulo es Isóceles");
        } else if (lado1 != lado2 && lado2 != lado3) {
            System.out.println("El triángulo es Escaleno");
        } else if (resultado < lado3) {
            System.out.println("No es un triangulo");

        }

    }
}
