import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer lo que escribe el usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = -1; // Aquí guardamos la opción que elige el usuario

        // El menú se repite hasta que el usuario elija salir (opción 0)
        do {
            // Mostramos el menú con todas las opciones y algunos dibujitos bonitos
            System.out.println("\n************************************************************");
            System.out.println("*                   MENÚ PRINCIPAL                         *");
            System.out.println("************************************************************");
            System.out.println("*  1.  Adivinar número                                     *");
            System.out.println("*  2.  Calculadora básica                                  *");
            System.out.println("*  3.  Calificación                                        *");
            System.out.println("*  4.  Clasificador de números                             *");
            System.out.println("*  5.  Contador de números                                 *");
            System.out.println("*  6.  Contar dígitos                                      *");
            System.out.println("*  7.  Contar pares e impares                              *");
            System.out.println("*  8.  Control de acceso                                   *");
            System.out.println("*  9.  Conversor de temperaturas                           *");
            System.out.println("* 10.  Edad y acceso                                       *");
            System.out.println("* 11.  Números pares o impares                             *");
            System.out.println("* 12.  Número positivo o negativo                          *");
            System.out.println("* 13.  Números del 1 al 10                                 *");
            System.out.println("* 14.  Números perfectos                                   *");
            System.out.println("* 15.  Número secreto                                      *");
            System.out.println("* 16.  Números primos                                      *");
            System.out.println("* 17.  Números primos gemelos                              *");
            System.out.println("* 18.  Número palíndromo                                   *");
            System.out.println("* 19.  Pirámide numérica                                   *");
            System.out.println("* 20.  Promedio de aprobados                               *");
            System.out.println("* 21.  Promedio de calificaciones                          *");
            System.out.println("* 22.  Serie de Collatz                                    *");
            System.out.println("* 23.  Suma del 100 al 110                                 *");
            System.out.println("* 24.  Suma hasta ingresar 0                               *");
            System.out.println("* 25.  Suma de números naturales                           *");
            System.out.println("* 26.  Tabla de multiplicar                                *");
            System.out.println("* 27.  Triángulo de asteriscos                             *");
            System.out.println("* 28.  Triángulo de Pascal                                 *");
            System.out.println("* 29.  Validar contraseña                                  *");
            System.out.println("* 30.  Verificar edad                                      *");
            System.out.println("*  0.  Salir                                               *");
            System.out.println("************************************************************");
            // Aquí puse unos gráficos para que se vea más bonito :)
            System.out.println("░░░░░░░░░░░███████░░░░░░░░░░░");
            System.out.println("░░░░░░░████░░░░░░░████░░░░░░░");
            System.out.println("░░░░░██░░░░░░░░░░░░░░░██░░░░░");
            System.out.println("░░░██░░░░░░░░░░░░░░░░░░░██░░░");
            System.out.println("░░█░░░░░░░░░░░░░░░░░░░░░░░█░░");
            System.out.println("░█░░████░░░░░░░░██████░░░░░█░");
            System.out.println("█░░█░░░██░░░░░░█░░░░███░░░░░█");
            System.out.println("█░█░░░░░░█░░░░░█░░░░░░░█░░░░█");
            System.out.println("█░█████████░░░░█████████░░░░█");
            System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
            System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
            System.out.println("█░░░████████████████████░░░░█");
            System.out.println("░█░░░█▓▓▓▓▓▓▓▓█████▓▓▓█░░░░█░");
            System.out.println("░█░░░░█▓▓▓▓▓██░░░░██▓██░░░░█░");
            System.out.println("░░█░░░░██▓▓█░░░░░░░▒██░░░░█░░");
            System.out.println("░░░██░░░░██░░░░░░▒██░░░░██░░░");
            System.out.println("░░░░░██░░░░███████░░░░██░░░░░");
            System.out.println("░░░░░░░███░░░░░░░░░███░░░░░░░");
            System.out.println("░░░░░░░░░░█████████░░░░░░░░░░\n");

            // Pedimos al usuario que elija una opción
            System.out.print("Seleccione una opción: ");

            String entrada = scanner.nextLine().trim();
            try {
                // Convertimos la opción a número
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                // Si el usuario escribe algo que no es número, ponemos -1
                opcion = -1;
            }

            // Dependiendo de la opción, ejecutamos el programa correspondiente
            switch (opcion) {
                case 1: AdivinarNum.main(null); break;
                case 2: CalculadoraBasica.main(null); break;
                case 3: Calificacion.main(null); break;
                case 4: ClasificadorDeNumeros.main(null); break;
                case 5: ContadorNumeros.main(null); break;
                case 6: ContarDigitos.main(null); break;
                case 7: ContarParImpar.main(null); break;
                case 8: ControlDeAcceso.main(null); break;
                case 9: ConversorDeTemperaturas.main(null); break;
                case 10: EdadYAcceso.main(null); break;
                case 11: ParOImpar.main(null); break;
                case 12: NumeroPositivoONegativo.main(null); break;
                case 13: NumerosDel1Al10.main(null); break;
                case 14: NumerosPerfectos.main(null); break;
                case 15: NumeroSecreto.main(null); break;
                case 16: NumerosPrimos.main(null); break;
                case 17: NumerosPrimosGemelos.main(null); break;
                case 18: NumeroPalindromo.main(null); break;
                case 19: PiramideNumerica.main(null); break;
                case 20: PromedioAprobados.main(null); break;
                case 21: PromedioCalificaciones.main(null); break;
                case 22: SerieDeCollatz.main(null); break;
                case 23: Suma100_110.main(null); break;
                case 24: SumaHasta0.main(null); break;
                case 25: SumaNumNaturales.main(null); break;
                case 26: TablaDeMultiplicar.main(null); break;
                case 27: TrianguloAsteriscos.main(null); break;
                case 28: TrianguloPascal.main(null); break;
                case 29: ValidarContraseña.main(null); break;
                case 30: VerificarEdad.main(null); break;
                case 0:
                    // Si elige 0, se despide
                    System.out.println("\n* Saliendo del programa. ¡Hasta luego! *\n");
                    break;
                default:
                    // Si elige una opción que no existe, le avisa
                    System.out.println("\n* Opción inválida. Intente de nuevo. *\n");
            }
        } while (opcion != 0);

        // Cerramos el scanner al final
