package poo;

public class TestaCliente {
 
	public static void main(String[] args) {
     // Instanciando objetos da classe Cliente
     Cliente cliente1 = new Cliente("João", "Rua A, 123", "123456789", "joao@example.com", 30);
     Cliente cliente2 = new Cliente("Maria", "Rua B, 456", "987654321", "maria@example.com", 25);
     
     // Exibindo as informações dos objetos
     cliente1.visualizar();
     cliente2.visualizar();
 }
}
