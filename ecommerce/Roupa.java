package ecommerce;

public class Roupa extends Produto {
    private String tamanho;
    private String material;

    public Roupa(String nome, String codigoBarras, double preco, String tamanho, String material) {
        super(nome, codigoBarras, preco);
        this.tamanho = tamanho;
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}
