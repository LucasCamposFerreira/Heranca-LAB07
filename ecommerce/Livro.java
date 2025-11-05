package ecommerce;

public class Livro extends Produto {
    private String autor;
    private String isbn;

    public Livro(String nome, String codigoBarras, double preco, String autor, String isbn) {
        super(nome, codigoBarras, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
    }
    
}
