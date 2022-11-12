class Main {
  public static void main(String[] args) {
    
    Game g1 = new Game();
    Game g2 = new Game();

    g1.nome = "League of legends";
    g1.estiloJogo = "MOBA";
    g1.NumerosFases = 15;
    g1.NumeroDownloads = 1500000;
    g1.imprimir();
    g1.continuarJogo();
    g1.salvarJogo();
    

    g2.nome = "The witcher";
    g2.estiloJogo = "RPG";
    g2.NumerosFases = 20;
    g2.NumeroDownloads = 157800;
    g2.imprimir();
    g2.continuarJogo();
    g2.salvarJogo();
    
    
  }
}