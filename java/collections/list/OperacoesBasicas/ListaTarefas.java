package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public boolean adicionarTarefa(String descricao) {
        if (descricao == null) return false;
        tarefas.add(new Tarefa(descricao));
        return true;
    }

    public boolean removerTarefa(String descricao) {
        if (descricao == null) return false;
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) tarefasParaRemover.add(t);
        }
        tarefas.removeAll(tarefasParaRemover);
        return true;
    }

    public int getTotalTarefas(String descricao) {
        return tarefas.size();
    }

    public List<Tarefa> getDescricoes() {
        return tarefas;
    }

}