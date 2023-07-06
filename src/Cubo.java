public class Cubo extends Cuadrado {
    @Override
    public double calcularPerimetro() {
        double perimetro = l * 12;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = 6 * Math.pow(l, 2);
        return area;
    }

    public double calcularVolumen() {
        double volumen = Math.pow(l, 3);
        return volumen;
    }
}
