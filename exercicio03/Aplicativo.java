package lista04.exercicio03;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {
        Quarto simples = new QuartoSimples(101, 2, 150.0);
        Quarto luxo = new QuartoLuxo(201, 3, 250.0, 75.0);

        Reserva reservaSimples = new Reserva(simples, LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 13));
        Reserva reservaLuxo = new Reserva(luxo, LocalDate.of(2025, 7, 15), LocalDate.of(2025, 7, 18));

        GerenciadorReservas gerenciador = new GerenciadorReservas();
        gerenciador.adicionarReserva(reservaSimples);
        gerenciador.adicionarReserva(reservaLuxo);

        gerenciador.listarReservas();
    }
}