package CronometroEj;   

import java.util.Random;

public class TestCronometro {

    public static void main(String[] args) {

        int tamaño = 100000;
        int[] numeros = new int[tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = random.nextInt(1000000);
        }

        Cronometro cronometro = new Cronometro();

        cronometro.inicia(); 

        ordenacionPorSeleccion(numeros);

        cronometro.detener(); 

        System.out.println("Tiempo de ejecución: " 
                + cronometro.lapsoDeTiempo() + " ms");
    }

    public static void ordenacionPorSeleccion(int[] arreglo) {

        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
