public class Gamer{

  String apelido;
  int NumeroVidas;
  int energia;
  boolean Andar;
  boolean Pular;
  boolean Correr;

  
public void andar(){
    if(Andar == true)
       System.out.println("Andou 1 bloco");
    else
      System.out.println("Permaneceu no mesmo bloco");
    
  }
public void pular(){
    if(Pular == true)
      System.out.println("Pulou 3 blocos");
    else
      System.out.println("Permaneceu no mesmo bloco");
    
  }

public void correr(){
    if(Andar == true)
      System.out.println("Correu 5 blocos");
    else
      System.out.println("Permaneceu no mesmo bloco");
    
}
  void imprimir(){
    System.out.println("Apelido: " + apelido);
    System.out.println("Números de Vida: " + NumeroVidas);
    System.out.println("Energia: " + energia +"\n");
    
   //System.out.println("Andar: " + andar());
   // System.out.println("Pular: " + pular());
   // System.out.println("Correr: " + correr());
    
    
  }
}