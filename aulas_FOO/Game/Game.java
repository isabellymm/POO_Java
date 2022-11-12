public class Game {

  String nome;
  String estiloJogo;
  int NumerosFases;
  int NumeroDownloads;
  boolean salvo;
  boolean Continuar;

  void salvar() {
    salvo = true;
  }

  void naosalvar() {
    salvo = false;
  }

  void continuar() {
    Continuar = true;
  }

  void parar() {
    Continuar = false;
  }

  void salvarJogo() {
    if (salvo == true)
      System.out.println("Jogo salvo com sucesso!");
    else
      System.out.println("Jogo não salvo!");
  }

  void continuarJogo() {
    if (Continuar == true)
      System.out.println("Jogo irá continuar!");
    else
      System.out.println("Jogo não irá continuar!");
  }

  void imprimir() {
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("Estilo de Jogo: " + estiloJogo);
    System.out.println("Fases: " + NumerosFases);
    System.out.println("Downloads: " + NumeroDownloads);

  }
}