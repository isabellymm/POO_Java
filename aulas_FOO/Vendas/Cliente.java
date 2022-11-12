public class Cliente{
  String nome;
  String fone;
  String email;
  String cpf;
  Endereco endereco;

  void imprimir(){
    System.out.println("-----------Clientes---------");
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + fone);
    System.out.println("Email: " + email);
    System.out.println("CPF: " + cpf);
    endereco.imprimir();
  }
}