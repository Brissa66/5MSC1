import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número positivo: ");
        int num=scanner.nextInt();
        int contador=0;

        while(num>0){
            num=num/10;
            contador++;
        }
         
         System.out.println("El número tiene "+contador+ " digitos");
    }
    
}
