import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Livro> livros = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro l) {
        livros.add(l);
    }

    public void cadastrarAluno(Aluno a) {
        alunos.add(a);
    }

    public void registrarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public List<Emprestimo> emAberto() {
        List<Emprestimo> lista = new ArrayList<>();

        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido()) {
                lista.add(e);
            }
        }

        return lista;
    }
}