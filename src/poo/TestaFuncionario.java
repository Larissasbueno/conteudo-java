package poo;

public class TestaFuncionario {
 public static void main(String[] args) {
     // Instanciando objetos da classe Funcionario
     Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 5000.0, "TI", 30);
     Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 8000.0, "Administrativo", 35);
     
     // Exibindo as informações dos objetos
     funcionario1.visualizar();
     funcionario2.visualizar();
 }
}
