package clase5;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta= read.nextDouble();
        System.out.print("Ingrese el porcentaje de propina : ");
        double porcentajePropina= read.nextDouble();
        double montoPropina= totalCuenta * (porcentajePropina / 100);
        System.out.println("El monto de propina que tiene que abonar es: "+montoPropina);
    }
}
