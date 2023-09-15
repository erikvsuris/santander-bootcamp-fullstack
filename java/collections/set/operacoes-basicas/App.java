public class App {
    
    public static void main(String[] args) {
        
        ConjuntoPalavras cp = new ConjuntoPalavras();

        cp.adicionarPalavra("Banana");
        cp.adicionarPalavra("Laranja");
        cp.adicionarPalavra("Pera");
        cp.adicionarPalavra("Uva");
        cp.removerPalavra("Pera");
        System.out.println(cp.verificarPalavra("Laranja"));
        System.out.println(cp.verificarPalavra("Abacaxi"));

        System.out.println(cp.exibirPalavras());

    }

}
