public class Exemplo_Aula02 {
    
    public static void name(String[] args) {
        Notebook n1 = new Notebook();
        n1.modelo = "Asus";
        n1.placadevídeo = "rtx 1060";
        n1.processador = "AMD";
        n1.memoria = 8;
        n1.tamanho = 18.6f;
        n1.tomada_ligada();
        n1.status();
        n1.ligado();
    }
}
