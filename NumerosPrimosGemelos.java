public class NumerosPrimosGemelos {

    public static void main(String[] args) {
        int limite = 100; // limite hasta donde buscar números primos gemelos
        // itera desde 2 hasta el limite
        for (int i = 2; i < limite; i++) {
            // verifica si i y i+2 son primos
            if (esPrimo(i) && esPrimo(i + 2)) {
                // si ambos son primos, imprime el par como números primos gemelos
                System.out.println("(" + i + ", " + (i + 2) + ") son primos gemelos");
            }
        }
    }
    // verifica si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false; // los números menores a 2 no son primos
        // recorre divisores desde 2 hasta la raíz cuadrada de n
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // si tiene un divisor, no es primo
        }
        return true; // si no se encontró ningún divisor, el número es primo
    }
}

