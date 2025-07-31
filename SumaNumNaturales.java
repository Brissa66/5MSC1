//Pida al usuario un número N y suma todos los números del 1 hasta N
import java.util.Scanner;

public class SumaNumNaturales {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresa un número Natural: ");
        int num = scanner.nextInt();
        int suma=0;

        for(int i=1;i <=num ;i++){
            suma+= i;
             
        }
        System.out.println(suma);
       
    }
    
}
