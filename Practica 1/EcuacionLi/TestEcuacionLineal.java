package EcuacionLi;
import java.util.Scanner;

public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        EcuacionLineal ecu = new EcuacionLineal(a, b, c, d, e, f);
        if (ecu.tieneSolucion()) {
            System.out.printf("x = %.1f, y = %.1f%n", ecu.getX(), ecu.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}


