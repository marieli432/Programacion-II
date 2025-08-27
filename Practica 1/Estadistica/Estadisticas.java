package Estadistica;

public class Estadisticas {
    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }
}
