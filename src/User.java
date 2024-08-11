import java.time.LocalDate;
import java.time.Month;

public class User {
    public static void main(String[] args) {

        AgendaEvento agenda = new AgendaEvento();

        agenda.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 26), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2020, 2, 15), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 10), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 10), "Evento 4", "Atração 4");

        agenda.exibirAgenda();
        agenda.obterProximoEvento();

    }
}
