public class Livro {
  String nome;
  String descricao;
  double valor;
  String isbn;
  String autor;

  void imprimir(){
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("Descrição: " + descricao);
    System.out.println("Valor: " + "R$" + valor);
    System.out.println("isbn: " + isbn);
    System.out.println("autor: " + autor);
  } 
  
}