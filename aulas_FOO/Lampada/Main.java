class Main {
public static void main(String[] args) {
// Criação dos objetos do tipo Lampada
Lampada lampSala = new Lampada();
Lampada lampQuarto = new Lampada();
Lampada lampCozinha = new Lampada();

lampSala.nome = "Sala";
lampQuarto.nome = "Quarto";
lampCozinha.nome = "Cozinha";

  
// Operador "ponto" - "."
lampSala.estado = true;
lampQuarto.estado = false;
lampCozinha.estado = false;
System.out.println("==========");
lampSala.imprimir();
lampQuarto.imprimir();
lampCozinha.imprimir();
// Chamada de métodos
lampSala.apagar();
lampQuarto.acender();
lampCozinha.acender();
System.out.println("==========");
lampSala.imprimir();
lampQuarto.imprimir();
lampCozinha.imprimir();
}
}