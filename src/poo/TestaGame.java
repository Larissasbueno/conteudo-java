package poo;

public class TestaGame {
 public static void main(String[] args) {
     // Instanciando objetos da classe Produto
     Produto produto1 = new Produto("The Last of Us Part II", "PlayStation 4", 199.99, "Ação e Aventura", 10);
     Produto produto2 = new Produto("Super Mario Odyssey", "Nintendo Switch", 249.99, "Plataforma", 5);
     
     // Exibindo as informações dos objetos
     produto1.visualizar();
     produto2.visualizar();
 }
}
