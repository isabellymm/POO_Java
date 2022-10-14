public class atributos {

    public int idade;
    public String nome;
    private float peso;
    private float altura;
    private  String profissao;

    public void EstadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Profissão: " + this.profissao);
    }
    //metodos personalizados
    public void idade(float i){
        if (this.getIdade() < 21){
            System.out.println("Idade menor que 21");
        }
    }

    //métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String p) {
        this.profissao = p;
    }
}