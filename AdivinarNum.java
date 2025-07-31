import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsecret = 12;
        int intento;

        System.out.print("Adivina el número secreto entre 1 y 20, ingresa un número: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                scanner.next();
            }
            intento = scanner.nextInt();
            if (intento == numsecret) {
                System.out.println("¡Has adivinado el número secreto!");
                break;
            } else {
                System.out.print("Inténtalo de nuevo: ");
            }
        }
        
    }
}
