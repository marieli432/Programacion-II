package Estadistica;

import java.util.Scanner;

public class TestEstadisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Estadisticas stats = new Estadisticas(numeros);
        System.out.printf("El promedio es %.2f%n", stats.promedio());
        System.out.printf("La desviación estándar es %.5f%n", stats.desviacion());
    }
}
