package clase10;


import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args) {

        Persona persona= new Persona();
        persona.setNombre("Daniela");
        persona.setFechaNacimiento(LocalDate.of(1995,06,13));
        persona.setEdad(28);
        persona.setDNI(39017937);
        persona.mostrarDatos();
        if(persona.esMayorDeEdad()){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }

    }
}
