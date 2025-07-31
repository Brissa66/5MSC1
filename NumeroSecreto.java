import java.util.Random;
import java.util.Scanner; 

public class NumeroSecreto {

    public static void main(String[] args) {
       
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; 

        final int intentos_maximos = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Holaa, adivina el número secreto");
        System.out.println("Debes elegir un número entero entre 1 y 100. Tienes " + intentos_maximos + " intentos para adivinarlo,mucha suerte");

       boolean encontrado = false; 

        for (int i = 1; i <= intentos_maximos; i++) { 
            System.out.print("Intento #" + i + ": Introduce tu número: ");
   
            if (scanner.hasNextInt()) {
                int intentoUsuario = scanner.nextInt();

                if (intentoUsuario == numeroSecreto) {
                    System.out.println("Geniaal, has adivinado el número secreto (" + numeroSecreto + ") en " + i + " intentos");
                    encontrado = true; 
                    break;
                } else if (intentoUsuario < numeroSecreto) {
                    System.out.println("Demasiado bajo, intenta un número mayor");
                } else { 
                    System.out.println("Demasiado alto, intenta un número menor");
                }
            } else {
                System.out.println("Número inválido, introduce un número entero");
                scanner.next(); 
                i--;
            }
        }

        if (!encontrado) { 
            System.out.println("\n Lo siento, se acabaron tus intentos");
            System.out.println("El número secreto era: " + numeroSecreto);
            System.out.println("Suerte para la proxima");
        }
        
      }
    }