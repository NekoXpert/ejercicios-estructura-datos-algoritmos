package PC1;
// Felipe Reyes - NekoXpert.dev
public class CrecimientoPoblacion {
    public static void main(String[] args) {
        // Inicializo las poblaciones y tasas de crecimiento de los países A y B
        double poblacionA = 52; // Población inicial de A en millones
        double poblacionB = 85; // Población inicial de B en millones
        double crecimientoA = 1.06; // Tasa de crecimiento de A (6%)
        double crecimientoB = 1.04; // Tasa de crecimiento de B (4%)
        int anios = 0; // Contador de años

        // 2. Proceso: Simulo el crecimiento anual de las poblaciones
        System.out.println("Año\tPoblación A (millones)\tPoblación B (millones)");

        // Muestro las poblaciones iniciales
        System.out.println(
                anios + "\t" + String.format("%.2f", poblacionA) + "\t\t\t" + String.format("%.2f", poblacionB));

        // Simulo el crecimiento hasta que la población de A exceda a la de B
        while (poblacionA <= poblacionB) {
            poblacionA *= crecimientoA; // Crecimiento anual de A
            poblacionB *= crecimientoB; // Crecimiento anual de B
            anios++; // Incremento el año

            // Muestro las poblaciones de cada país cada año
            System.out.println(
                    anios + "\t" + String.format("%.2f", poblacionA) + "\t\t\t" + String.format("%.2f", poblacionB));
        }

        // 3. Salida: Muestra el número de años necesarios para que A exceda a B
        System.out.println("La población de A excederá a la de B en " + anios + " años.");
    }
    
}
