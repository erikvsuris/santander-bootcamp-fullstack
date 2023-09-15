public class App {
    public static void main(String[] args) {
        
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("Java", 5);
        cp.adicionarPalavra("JavaScript", 7);
        cp.adicionarPalavra("Python", 6);

        System.out.println(cp.exibirContagemPalavras());

        cp.removerPalavra("JavaScript");

        System.out.println(cp.encontrarPalavraMaisFrequente());

    }
}