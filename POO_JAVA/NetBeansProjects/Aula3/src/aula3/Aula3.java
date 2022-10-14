
package aula3;

public class Aula3 {

    public static void main(String[] args) {
        Caneta3 c1 = new Caneta3();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    
    
    }
    
}
