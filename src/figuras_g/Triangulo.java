package figuras_g;

public class Triangulo extends Figuras {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double respuesta = (base * altura) / 2;
        return respuesta;
    }

    @Override
    public double perimetro() {
        double respuesta = 3 * base;
        return respuesta;
    }

}
