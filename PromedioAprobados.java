public class PromedioAprobados {
    public static void main(String[] args) {
        int[] calificaciones = {85, 67, 90, 72, 55, 100, 80};
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < calificaciones.length; i++) { 
            if (calificaciones[i] >= 70) {  // error lógico: no incluye 70
                suma +=calificaciones[i];
                contador++;
            }
        }

        double promedio = (double) suma / contador;  
        System.out.println("Promedio de calificaciones aprobadas: " + promedio);
    }
}

