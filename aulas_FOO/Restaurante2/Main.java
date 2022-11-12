class Main {
  public static void main(String[] args) {
     Restaurante r1 = new Restaurante("BK" , true , false , true);
     r1.gerarRelatorioFaturamento();
    
     Restaurante r2 = new Restaurante("MD" , false, true, false);
    r2.gerarRelatorioFaturamento();
  }
}