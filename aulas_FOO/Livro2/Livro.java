public class Livro {
  String nome;
  String descricao;
  double valor;
  String isbn;
  String autor;

  public Livro(String nome) {
    this.nome = nome;
  }

  public Livro() {
  }

  public Livro(String nome, String descricao,
    double valor, String isbn, String autor) {
      this.nome = nome;
      this.descricao = descricao;
      this.valor = valor;
      this.isbn = isbn;
      this.autor = autor;
  }

   void imprimir(){
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Valor: " + "R$" + valor);
    System.out.println("isbn: " + isbn);
    System.out.println("autor: " + autor);
  } 
   
  
}

