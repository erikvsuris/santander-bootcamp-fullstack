public class App {
    
    public static void main(String[] args) {
        
        Dicionario dc = new Dicionario();

        dc.adicionarPalavra("Amor", "Substantivo; sentimento afetivo; afeto");
        dc.adicionarPalavra("Dor", "Substantivo; sensação penosa, desagradável, produzida pela excitação de terminações nervosas sensíveis a esses estímulos");
        dc.adicionarPalavra("Empatia", "Substantivo; capacidade de se colocar no lugar de outra pessoa, buscando agir ou pensar da forma como ela pensaria ou agiria");
        dc.adicionarPalavra("Perspectiva", "Substantivo; modo como se concebe ou se analisa uma situação específica; ponto de vista");
        
        System.out.println(dc.exibirPalavras());
        dc.removerPalavra("Empatia");
        System.out.println(dc.pesquisarPorPalavra("Dor"));
        System.out.println(dc.exibirPalavras());
        

    }

}
