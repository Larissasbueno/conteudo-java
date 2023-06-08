package poo;

public class TestaIngresso {
 public static void main(String[] args) {
     // Instanciando objetos da classe Ingresso
     Ingresso ingresso1 = new Ingresso("VIP", 100.0, "Teatro Municipal", "12/06/2023", 50);
     Ingresso ingresso2 = new Ingresso("Normal", 50.0, "Centro de Convenções", "15/06/2023", 100);
     
     // Exibindo as informações dos objetos
     ingresso1.visualizar();
     ingresso2.visualizar();
 }
}
