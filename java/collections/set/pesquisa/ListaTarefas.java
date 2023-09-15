import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        if (descricao != null) {
            tarefas.add(new Tarefa(descricao));
        }
    }

    public void removerTarefa(String descricao) {
        if (descricao != null && !tarefas.isEmpty()) {   
            Tarefa tarefaParaRemover = null;
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) tarefaParaRemover = t;
            }
            tarefas.remove(tarefaParaRemover);
        }
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefas;
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.getConcluida()) tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }
    
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.getConcluida()) tarefasPendentes.add(t);
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (descricao != null && !tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (descricao != null && !tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) t.setConcluida(false);
            }
        }
    }
    
    public void limparListaTarefas() {
        if (!tarefas.isEmpty()) {
            tarefas.clear();
        }
    }

}
