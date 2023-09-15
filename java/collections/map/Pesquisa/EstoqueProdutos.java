import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public Map<Long, Produto> exibirProdutos() {
        return produtos;
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public double calcularValorTotalEstoque() {
        if (produtos.isEmpty()) return 0;

        double valorTotalEstoque = 0;
        for (Produto p : produtos.values()) {
            valorTotalEstoque += p.getValorTotal();
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        if (produtos.isEmpty()) return null;

        Produto produtoMaisCaro = null;
        double maiorValorEstoque = Double.MIN_VALUE;
        for (Produto p : produtos.values()) {
            if (p.getValorTotal() > maiorValorEstoque) {
                maiorValorEstoque = p.getValorTotal();
                produtoMaisCaro = p;
            }
        }
        
        return produtoMaisCaro;
    }
    
    public Produto obterProdutoMaisBarato() {
        if (produtos.isEmpty()) return null;
        
        Produto produtoMaisBarato = null;
        double menorValorEstoque = Double.MAX_VALUE;
        for (Produto p : produtos.values()) {
            if (p.getValorTotal() < menorValorEstoque) {
                menorValorEstoque = p.getValorTotal();
                produtoMaisBarato = p;
            }
        }
        
        return produtoMaisBarato;
    }
}
