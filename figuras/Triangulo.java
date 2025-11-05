package figuras;

public class Triangulo extends FiguraGeometrica {
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }
}