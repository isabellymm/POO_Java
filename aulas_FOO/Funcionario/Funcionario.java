public class Funcionario{
  
  String nome;
  String departamento;
  double salario_Hora;
  double salario;
  String data_Admissao;
  int horas; 
  

  public double calcularSalario(){
   salario = salario_Hora * horas;
    return salario;
  }

  void imprimir(){
    System.out.println("Nome: "+ nome);
    System.out.println("Departamento: " + departamento);
    System.out.println("Salário:  R$" + calcularSalario());
    System.out.println("Data admissão: "+ data_Admissao+"\n");

  }
}