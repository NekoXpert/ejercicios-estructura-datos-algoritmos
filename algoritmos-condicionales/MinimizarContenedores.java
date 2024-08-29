// Ejercicio #12.	Un barril contendrá 11 monos, una jaula contendrá 7 monos y un coco contendrá un mono. Describa un algoritmo para solicitar una cantidad de monos con el fin de minimizar el número de contenedores usados.

// Datos Claves:
//Barril: 11 monos.
//Jaula: 7 monos.
//Coco: 1 mono.

import java.util.Scanner;

public class MinimizarContenedores {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada:
        System.out.print("Ingrese la cantidad de monos: ");
        int monos = scanner.nextInt();

        // Inicializar los contadores de contenedores
        int numeroBarriles = 0;
        int numeroJaulas = 0;
        int numeroCocos = 0;

        // 2. Proceso:
        // Usar barriles si hay al menos 11 monos
        if (monos >= 11) {
            numeroBarriles = monos / 11; 
            monos = monos % 11; 
        } else {
            numeroBarriles = 0; 
        }

        // Usar jaulas si hay al menos 7 monos restantes
        if (monos >= 7) {
            numeroJaulas = monos / 7; 
            monos = monos % 7; 
        } else {
            numeroJaulas = 0; 
        }

        // Usar cocos si quedan monos restantes
        if (monos > 0) {
            numeroCocos = monos; 
        } else {
            numeroCocos = 0; 
        }

        // 3. Salida:
        System.out.println("Número de barriles necesarios: " + numeroBarriles);
        System.out.println("Número de jaulas necesarias: " + numeroJaulas);
        System.out.println("Número de cocos necesarios: " + numeroCocos);

        // Cerrar el scanner
        scanner.close();
    }
}
