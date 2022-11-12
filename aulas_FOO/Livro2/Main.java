class Main {
  public static void main(String[] args) {
    Livro l1 = new Livro("Pequeno Principe", "As sábias, encantadoras e inesquecíveis...", 15.99 , "978-8567097107", "Antoine de Saint-Exupéry");
    
    Livro l2 = new Livro("A revolução dos bichos", "Publicada originalmente em 1949...", 23.37, "978-6587885346", "George Orwell");

    l1.imprimir();
    l2.imprimir();
  }
}