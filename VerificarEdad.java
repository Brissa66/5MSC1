import java.util.Scanner;

public class VerificarEdad {

    public static void main(String[] args) {
        // crear un objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // pedir al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: "); // Se eliminó 'a:'
        float edad = scanner.nextFloat();

        // estructura if: si la condicion entre parentesis es verdadero,se ejecuta el bloque de codigo
        if (edad >= 18) {
            // este bloque se ejecuta si la edad es mayor o igual a 18
            System.out.println("Eres mayor de edad."); // Se eliminó 'b:'
        } else {
            // este bloque se ejecuta si la condicion del if no se cumple
            System.out.println("Eres menor de edad."); // Se eliminó 'c:' y se añadió ';'
        } 
   
    }
}