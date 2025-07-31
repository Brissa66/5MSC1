import java.util.Scanner;

public class SumaHasta0 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int suma=0;

        while(true){
            System.out.print("Ingresa un número a sumar, presiona 0 para dejar de sumar: ");
            int num=scanner.nextInt();
            if(num==0) break;
            suma +=num;
        }
        
        System.out.println("La suma de los números que ingresaste es: "+suma);
    }
    
}
