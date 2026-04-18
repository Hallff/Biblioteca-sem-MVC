public class Emprestimo {

    private Aluno aluno;
    private Livro livro;
    private boolean devolvido;

    public Emprestimo(Aluno aluno, Livro livro) {
        if (aluno == null || livro == null) {
            throw new IllegalArgumentException("Dados inválidos");
        }

        this.aluno = aluno;
        this.livro = livro;
        this.devolvido = false;

        livro.emprestar();
    }

    public void devolver() {
        if (!devolvido) {
            livro.devolver();
            devolvido = true;
        }
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }
}