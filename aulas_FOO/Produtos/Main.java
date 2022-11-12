class Main {
  public static void main(String[] args) {

    Produtos xampu = new Produtos();
    Produtos PastadeDente = new Produtos();

    xampu.codigo = 114;
    xampu.nome = "Pantene";
    xampu.cor = "Azul";
    xampu.estoque = 45411;
    xampu.preco = 17.89;
    xampu.imprimir();

    PastadeDente.codigo = 154;
    PastadeDente.nome = "Colgate";
    PastadeDente.cor = "Branca";
    PastadeDente.estoque = 13214;
    PastadeDente.preco = 15.99;
    PastadeDente.imprimir();
      
    
    
  }
}