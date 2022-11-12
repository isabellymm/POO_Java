public class Fornecedor{
  String nome;
  String fone;
  String email;
  String cnpj;
  Endereco endereco;

  void imprimir(){
  System.out.println("Nome: " + nome);
  System.out.println("Telefone: " + fone);
  endereco.imprimir();
  }
}