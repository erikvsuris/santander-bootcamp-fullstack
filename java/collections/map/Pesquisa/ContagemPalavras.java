import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        if (palavra != null && contagem != null) palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty() && palavra != null) palavras.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras() {
        return palavras;
    }

    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        Integer maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
              maiorContagem = entry.getValue();
              linguagemMaisFrequente = entry.getKey();
            }
          }
        return linguagemMaisFrequente;
    }
}
