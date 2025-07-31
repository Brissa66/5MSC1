//Pida al usuario un número y muestre su tabalde multiplicar del 1-10
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num= scanner.nextInt();

        for (int i=1;i <= 10;i++){
            int resultado = num*i;
             System.out.println(num + "x"+i+"="+resultado);
        }
     
    }
    
}
