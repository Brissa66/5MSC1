import java.util.Scanner;

public class SerieDeCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        // Validación de entrada
        while (n <= 0) {
            System.out.print("Ingresa un número positivo: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("El número debe ser mayor que cero.");
                }
            } else {
                System.out.println("Entrada inválida. Ingresa un número entero positivo.");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Genera la secuencia de Collatz
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
        
    }
}

