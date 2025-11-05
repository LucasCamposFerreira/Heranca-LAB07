package ecommerce;

public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico("Smartphone", "987654321", 299.99, "Marca X", 220);
        eletronico.exibirDetalhes();

        Livro livro = new Livro("O Senhor dos Anéis", "456789123", 39.99, "J.R.R. Tolkien", "978-3-16-148410-0");
        livro.exibirDetalhes();

        Roupa roupa = new Roupa("Camiseta", "321654987", 29.99, "M", "Algodão");
        roupa.exibirDetalhes();
    }
}
