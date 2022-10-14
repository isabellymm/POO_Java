
package exemploaula02;


public class Notebook {
    String modelo;
    String placadevídeo;
    String processador;
    int memoria;
    float tamanho;
    boolean tomada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa de Vídeo: " + this.placadevídeo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória: " + this.memoria + " GB RAM");
        System.out.println("Tamanho: " + this.tamanho + "Polegadas");
        System.out.println("Está Ligado ?  " + this.tomada);
        
    }

    void ligado(){
        if (this.tomada == true) {
            System.out.println("Notebook ligado");
        } else {
            System.out.println("Notebook desligado");
        }

    }

    void tomada_ligada(){
        this.tomada = true;

    }

    void tomada_desligada(){
        this.tomada = false;

    }
    
}
