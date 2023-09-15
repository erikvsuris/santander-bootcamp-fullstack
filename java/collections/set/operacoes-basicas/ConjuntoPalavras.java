import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {

    private Set<String> palavras;

    public ConjuntoPalavras() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String novaPalavra) {
        palavras.add(novaPalavra);
    }
    
    public void removerPalavra(String palavraParaRemover) {
        for (String s : palavras) {
            if (s.equalsIgnoreCase(palavraParaRemover)) palavras.remove(palavraParaRemover);
            break;
        }
    }

    public boolean verificarPalavra(String palavraParaVerificar) {
        for (String s : palavras) {
            if (s.equalsIgnoreCase(palavraParaVerificar)) return true;
        }
        return false;
    }

    public Set<String> exibirPalavras() {
        return palavras;
    }

}