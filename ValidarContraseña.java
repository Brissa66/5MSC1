import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contra;

        do {
            System.out.print("Ingresa una contraseña: ");
            contra = scanner.nextLine();
        } while (!(contra.length() >= 8 &&
                   contra.matches(".*[A-Z].*") &&
                   contra.matches(".*[a-z].*") &&
                   contra.matches(".*\\d.*")));

        System.out.println("Es un contraseña valida");
    }
    
}

