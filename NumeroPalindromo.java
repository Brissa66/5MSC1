//Este programa encuentra todos los palíndromos entre 10 y 999.
public class NumeroPalindromo {

    public static void main(String[] args) {
        System.out.println("Palíndromos numéricos entre 10 y 999:");

        for (int i = 10; i <= 999; i++) {
            if (esPalindromo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPalindromo(int numero) {
        int numeroinicial= numero;
        int numeroinvertido = 0;

        while (numero > 0) {
            int digito = numero % 10; 
            numeroinvertido = numeroinvertido * 10 + digito; 
            numero /= 10; 
        }

        return numeroinicial == numeroinvertido;
    }
}