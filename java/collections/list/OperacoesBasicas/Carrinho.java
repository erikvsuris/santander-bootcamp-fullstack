package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public boolean adicionarItem(String nome, double preco, int quantidade) {
        if (nome == null || preco <= 0 || quantidade <= 0) return false;
        itens.add(new Item(nome, preco, quantidade));
        return true;
    }

    public boolean removerItem(String nome) {
        if (nome == null) return false;
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens) {
            if (i.getNome().equalsIgnoreCase(nome)) itensParaRemover.add(i);
        }
        itens.removeAll(itensParaRemover);
        return true;
    }

    public double getValorTotal() {
        double total = 0;
        for (Item i : itens) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public List<Item> getItens() {
        return itens;
    }

}