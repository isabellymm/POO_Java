public class Parcela{
  String dataVencimento;
  double parcela;
  boolean pago;


  void pagar(){
    pago = true;
  }

  void devendo(){
    pago = false;
  }

  void imprimir(){

  System.out.println("---------Parcelas----------");
  System.out.println("Data de Vencimento: " + dataVencimento);
  System.out.println("Parcela: " + parcela);
  System.out.println("Pago: " + pago);

   if (pago == true)
   System.out.println("Parcela Paga! \n");
   else
   System.out.println("Parcela ainda não foi paga! \n");
  }
}
