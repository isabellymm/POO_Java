public class Lampada{
  boolean estado;
  String nome;

  
  void acender() {
  estado = true;
}
  void apagar() {
  estado = false;
}
  
 public Lampada(boolean estado) {
   this.estado = estado;
 }

 public Lampada (){
  
}
  public Lampada(boolean estado, String nome) {
     this.estado = estado;
     this.nome = nome;
  }
  void imprimir() {
  if (estado)
   System.out.println("Lâmpada acessa: " + nome);
  else
   System.out.println("Lâmpada apagada: " + nome);
}
}
