import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatos.isEmpty()) contatos.remove(nome);
    }

    public Map<String, Integer> exibirContatos() {
        return contatos;
    }

    public Integer pesquisarPorNome(String nome) {
        if (contatos.isEmpty()) return null;
        return contatos.get(nome);
    }

}