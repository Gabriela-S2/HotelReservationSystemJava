package lista04.exercicio03;

public class QuartoSimples extends Quarto {
    public QuartoSimples(int numero, int capacidade, double valorBase) {
        super(numero, capacidade, valorBase);
    }

    @Override
    public void dadosHotel() {
        System.out.println("Quarto Simples");
        System.out.println("Numero: " + getNumero());
        System.out.println("Capacidade: " + getCapacidade() + " pessoas");
        System.out.println("Valor da diária: " + calcularDiaria());
    }

}
