import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double calificacion;

        do {
            System.out.print("Ingresa una calificación (negativa para terminar): ");
            calificacion = scanner.nextDouble();

            if (calificacion >= 0 && calificacion <= 10) {
                suma += calificacion;
                contador++;
            }
        } while (calificacion >= 0);

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("Las calificaciones que se ingresaron no son válidas.");
        }
        
    }
}

