// Ejercicio #11.	Se conoce el peso actual de una persona (en kilogramos), las
// calorías que quema por día, el peso objetivo y las calorías ingeridas por día
// por esa persona. Calcule el número de días que tardará la persona en alcanzar
// su objetivo. Considere la relación: 3500 calorías = 1 libra.

// Datos Claves:
//Peso Actual (kg)
//Peso Objetivo (kg)
//Calorías Quemadas por Día
//Calorías Ingeridas por Día
//Relación: 3500 calorías = 1 libra = 0.4536 kg

import java.util.Scanner;

public class CalculoDiasPesoObjetivo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada:
        System.out.print("Ingrese su peso actual en kg: ");
        double pesoActual = scanner.nextDouble();

        System.out.print("Ingrese su peso objetivo en kg: ");
        double pesoObjetivo = scanner.nextDouble();

        System.out.print("Ingrese las calorías quemadas por día: ");
        double caloriasQuemadasPorDia = scanner.nextDouble();

        System.out.print("Ingrese las calorías ingeridas por día: ");
        double caloriasIngeridasPorDia = scanner.nextDouble();

        // 2. Proceso:
        // Calcular el déficit o exceso calórico diario
        double deficitCalorico = caloriasQuemadasPorDia - caloriasIngeridasPorDia;

        // Calcular el cambio total en calorías necesario para alcanzar el peso objetivo
        double cambioCalorias = (pesoActual - pesoObjetivo) * (3500 / 0.4536); 
        // 1 libra = 0.4536 kg

        // Inicializar el número de días
        int numeroDias;

        // Condicional para determinar si se puede alcanzar el objetivo
        if (deficitCalorico > 0) {
            // Calcular el número de días necesarios
            numeroDias = (int) Math.ceil(Math.abs(cambioCalorias) / deficitCalorico);  
            System.out.println("El número de días necesarios para alcanzar el peso objetivo es: " + numeroDias + " días.");
        } else if (deficitCalorico == 0) {
            System.out.println("No es posible alcanzar el peso objetivo ya que no hay déficit calórico.");
        } else {
            System.out.println("No es posible alcanzar el peso objetivo con las condiciones actuales ya que hay un exceso calórico.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
