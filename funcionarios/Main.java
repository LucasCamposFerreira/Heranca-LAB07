public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Ana Silva", "123.456.789-00", 5000.0, "Java", 1500.0);
        Gerente ger = new Gerente("Carlos Souza", "987.654.321-00", 8000.0, "TI", 0.10);
        System.out.println("Salário total de " + dev.getNome() + ": " + dev.calcularSalarioTotal());
        System.out.println("Salário total de " + ger.getNome() + ": " + ger.calcularSalarioTotal());
    }
}