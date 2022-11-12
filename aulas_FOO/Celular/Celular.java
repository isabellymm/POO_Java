public class Celular {
  String operadora;
  String marca;
  boolean dualChip;
  boolean internet;
  double tamanhoTela; // temSinal()

  void ligar_internet() {
    internet = true;
  }

  void desligar_internet() {
    internet = false;
  }

  void temSinal() {
    if (internet == true)
      System.out.println("Sinal Disponível");
    else
      System.out.println("Sinal Indisponível");
  }

  void dualChip() {
    if (dualChip == true)
      System.out.println("Tem dual Chip");
    else
      System.out.println("Não tem dual Chip");
  }

  void imprimir() {
    System.out.println("Operadora: " + operadora);
    System.out.println("Marca: " + marca);
    //System.out.println("Dualchip: " + dualChip);
    // System.out.println("Sinal: " + temSinal());
    System.out.println("Tamanho da Tela: " + tamanhoTela);
    System.out.println("");

  }

}