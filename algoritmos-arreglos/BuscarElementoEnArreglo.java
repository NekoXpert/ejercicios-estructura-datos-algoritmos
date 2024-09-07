import java.util.Scanner;

public class BuscarElementoEnArreglo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada: Solicita el tamaño del arreglo y sus elementos
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Solicita el elemento R a buscar
        System.out.print("Ingrese el elemento que desea buscar (R): ");
        int R = scanner.nextInt();

        // 2. Proceso: Busca el elemento R en el arreglo
        int posicion = -1; // Inicializar la posición con -1 (no encontrado)

        for (int i = 0; i < n; i++) {
            if (arreglo[i] == R) {
                posicion = i; // Encontrado, guardar la posición
                break; // Salir del bucle
            }
        }

        // 3. Salida:
        if (posicion != -1) {
            System.out.println("El elemento " + R + " se encuentra en la posición " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("El elemento " + R + " no se encuentra en el arreglo.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
