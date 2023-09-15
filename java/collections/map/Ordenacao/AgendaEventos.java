import java.time.LocalDate;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        if (nome != null && atracao != null) {
            eventos.put(data, new Evento(nome, atracao));
        }
    }

    public Map<LocalDate, Evento> exibirAgendaEventos() {
        return new TreeMap<>(eventos);
    }

    public Map<LocalDate, Evento> obterProximoEvento() {
        /*
        Set<LocalDate> dateSet = eventos.keySet();
        Collection<Evento> values = eventos.values();
        */
        //eventos.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> proximoEvento = new HashMap<>();
        for(Map.Entry<LocalDate, Evento> entry :  eventos.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento.put(entry.getKey(), entry.getValue());
                break;
            }
        }
        return proximoEvento;
    }
}
