public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Livro l1 = new Livro("POO", "Autor Y", 1);
        Aluno a1 = new Aluno("Maria");

        sistema.cadastrarLivro(l1);
        sistema.cadastrarAluno(a1);

        Emprestimo e1 = new Emprestimo(a1, l1);
        sistema.registrarEmprestimo(e1);

        System.out.println("Empréstimos em aberto:");

        for (Emprestimo e : sistema.emAberto()) {
            System.out.println(
                    e.getAluno().getNome() + " -> " +
                            e.getLivro().getTitulo()
            );
        }

        // testando devolução
        e1.devolver();

        System.out.println("\nApós devolução:");
        System.out.println("Em aberto: " + sistema.emAberto().size());
    }
}