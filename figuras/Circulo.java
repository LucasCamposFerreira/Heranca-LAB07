package figuras;

public class Circulo extends FiguraGeometrica {
    public double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }

}
