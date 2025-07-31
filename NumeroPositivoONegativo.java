//cree un programa que lea un numero y diga si es positivo, negativo o cero
import java.util.Scanner;

public class NumeroPositivoONegativo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if(numero > 0) {
            System.out.println("El número es positivo");

        } else if(numero < 0){
            System.out.println("El número es negativo");
            
        }else {
    
            System.out.println("El número es cero");
        }
        

    }
}