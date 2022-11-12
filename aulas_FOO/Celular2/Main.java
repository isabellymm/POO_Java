class Main {
  public static void main(String[] args) {

    Celular c1 = new Celular(true, "Tim", "Nokia", 6.9, false);
    c1.dualChip();
    c1.temSinal();
    c1.imprimir();
    
    Celular c2 = new Celular(false, "Vivo", "Apple", 10.8, true);
    c2.dualChip();
    c2.temSinal();
    c2.imprimir();
    
  }
}