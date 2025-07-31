//Genera una pirámide de números del 1 al N en cada línea
import java.util.Scanner;

public class PiramideNumerica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de lineas de la piramide:");
        int lineas = scanner.nextInt();

        for (int i=1; i<=lineas;i++){
            for(int b=1;b<=i;b++){
                for(int n=b ;n<=b;n++){
                   System.out.print(n + " ");
                } 
                
            }
           
        System.out.println();
        } 
        
        
    }
    
}
