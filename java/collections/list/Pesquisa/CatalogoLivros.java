package Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public boolean adicionarLivro(String titulo, String autor, int anoPublicacao) {
        if (titulo == null || autor == null || anoPublicacao <= 0) return false;
        livros.add(new Livro(titulo, autor, anoPublicacao));
        return true;
    }
    
    public List<Livro> pesquisarPorTitulo(String titulo) {
        if (titulo == null) return null;
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) livrosPorTitulo.add(l);
            }
        }
        return livrosPorTitulo;
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        if (autor == null) return null;
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        if (anoInicio <= 0) return null;
        if (anoInicio > anoFim) {
            int aux = anoInicio;
            anoInicio = anoFim;
            anoFim = aux;
        }
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
            if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) livrosPorIntervaloAnos.add(l);            
            }
        }
        return livrosPorIntervaloAnos;
    }


}
