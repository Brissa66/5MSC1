//Haz un programa que lea una calificación del 0 a 100 y diga si el alumno aprueba(60 o más) o reprueba
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingresa tu calificacion (0-100): ");
      int calificacion = scanner.nextInt();

      if(calificacion > 60){
        System.out.println("Felicidades, aprobaste");
      } else {
        System.out.println("Lo sentimos, reprobaste");
      }
      
    }
    
    
}
