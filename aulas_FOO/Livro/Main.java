class Main {
  public static void main(String[] args) {

    Livro l1 = new Livro();
    Livro l2 = new Livro();

    l1.nome = "Pequeno Principe";
    l1.descricao = "As sábias, encantadoras e inesquecíveis histórias contadas pelo pequeno príncipe falam de seu próprio planeta...";
    l1.valor = 15.99;
    l1.isbn = "978-8567097107";
    l1.autor = "Antoine de Saint-Exupéry";
    l1.imprimir();

    l2.nome = "A revolução dos bichos";
    l2.descricao = "Publicada originalmente em 1949, a distopia futurista 1984 é um dos romances mais influentes do século XX...";
    l2.valor = 23.37;
    l2.isbn = "978-6587885346";
    l2.autor = "George Orwell";
    l2.imprimir();

  }
}