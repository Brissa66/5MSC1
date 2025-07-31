import java.util.Scanner;

public class ConversorDeTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do { 
            System.out.print("Elige una opción: ");
            System.out.println("0. Salir");
            System.out.println("\n1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Celsius: ");
                double c = scanner.nextDouble();
                System.out.println("Fahrenheit: " + (c * 9/5 + 32));
            } else if (opcion == 2) {
                System.out.print("Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.println("Celsius: " + ((f - 32) * 5/9));
            }
        } while (opcion != 0);
        
    }
}
