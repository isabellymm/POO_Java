public class Restaurante{
  String nome;
  boolean serveCafedaManha;
  boolean serveAlmoco;
  boolean serveJantar;

  public Restaurante(String nome) {
    this.nome = nome;
  }

  public Restaurante() {

  }

  public Restaurante(String nome, boolean serveCafedaManha,
    boolean serveAlmoco, boolean serveJantar) {
      this.nome = nome;
      this.serveCafedaManha = serveCafedaManha;
      this.serveAlmoco = serveAlmoco;
      this.serveJantar = serveJantar;
  }

  void gerarRelatorioFaturamento(){
    System.out.println("Faturamento dia 15/10...");
  }
}