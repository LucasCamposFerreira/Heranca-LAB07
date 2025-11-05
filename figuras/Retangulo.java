package figuras;

public class Retangulo extends FiguraGeometrica {
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }
}