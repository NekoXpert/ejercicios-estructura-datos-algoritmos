package PC1;
// Felipe Reyes - NekoXpert.dev
public class AnalisisVehiculos {

    public static void main(String[] args) {
        // Datos de entrada proporcionados
        String[] Marca = { "Kia", "Nissan", "Toyota", "Honda", "Xiaomi", "Tesla", "Lexus", "Hyundai", "Subaru",
                "Changan" };
        String[] Categoria = { "Camioneta4X4", "Camioneta4X4", "SUV", "SUV", "Eléctrico", "Eléctrico", "Camioneta4X4",
                "Camioneta4X4", "SUV", "SUV" };
        int[] Stock = { 20, 25, 45, 30, 10, 20, 15, 35, 25, 40 };
        double[] PrecioDolares = { 27000, 35000, 30000, 45000, 28000, 75000, 70000, 36000, 32000, 20000 };

        // a) Llama al método para encontrar el vehículo con menor precio
        informacionMenorPrecio(Marca, Categoria, Stock, PrecioDolares);

        // b) Calcula el precio promedio del almacén
        double precioPromedio = calcularPrecioPromedio(Stock, PrecioDolares);
        System.out.println("El precio promedio del almacén es: " + String.format("%.2f", precioPromedio) + " dólares.");

        // c) Calcula el porcentaje de vehículos con precio mayor al promedio
        double porcentajeMayorAlPromedio = calcularPorcentajeMayorAlPromedio(PrecioDolares, precioPromedio);
        System.out.println("El porcentaje de vehículos con precio mayor al precio promedio es: "
                + String.format("%.2f", porcentajeMayorAlPromedio) + "%.");
    }

    // a) Método para encontrar la información del vehículo con el menor precio
    public static void informacionMenorPrecio(String[] Marca, String[] Categoria, int[] Stock, double[] PrecioDolares) {
        int indiceMenor = 0;
        double menorPrecio = PrecioDolares[0];

        // Busca el índice del vehículo con el menor precio
        for (int i = 1; i < PrecioDolares.length; i++) {
            if (PrecioDolares[i] < menorPrecio) {
                menorPrecio = PrecioDolares[i];
                indiceMenor = i;
            }
        }

        // Muestra la información del vehículo con menor precio
        System.out.println("El vehículo con menor precio es la " + Marca[indiceMenor] + " " + Categoria[indiceMenor] +
                " con " + Stock[indiceMenor] + " unidades y un costo unitario de " + PrecioDolares[indiceMenor]
                + " dólares.");
    }

    // b) Método para calcular el precio promedio del almacén
    public static double calcularPrecioPromedio(int[] Stock, double[] PrecioDolares) {
        double sumaValores = 0;
        int sumaCantidades = 0;

        // Calcula la suma de valores y la suma de las cantidades
        for (int i = 0; i < Stock.length; i++) {
            sumaValores += Stock[i] * PrecioDolares[i];
            sumaCantidades += Stock[i];
        }

        // Calcula y retorna el precio promedio
        return sumaValores / sumaCantidades;
    }

    // c) Método para calcular el porcentaje de vehículos con precio mayor al
    // promedio
    public static double calcularPorcentajeMayorAlPromedio(double[] PrecioDolares, double precioPromedio) {
        int contadorMayores = 0;

        // Cuenta cuántos vehículos tienen un precio mayor al promedio
        for (double precio : PrecioDolares) {
            if (precio > precioPromedio) {
                contadorMayores++;
            }
        }

        // Calcula y retorna el porcentaje
        return (contadorMayores * 100.0) / PrecioDolares.length;
    }
}
