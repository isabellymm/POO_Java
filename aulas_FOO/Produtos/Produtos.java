public class Produtos {
  int codigo;
  String nome;
  String cor;
  int estoque;
  double preco;

  void imprimir(){
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Cor: " + cor);
    System.out.println("Estoque: " + estoque);
    System.out.println("Preço: " + preco + "\n");
    
  }
}