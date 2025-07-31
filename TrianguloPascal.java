import java.util.Scanner; 
public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa el número de filas: ");
        int filas = scanner.nextInt(); 

        // recorre cada fila del triángulo
        for (int i = 0; i < filas; i++) {
            int valor = 1; // el primer valor de cada fila siempre es 1

            // imprime los elementos de la fila actual
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                // calcula el siguiente número de la fila 
                valor = valor * (i - j) / (j + 1);
            }

            System.out.println();
        }

     
    }
}

