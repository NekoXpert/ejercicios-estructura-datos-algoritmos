package PC1;
// Felipe Reyes - NekoXpert.dev
import java.util.Scanner;

public class CalculoSueldosEnfermeras {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada: Solicita el número total de enfermeras
        System.out.print("Ingrese el número total de enfermeras: ");
        int N = scanner.nextInt();

        // Inicializa arreglos para almacenar nombres y sueldos
        String[] nombres = new String[N];
        double[] sueldos = new double[N];
        double sueldoPorHora = 100.0; // Sueldo por hora es de 100 soles

        // Inicializa variables para encontrar el mayor y menor sueldo
        double mayorSueldo = 0;
        String nombreMayorSueldo = "";
        double menorSueldo = Double.MAX_VALUE;
        String nombreMenorSueldo = "";
        double sumaTotal = 0;

        // 2. Proceso: Calcula el sueldo de cada enfermera
        for (int i = 0; i < N; i++) {
            // Solicita el nombre de la enfermera
            System.out.print("Ingrese el nombre de la enfermera " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            // Solicita las horas trabajadas de la enfermera
            System.out.print("Ingrese las horas trabajadas de " + nombres[i] + ": ");
            double horasTrabajadas = scanner.nextDouble();

            // Calcula el sueldo de la enfermera
            sueldos[i] = horasTrabajadas * sueldoPorHora;
            sumaTotal += sueldos[i];

            // Determina el mayor y menor sueldo
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayorSueldo = nombres[i];
            }
            if (sueldos[i] < menorSueldo) {
                menorSueldo = sueldos[i];
                nombreMenorSueldo = nombres[i];
            }
        }

        // Calcula el promedio de los sueldos
        double promedioSueldos = sumaTotal / N;

        // 3. Salida: Muestra los resultados redondeados a dos decimales
        System.out.println("La enfermera con el mayor sueldo es " + nombreMayorSueldo + " con un sueldo de "
                + String.format("%.2f", mayorSueldo) + " soles.");
        System.out.println("La enfermera con el menor sueldo es " + nombreMenorSueldo + " con un sueldo de "
                + String.format("%.2f", menorSueldo) + " soles.");
        System.out.println("El promedio de los sueldos de todas las enfermeras es: "
                + String.format("%.2f", promedioSueldos) + " soles.");

        // Cierra el scanner
        scanner.close();
    }
}
