class Main {
  public static void main(String[] args) {

    Celular c1 = new Celular();
    Celular c2 = new Celular();

    c1.operadora = "Tim";
    c1.marca = "Nokia";
    c1.tamanhoTela = 6.9;
    c1.dualChip = true;
    c1.dualChip();
    c1.internet = false;
    c1.temSinal();
    c1.imprimir();
    
    c2.operadora = "Vivo";
    c2.marca = "Apple";
    c2.tamanhoTela = 10.8;
    c2.dualChip();
    c2.internet = true;
    c2.temSinal();
    c2.imprimir();
  }
}