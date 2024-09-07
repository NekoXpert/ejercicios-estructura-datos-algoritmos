// Ejercicio #12.	Suponga que actualmente las poblaciones de los países A y B son 52 y 85 millones de habitantes respectivamente. 
//Supongamos que las tasas de crecimiento de población son 6% y 4% respectivamente. 
//Datos Claves:
//Población inicial del país A: 52 millones.
//Población inicial del país B: 85 millones.
//Tasa de crecimiento anual de A: 6%.
//Tasa de crecimiento anual de B: 4%.

public class CrecimientoPoblacion {
    public static void main(String[] args) {
        // 1. Entrada:
        double poblacionA = 52; // Población inicial de A en millones
        double poblacionB = 85; // Población inicial de B en millones
        double crecimientoA = 1.06; // Tasa de crecimiento de A (6%)
        double crecimientoB = 1.04; // Tasa de crecimiento de B (4%)
        int anios = 0; // Contador de años

        // 2. Proceso:

        while (poblacionA <= poblacionB) {
            poblacionA *= crecimientoA; // Crecimiento anual de A
            poblacionB *= crecimientoB; // Crecimiento anual de B
            anios++; // Incrementar el año
        }

        // 3. Salida:
        System.out.println("Segun los datos brindados La población de A excederá a la de B en " + anios + " años.");
    }
}