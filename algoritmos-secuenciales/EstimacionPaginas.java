// Ejercicio #19.	Estimar el número de páginas de un texto que puede almacenarse en la memoria de un computador, considerando un promedio de 300 palabras por página y 10 caracteres por palabra. Asumir que un carácter ocupa un byte. El tamaño de la memoria del computador debe ingresarse expresado en Kbytes.

// Datos Claves:
//1 palabra = 10 caracteres.
//1 carácter = 1 byte.
//1 página = 300 palabras.
//1 Kbyte = 1024 bytes.

import java.util.Scanner;

public class EstimacionPaginas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // 1. Entrada:
        System.out.print(
                "Ingrese el tamaño de la memoria del computador en Kbytes: ");
        double memoryKbytes = scanner.nextInt();


        // 2. Proceso:
        double memoryBytes = memoryKbytes * 1024; // Convertir Kbytes a bytes
        double bytesPorPagina = 300 * 10; // 300 palabras, 10 caracteres por palabra //
        // bytesPorPagina esta expresado en bytes
        double PagesNumber = memoryBytes / bytesPorPagina; // Número de páginas de texto que se puede almacenar
        // para dos decimales
        PagesNumber = Math.round(PagesNumber * 100.0) / 100.0;


        // 3. Salida:
        System.out.println("El número de páginas de texto que se puede almacenar es: " + PagesNumber + " Páginas");
        // Cerrar el scanner
        scanner.close();
    }
}
