package veiculos;

public class Carro extends Veiculo {
    private String tipoCombustivel;
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double precoDiaria, String tipoCombustivel, int numeroPortas) {
        super(marca, modelo, ano, precoDiaria);
        this.tipoCombustivel = tipoCombustivel;
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
}
