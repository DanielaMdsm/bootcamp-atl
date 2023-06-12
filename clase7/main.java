package clase7;
import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int [] numeros= new int[5];
        int sumatoria=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i+1));
            numeros[i] = read.nextInt();
        }
        System.out.println("Los numeros ingresados son ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println( numeros[i] + " ");
        }
        int menor= numeros[0];
        int mayor= numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor numero es " + mayor);
        System.out.println("El menor numero es " + menor);
        for (int i = 0; i < numeros.length;i++){
            sumatoria+=numeros[i];
        }
        float promedio= (float) sumatoria/numeros.length;
        System.out.println("El promedio es "+ promedio);
    }
}
