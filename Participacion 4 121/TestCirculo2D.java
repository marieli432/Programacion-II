public class TestCirculo2D {
    public static void main(String[] args) {
        Circulo2D c1 = new Circulo2D(2, 0, 1);
        
        System.out.println("Área de c1: " + c1.getArea());
        System.out.println("Perímetro de c1: " + c1.getPerimetro());
        System.out.println();
        
        System.out.println("c1.contiene(2.5, 0): " + c1.contiene(2.5, 0));
        
        Circulo2D circuloPequeño = new Circulo2D(2, 0, 0.5);
        System.out.println("c1.contiene(Circulo2D(2, 0, 0.5)): " + c1.contiene(circuloPequeño));
        
        
        Circulo2D circuloGrande = new Circulo2D(0, 0, 2);
        System.out.println("c1.sobrepone(Circulo2D(0, 0, 2)): " + c1.sobrepone(circuloGrande));
    }
}