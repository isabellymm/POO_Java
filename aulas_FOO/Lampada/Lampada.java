public class Lampada {

 boolean estado;
 String nome;

  void acender() {
  estado = true;
}
  void apagar() {
  estado = false;
}
 void imprimir() {
  if (estado)
   System.out.println("Lâmpada acessa: " + nome);
  else
   System.out.println("Lâmpada apagada: " + nome);
}
}