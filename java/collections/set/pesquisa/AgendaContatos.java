import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        return contatos;
    }

    public Set<Contato> pesquisarPorNome(String nomeParaPesquisar) {
        if (nomeParaPesquisar == null || contatos.isEmpty()) return null;
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nomeParaPesquisar)) contatosPorNome.add(c);
        }
        return contatosPorNome;
    }

    public Contato atualizarNomeContato(int numero, String novoNome) {
        Contato contatoAtualizado = null;
        for (Contato c : contatos) {
            if (c.getNumero() == numero) {
                c.setNome(novoNome);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

}