public class Vendedor{
  String nome;
  String fone;
  String email;
  String comissao;
  String cpf;
  Endereco endereco;

  void imprimir(){
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + fone);
    endereco.imprimir();
  }
}