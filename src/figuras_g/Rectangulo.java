package figuras_g;

public class Rectangulo extends Figuras {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double respuesta = base * altura;
        return respuesta;
    }

    @Override
    public double perimetro() {
        double respuesta = (base * 2) + (altura * 2);
        return respuesta;
    }

}
