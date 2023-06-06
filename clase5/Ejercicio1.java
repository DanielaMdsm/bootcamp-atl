package clase5;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
         System.out.println("Ingrese la edad de su perro para determinar los años humanos");
         Scanner read=  new Scanner(System.in);
         int edadPerro= read.nextInt();
         System.out.println("La edad humana de su perro es "+ (edadPerro*7));
    }
}
