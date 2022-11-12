class Main {
  public static void main(String[] args) {
    
    Parcela p1 = new Parcela();
    Parcela p2 = new Parcela();
    Parcela p3 = new Parcela();

    p1.dataVencimento = "25/10/2022";
    p1.parcela = 25.56;
    p1.pago = true;

    p2.dataVencimento = "27/11/2022";
    p2.parcela = 458.56;
    p2.pago = false;
    
    p3.dataVencimento = "12/09/2022";
    p3.parcela = 125.99;
    p3.pago = true;
    
    
    Cliente c1 = new Cliente();
    c1.nome = "Igor";
    c1.fone = "9999-9999";
    c1.email = "igor23tkb@gmail.com";
    c1.cpf = "256.214.259-89";
    c1.endereco = new Endereco();
    c1.endereco.logradouro = "Casa";
    c1.endereco.numero = "78";
    c1.endereco.bairro = "Limoeiro";
    c1.endereco.cep = "25478-204";
    c1.endereco.cidade = "Londrina";
    c1.endereco.estado = "PR";
  
   
    Vendedor v1 = new Vendedor();
    v1.nome = "Carla";
    v1.fone = "7777-7777";
    v1.email = "carlazm12@gmail.com";
    v1.cpf = "214.656.489-01";
    v1.endereco = new Endereco();
    c1.endereco.logradouro = "Apartamento";
    v1.endereco.numero = "1056";
    v1.endereco.bairro = "Vila Montez";
    v1.endereco.cep = "2548-287";
    v1.endereco.cidade = "Londrina";
    v1.endereco.estado = "PR";
   

    Venda ven1 = new Venda();
    ven1.dataVenda = "29/12/2022";
    ven1.totalVenda = 255.89;
    ven1.numeroNotaFiscal = "1488565-899";
    c1.imprimir();
    v1.imprimir();
    ven1.imprimir();
    p1.imprimir();
    p2.imprimir();
    p3.imprimir();
    
    

  }
}