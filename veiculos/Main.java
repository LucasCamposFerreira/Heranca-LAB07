package veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 150.0, "Gasolina", 4);
        Moto moto = new Moto("Honda", "CB500", 2019, 100.0, 500, "Elétrica");

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Preço Diária: " + carro.getPrecoDiaria());
        System.out.println("Tipo Combustível: " + carro.getTipoCombustivel());
        System.out.println("Número Portas: " + carro.getNumeroPortas());
        System.out.println("Custo Locação (3 dias): " + carro.calcularCustoLocacao(3));

        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Preço Diária: " + moto.getPrecoDiaria());
        System.out.println("Cilindrada: " + moto.getCilindrada());
        System.out.println("Tipo Partida: " + moto.getTipoPartida());
        System.out.println("Custo Locação (3 dias): " + moto.calcularCustoLocacao(3));
    }
}
