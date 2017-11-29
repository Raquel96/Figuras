package figuras_g;

public class Circulo extends Figuras {

    public final double pi = 3.1416;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double respuesta = (2 * pi) * radio;
        return respuesta;
    }

    @Override
    public double perimetro() {
        double respuesta = pi * Math.pow(radio, 2);
        return respuesta;
    }

}
