package PC1;
// Felipe Reyes - NekoXpert.dev
import java.util.Scanner;

public class DistribucionRollosAlambre {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int longitudRequerida = 0;

        // 1. Entrada: Solicita la longitud total de alambre requerida en metros y
        // valida que sea mayor o igual a 75 metros
        do {
            System.out.print("Ingrese la longitud total de alambre requerida en metros (mínimo 75 metros): ");
            longitudRequerida = scanner.nextInt();
            if (longitudRequerida < 75) {
                System.out.println("La longitud mínima permitida es 75 metros. Por favor, ingrese un valor válido.");
            }
        } while (longitudRequerida < 75); // Valida la entrada

        // 2. Proceso:
        // Calcula el número de rollos de 500 metros necesarios
        int rollos500 = longitudRequerida / 500;
        int sobrante = longitudRequerida % 500; // Actualiza el sobrante

        // Calcula el número de rollos de 300 metros necesarios
        int rollos300 = sobrante / 300;
        sobrante = sobrante % 300; // Actualiza el sobrante

        // Calcula el número de rollos de 75 metros necesarios
        int rollos75 = sobrante / 75;
        sobrante = sobrante % 75; // Actualiza el sobrante

        // 3. Salida:
        System.out.println("Número de rollos de 500 metros necesarios: " + rollos500);
        System.out.println("Número de rollos de 300 metros necesarios: " + rollos300);
        System.out.println("Número de rollos de 75 metros necesarios: " + rollos75);
        System.out.println("Metros de alambre sobrantes: " + sobrante);

        // Cierra el scanner
        scanner.close();
    }
}
