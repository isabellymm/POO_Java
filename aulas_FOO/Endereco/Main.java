class Main {
  public static void main(String[] args) {

    Endereco e1 = new Endereco();
    Endereco e2 = new Endereco();

    e1.logadouro = "Casa";
    e1.numero = "256";
    e1.complemento = "";
    e1.bairro = "Matriz";
    e1.cidade = "Curitiba";
    e1.estado = "PR";
    e1.pais = "Brasil";
    e1.cep = "20769-345"; 
    e1.endereco();

    e2.logadouro = "Casa";
    e2.numero = "77";
    e2.complemento = "Condomimio";
    e2.bairro = "Boa vista";
    e2.cidade = "Blumenau";
    e2.estado = "SC";
    e2.pais = "Brasil";
    e2.cep = "25687-989";
    e2.endereco();
  }
}