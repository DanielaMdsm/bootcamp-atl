package clase5;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese una distancia en millas para calcular su conversion a km");
        Scanner read= new Scanner(System.in);
        double millas= read.nextDouble();
        System.out.println("La distancia en km es "+ (millas*1.60934));
    }
}
