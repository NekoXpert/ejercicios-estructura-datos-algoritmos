// Ejercicio #21.	Calcule la cantidad adeudada por un cliente de una compañía, considerando que la deuda actual es 15% más que la anterior. Tiene como dato la deuda anterior.

//Datos Claves:
//Deuda Anterior: Dato que se ingresa.
//Incremento: La deuda actual es 15% más que la deuda anterior.
import java.util.Scanner;

public class CalculoDeuda {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada:
        System.out.print("Ingrese la deuda anterior: ");
        double deudaAnterior = scanner.nextDouble();

        // 2. Proceso:
        // Calcular la deuda actual con un incremento del 15%
        double deudaActual = deudaAnterior * 1.15;

        // 3. Salida:
        System.out.println("La cantidad adeudada actual es: " + deudaActual);

        // Cerrar el scanner
        scanner.close();
    }
}