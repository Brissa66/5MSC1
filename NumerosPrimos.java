//Muestra los números primos entre 1-100
public class NumerosPrimos {
    public static void main(String[] args) {
           System.out.println("Números primos del 1 al 100:");

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}

    
