package lista04.exercicio03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Quarto quartoReservado;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(Quarto quartoReservado, LocalDate dataEntrada, LocalDate dataSaida) {
        this.quartoReservado = quartoReservado;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        return dias * quartoReservado.calcularDiaria();
    }

    public void mostrarResumo() {
        quartoReservado.dadosHotel();
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("Data de saída: " + dataSaida);
        System.out.println("Total de dias: " + ChronoUnit.DAYS.between(dataEntrada, dataSaida));
        System.out.printf("Valor total da reserva: R$ %.2f%n", calcularValorTotal());
    }
}