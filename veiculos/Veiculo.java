package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoDiaria;

    public Veiculo(String marca, String modelo, int ano, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public double calcularCustoLocacao(int dias) {
        return precoDiaria * dias;
    }
}
