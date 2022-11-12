public class Celular{
  String operadora;
  String marca;
  boolean dualChip;
  boolean internet;
  double tamanhoTela;

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

  
  public Celular(String marca) {
    this.marca = marca;
  }

  public Celular() {
  
  }

  public Celular(boolean internet ,String operadora, String marca,
     double tamanhoTela, boolean dualChip) {
      this.internet = internet;
      this.operadora = operadora;
      this.marca = marca;
      this.tamanhoTela = tamanhoTela;
      this.dualChip = dualChip;
  }

  void imprimir() {
    System.out.println("Operadora: " + operadora);
    System.out.println("Marca: " + marca);
    System.out.println("Tamanho da Tela: " + tamanhoTela);
    System.out.println("");

  }
}