public class pessoas {
    public static void main(String[] args){

        atributos p1 = new atributos();
        p1.setNome("Kendall");
        p1.setAltura(1.78f);
        p1.setIdade(49);
        p1.setPeso(88.5f);
        p1.setProfissao("CEO");

        atributos p2 = new atributos();
        p2.setNome("Greg");
        p2.setAltura(1.88f);
        p2.setIdade(28);
        p2.setPeso(78.4f);
        p2.setProfissao("Primo roy");

        atributos p3 = new atributos();
        p3.setNome("Shiv");
        p3.setAltura(1.65f);
        p3.setIdade(17);
        p3.setPeso(72.8f);
        p3.setProfissao("Perdeu Tudo!");


        p1.EstadoAtual();
        p2.EstadoAtual();
        p3.EstadoAtual();

    }
}
