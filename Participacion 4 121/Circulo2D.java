public class Circulo2D {
    private double x;
    private double y;
    private double radio;
    
    public Circulo2D() {
        this(0, 0, 1);
    }
    
    public Circulo2D(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double getArea() {
        return Math.PI * radio * radio;
    }
    
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    public boolean contiene(double x, double y) {
        double distancia = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distancia <= radio;
    }
    
    public boolean contiene(Circulo2D circulo) {
        double distanciaCentros = Math.sqrt(Math.pow(circulo.getX() - this.x, 2) + 
                                          Math.pow(circulo.getY() - this.y, 2));
        return distanciaCentros + circulo.getRadio() <= this.radio;
    }
    
    public boolean sobrepone(Circulo2D circulo) {
        double distanciaCentros = Math.sqrt(Math.pow(circulo.getX() - this.x, 2) + 
                                          Math.pow(circulo.getY() - this.y, 2));
        double sumaRadios = this.radio + circulo.getRadio();
        double diferenciaRadios = Math.abs(this.radio - circulo.getRadio());
        
        return distanciaCentros > diferenciaRadios && distanciaCentros < sumaRadios;
    }
}