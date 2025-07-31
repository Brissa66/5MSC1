//Pide al usuario un número limite y cuenta del 1 a ese limite cuantos pares e impares
import java.util.Scanner;

public class ContarParImpar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresa un número limite: ");
        int limite =scanner.nextInt();
        int pares=0;
        int impares=0;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        
    }
}