class Main {
  public static void main(String[] args) {
    Cliente c1 = new Cliente();
    c1.nome = "Igor";
    c1.fone = "9999-9999";
    c1.endereco = new Endereco();
    c1.endereco.numero = "78";
    c1.endereco.cep = "25478-204";
    c1.endereco.cidade = "Londrina";
    c1.imprimir();

    Fornecedor f1 = new Fornecedor();
    f1.nome = "João";
    f1.fone = "8888-8888";
    f1.endereco = new Endereco();
    f1.endereco.numero = "154";
    f1.endereco.cep = "24896-256";
    f1.endereco.cidade = "Londrina";
    f1.imprimir();

    Vendedor v1 = new Vendedor();
    v1.nome = "Carla";
    v1.fone = "7777-7777";
    v1.endereco = new Endereco();
    v1.endereco.numero = "1056";
    v1.endereco.cep = "2548-287";
    v1.endereco.cidade = "Londrina";
    v1.imprimir();
    
    
  }
}