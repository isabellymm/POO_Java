class Main {
  public static void main(String[] args) {
    animal a1 = new animal();
    animal a2 = new animal();

    a1.nome = "Luna";
    a1.especie = "Cão";
    a1.raca = "Golden";
    a1.idade = 4;
    a1.peso = 12;
    a1.imprimir();

    a2.nome = "Bob";
    a2.especie = "Gato";
    a2.raca = "SRD";
    a2.idade = 6;
    a2.peso = 5;
    a2.imprimir();
  }
}