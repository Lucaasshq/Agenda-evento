import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        this.eventoMap.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate datalAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(datalAtual) || entry.getKey().isAfter(datalAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }


    }



    public static void main(String[] args) {

        AgendaEvento agendaEvento = new AgendaEvento();


    }
}
