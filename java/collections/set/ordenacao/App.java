public class App {

    public static void main(String[] args) {
        
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Ana", 100, 8.5);
        ga.adicionarAluno("Paulo", 200, 9.5);
        ga.adicionarAluno("Maria", 300, 7.5);
        ga.adicionarAluno("Afonso", 400, 6.5);

        System.out.println(ga.exibirAlunosPorNome());
        System.out.println(ga.exibirAlunosPorMedia());

    }

}