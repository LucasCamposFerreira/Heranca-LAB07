package ecommerce;

public class Eletronico extends Produto {
    private String marca;
    private int voltagem;

    public Eletronico(String nome, String codigoBarras, double preco, String marca, int voltagem) {
        super(nome, codigoBarras, preco);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem + "V");
    }
    
}
