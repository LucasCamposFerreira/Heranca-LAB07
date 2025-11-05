package figuras;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        double areaTriangulo = triangulo.calcularArea(5, 10);
        double perimetroTriangulo = triangulo.calcularPerimetro(5, 10, 7);
        System.out.println("Área do Triângulo: " + areaTriangulo);
        System.out.println("Perímetro do Triângulo: " + perimetroTriangulo);

        Circulo circulo = new Circulo();
        double areaCirculo = circulo.calcularArea(7);
        double perimetroCirculo = circulo.calcularPerimetro(7);
        System.out.println("Área do Círculo: " + areaCirculo);
        System.out.println("Perímetro do Círculo: " + perimetroCirculo);

        Retangulo retangulo = new Retangulo();
        double areaRetangulo = retangulo.calcularArea(4, 8);
        double perimetroRetangulo = retangulo.calcularPerimetro(4, 8);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Perímetro do Retângulo: " + perimetroRetangulo);
    }
}