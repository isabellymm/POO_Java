public class Venda{
  String dataVenda;
  double totalVenda;
  String numeroNotaFiscal;
  Cliente cliente;
  Vendedor vendedor;
  Parcela parcela1;
  Parcela parcela2;
  Parcela parcela3;

  void imprimir(){
    System.out.println("--------Vendas---------");
    System.out.println("Data de Venda: " + dataVenda);
    System.out.println("Total de Vendas: " + totalVenda);
    System.out.println("Nota Fiscal: " + numeroNotaFiscal);
    System.out.println("Números de Parcela: 3 \n");
  }

}