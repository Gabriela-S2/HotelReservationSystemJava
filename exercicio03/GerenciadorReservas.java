package lista04.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }

    public void cancelarReserva(Reserva r) {
        reservas.remove(r);
    }

    public void listarReservas() {
        for (Reserva r : reservas) {
            r.mostrarResumo();
            System.out.println("--------------------------");
        }
    }
}