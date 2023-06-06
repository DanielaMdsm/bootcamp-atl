package clase5;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precioOriginal = read.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = read.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final es: " + precioFinal);
    }
}
