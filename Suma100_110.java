//Para cada número del 100 al 110, muestra la suma de sus dígitos.
public class Suma100_110 {
    
    public static void main(String[] args) {
        System.out.println("Suma de los dígitos para números del 100 al 110:");

        for (int numero = 100; numero <= 110; numero++) {
            int sumadedigitos = calcularsumadedigitos(numero);
            System.out.println("La suma de los dígitos del número " + numero + " es :" + sumadedigitos);
        }
    }

    public static int calcularsumadedigitos(int num) {
        int suma = 0;
        int tempNum = num; 

        while (tempNum > 0) { 
            int digito = tempNum % 10; 
            suma += digito;          
            tempNum /= 10;            
        }
        return suma;
    }  
}