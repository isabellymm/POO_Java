public class Vendedor{
  String nome;
  String fone;
  String email;
  double comissao;
  String cpf;
  Endereco endereco;

  void imprimir(){
    System.out.println("-----------Vendedor---------");
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + fone);
    System.out.println("Email: " + email);
    System.out.println("CPF: " + cpf);
    endereco.imprimir();
  }
}