import java.util.Scanner;

public class RegistrarVentasDiarias {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada: Solicita las ventas diarias durante una semana
        double[] ventas = new double[7];
        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

        System.out.println("Ingrese las ventas diarias de la semana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Ventas del " + diasSemana[i] + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // 2. Proceso: Encontrar el día de mayor venta
        double mayorVenta = ventas[0]; // Inicializar con la primera venta
        int diaMayorVenta = 0; // Inicializar con el primer día

        for (int i = 1; i < 7; i++) {
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i]; // Actualizar mayor venta
                diaMayorVenta = i; // Actualizar día de mayor venta
            }
        }

        // 3. Salida: Mostrar el día con la mayor venta
        System.out.println("El día de la semana con la mayor venta fue " + diasSemana[diaMayorVenta]
                + " con un monto de " + mayorVenta);

        // Cerrar el scanner
        scanner.close();
    }
}
