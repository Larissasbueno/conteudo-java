package poo;

public class TestaFarmacia {
 public static void main(String[] args) {
     // Instanciando objetos da classe Farmacia
     Farmacia produto1 = new Farmacia("Paracetamol", "Genérico", 10.0, "Paracetamol", 50);
     Farmacia produto2 = new Farmacia("Dipirona", "EMS", 8.0, "Sódica", 30);
     
     // Exibindo as informações dos objetos
     produto1.visualizar();
     produto2.visualizar();
 }
}
