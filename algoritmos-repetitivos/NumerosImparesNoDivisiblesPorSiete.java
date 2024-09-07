
// Ejercicio #13. Muestre los enteros positivos impares que se encuentran entre dos números sin incluir los enteros divisibles  por 7.

import java.util.Scanner;

public class NumerosImparesNoDivisiblesPorSiete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Entrada:
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Asegurarse de que numero1 sea menor que numero2
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // 2. Proceso:
        // Iterar a través del rango de números
        System.out.println("Los números impares positivos entre " + numero1 + " y " + numero2
                + " que no son divisibles por 7 son:");
        for (int i = numero1 + 1; i < numero2; i++) { // Excluye los números de los extremos
            if (i % 2 != 0 && i % 7 != 0) { // Verificar si es impar y no divisible por 7
                System.out.println(i); // 3. Salida: Imprimir el número que cumple las condiciones
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
