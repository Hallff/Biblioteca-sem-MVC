# Sistema de Biblioteca Escolar

## Tabelas (Classes)

- Livro
  - titulo
  - autor
  - quantidade

- Aluno
  - nome

- Emprestimo
  - aluno
  - livro
  - devolvido

- Sistema
  - lista de livros
  - lista de alunos
  - lista de emprestimos

## Regras de Negócio

- Não permitir livro com título vazio
- Não permitir quantidade negativa
- Não permitir empréstimo sem estoque
- Diminuir quantidade ao emprestar
- Aumentar quantidade ao devolver
- Listar livros emprestados
- Listar alunos com empréstimos em aberto
