package lista04.exercicio03;

public class QuartoLuxo extends Quarto {
    private double taxasExtras;

    public QuartoLuxo(int numero, int capacidade, double valorBase, double taxasExtras) {
        super(numero, capacidade, valorBase);
        this.taxasExtras = taxasExtras;
    }

    public double getTaxasExtras() {
        return taxasExtras;
    }

    public void setTaxasExtras(double taxasExtras) {
        this.taxasExtras = taxasExtras;
    }

    @Override
    public double calcularDiaria() {
        double diaria = getValorBase()+ getTaxasExtras();
        return diaria;
    }

    @Override
    public void dadosHotel() {
        System.out.println("Quarto Luxo");
        System.out.println("Numero: " + getNumero());
        System.out.println("Capacidade: " + getCapacidade() + " pessoas");
        System.out.println("Valor da diária: " + calcularDiaria());
    }
}
