public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 0.8f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        Caneta c3 = new Caneta();
        c3.cor = "Vermelho";
        c3.ponta = 0.1f;
        c3.destampar();
        c3.status();
        c3.rabiscar();
    }
}

        

