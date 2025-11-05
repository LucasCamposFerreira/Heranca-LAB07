public class Gerente extends Funcionario {
    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + (super.calcularSalarioTotal() * bonificacaoPercentual);
    }
}