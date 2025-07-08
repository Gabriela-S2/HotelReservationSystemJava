package lista04.exercicio03;

public abstract class Quarto {
    private int numero;
    private int capacidade;
    private double valorBase;
    public Quarto(int numero, int capacidade, double valorBase) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.valorBase = valorBase;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

   public abstract void dadosHotel();

    public double calcularDiaria(){
        double diaria = getValorBase();
        return diaria;
    }
}
