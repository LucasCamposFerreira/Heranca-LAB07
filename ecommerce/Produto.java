package ecommerce;

public class Produto {
    private String nome;
    private String codigoBarras;
    private double preco;

    public Produto(String nome, String codigoBarras, double preco) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Preço: R$ " + preco);
    }
}
