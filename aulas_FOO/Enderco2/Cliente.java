public class Cliente{
  String nome;
  String fone;
  String email;
  String cpf;
  Endereco endereco;

  void imprimir(){
    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + fone);
    endereco.imprimir();
  }
}