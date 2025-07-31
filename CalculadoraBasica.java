import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
       do {
        System.out.println("--CALCULADORA BASICA--");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
        opcion = scanner.nextInt();
        double num1=0,num2=0;
        if(opcion>=1 && opcion<=4){
        System.out.print("Ingresa un número:");
        num1=scanner.nextDouble();
        System.out.print("Ingresa un número:");
        num2=scanner.nextDouble();
        }
        switch (opcion){
        case 1:
        double suma= num1+num2;
        System.out.println("La suma de los numeros es: "+ suma);
        break;
        case 2:
        double resta= num1-num2;
        System.out.println("La resta de los numeros es: "+ resta);
        break;
        case 3:
        double multiplicacion= num1*num2;
        System.out.println("La multiplicacion de los numeros es: "+ multiplicacion);
        break;
        case 4:
        double division= num1/num2;
        System.out.println("La division de los numeros es: "+ division);
        break;
        case 5:
        System.out.println("Esta saliendo del programa");
        break;
        default:
        System.out.println("Opcion invalida");
            }
        }  
        while (opcion!=5);
          
        }
       
    }