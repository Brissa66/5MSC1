//Haz un programa que lea la edad de una persona y diga si puede entrar a una fiesta(mayores de 18), con permiso(16 o 17) o no puede entrar(menores de 16)
import java.util.Scanner;

public class EdadYAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if(edad > 18){
            System.out.println("Puedes ingresar a la fiesta");
        } else if (edad > 16 && edad < 18 ){
            System.out.println("Puedes ingresar a la fiesta con permiso");
        } else {
            System.out.println("No puedes ingresar a la fiesta");
        }
        
    }
    
}
