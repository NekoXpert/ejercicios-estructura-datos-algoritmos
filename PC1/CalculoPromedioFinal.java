package PC1;
// Felipe Reyes - NekoXpert.dev
import java.util.Scanner;

public class CalculoPromedioFinal {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada: Solicita las 4 notas del alumno
        System.out.print("Ingrese la Nota 1 (10%): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la Nota 2 (20%): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la Nota 3 (30%): ");
        double nota3 = scanner.nextDouble();

        System.out.print("Ingrese la Nota 4 (40%): ");
        double nota4 = scanner.nextDouble();

        // 2. Proceso: Calcula el promedio final (PF)
        double promedioFinal = (0.10 * nota1) + (0.20 * nota2) + (0.30 * nota3) + (0.40 * nota4);

        // Determina si el alumno está aprobado o desaprobado
        String estado = (promedioFinal >= 12.5) ? "aprobado" : "desaprobado";

        // 3. Salida: Muestra el promedio final y el estado del alumno
        System.out.println("El promedio final del alumno es: " + promedioFinal);
        System.out.println("El alumno está " + estado + ".");

        // Cierra el scanner
        scanner.close();
    }
}
