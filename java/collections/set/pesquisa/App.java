public class App {
    
    public static void main(String[] args) {
        
        ListaTarefas lt = new ListaTarefas();

        lt.adicionarTarefa("Teste1");
        lt.adicionarTarefa("Teste2");
        lt.adicionarTarefa("Teste3");
        lt.adicionarTarefa("Teste4");
        lt.adicionarTarefa("Teste5");

        lt.removerTarefa("Teste4");
        
        System.out.println(lt.exibirTarefas());

        System.out.println(lt.contarTarefas());

        lt.marcarTarefaConcluida("Teste1");
        lt.marcarTarefaConcluida("Teste2");
        lt.marcarTarefaConcluida("Teste4");
        lt.marcarTarefaPendente("Teste4");

        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        lt.limparListaTarefas();
        System.out.println(lt.exibirTarefas());

    }

}
