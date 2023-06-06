package clase5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int numeroAleatorio= (int) (Math.random()*100);
        System.out.println("Adivina el numero!! Ingresa a continuacion un numero entre 0 y 100");
        int numeroUsuario= read.nextInt();
        if(numeroUsuario==numeroAleatorio){
            System.out.println("Correcto! Adivinaste el numero");
        }else{
            System.out.println("Incorrecto! No adivinaste el numero");
        }
    }
}
