package figuras_g;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int command = Integer.parseInt(JOptionPane.showInputDialog(null, "Calcular Área y Perímetro en Figuras Geométricas"));
        switch (command) {
            case 1://Para el caso de un Rectángulo
                JOptionPane.showMessageDialog(null, "Para el Rectángulo");
                double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));
                Rectangulo rectangulo = new Rectangulo(base, altura);
                JOptionPane.showMessageDialog(null, "Rectangulo:\n Area: " + rectangulo.area() + "\nPerimetro: "
                        + rectangulo.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                break;

            case 2:// Para el caso de un Círculo
                JOptionPane.showMessageDialog(null, "Para el Círculo");
                double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo"));
                Circulo radioC = new Circulo(radio);
                JOptionPane.showMessageDialog(null, "Circulo:\n Area: " + radioC.area() + "\nPerimetro: "
                        + radioC.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                break;

            case 3://Para el caso de un Triángulo
                JOptionPane.showMessageDialog(null, "Para el Triángulo");
                double baseT = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base"));
                double alturaT = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura"));
                Triangulo triangulo = new Triangulo(baseT, alturaT);
                JOptionPane.showMessageDialog(null, "Triangulo:\n Area: " + triangulo.area() + "\nPerimetro: "
                        + triangulo.perimetro(), "Figuras Geometricas", JOptionPane.QUESTION_MESSAGE);
                break;

            case 4:
                System.exit(0);
                break;
        }
    }
}
