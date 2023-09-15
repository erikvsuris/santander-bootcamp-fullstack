import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        AgendaEventos a = new AgendaEventos();

        a.adicionarEvento(LocalDate.of(2020, 5, 25), "Nome1", "Atracao1");
        a.adicionarEvento(LocalDate.of(2021, 2, 15), "Nome2", "Atracao2");
        a.adicionarEvento(LocalDate.of(2019, 8, 2), "Nome3", "Atracao3");
        a.adicionarEvento(LocalDate.of(2023, 11, 17), "Nome4", "Atracao4");
        a.adicionarEvento(LocalDate.of(2022, 1, 9), "Nome5", "Atracao5");

        System.out.println("Eventos: " + a.exibirAgendaEventos());
        System.out.println("Próximo evento: " + a.obterProximoEvento());

    }
}
