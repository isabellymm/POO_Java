
package exemploaula02;

public class ExemploAula02 {

    
    public static void main(String[] args) {

        Notebook n1 = new Notebook();
        n1.modelo = "Asus";
        n1.placadevídeo = "rtx 1060";
        n1.processador = "AMD";
        n1.memoria = 8;
        n1.tamanho = 18.6f;
        n1.tomada_ligada();
        n1.status();
        n1.ligado();
        
        Notebook n2 = new Notebook();
        n2.modelo = "Lenovo";
        n2.placadevídeo = "AMD";
        n2.processador = "AMD Ryzen 7";
        n2.memoria = 16;
        n2.tamanho = 17.8f;
        n2.tomada_desligada();
        n2.status();
        n2.ligado();
    }
    
}
