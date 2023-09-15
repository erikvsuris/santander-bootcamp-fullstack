import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }
    
    public Map<String, String> exibirPalavras() {
        return palavras;
    }

    public String pesquisarPorPalavra(String palavra) {
        if (palavras.isEmpty()) return null;
        return palavras.get(palavra);
    }
}
