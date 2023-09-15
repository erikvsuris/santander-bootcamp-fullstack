import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> alunos;
    
    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunos);
    }

    public Set<Aluno> exibirAlunosPorMedia() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunosPorMedia.addAll(alunos);
        return alunosPorMedia;
    }

}