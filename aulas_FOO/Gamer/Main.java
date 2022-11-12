class Main {
  public static void main(String[] args) {
    Gamer g1 = new Gamer();
    Gamer g2 = new Gamer();

    g1.apelido = "JOGADOR 1";
    g1.NumeroVidas = 5;
    g1.energia = 20;
    g1.Andar = true;
    g1.Pular = true;
    g1.Correr = true;
    g1.andar();
    g1.correr();
    g1.pular();
    g1.imprimir();

    g2.apelido = "JOGADOR 2";
    g2.NumeroVidas = 7;
    g2.energia = 10;
    g2.Andar = false;
    g2.Pular = false;
    g2.Correr = false;
    g2.andar();
    g2.correr();
    g2.pular();
    g2.imprimir();
  }
}