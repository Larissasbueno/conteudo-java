package poo;

public class Farmacia {
 // Atributos
 private String nome;
 private String fabricante;
 private double preco;
 private String principioAtivo;
 private int quantidadeEstoque;
 
 // Construtor
 public Farmacia(String nome, String fabricante, double preco, String principioAtivo, int quantidadeEstoque) {
     this.nome = nome;
     this.fabricante = fabricante;
     this.preco = preco;
     this.principioAtivo = principioAtivo;
     this.quantidadeEstoque = quantidadeEstoque;
 }
 
 // Métodos Getters e Setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getFabricante() {
     return fabricante;
 }

 public void setFabricante(String fabricante) {
     this.fabricante = fabricante;
 }

 public double getPreco() {
     return preco;
 }

 public void setPreco(double preco) {
     this.preco = preco;
 }

 public String getPrincipioAtivo() {
     return principioAtivo;
 }

 public void setPrincipioAtivo(String principioAtivo) {
     this.principioAtivo = principioAtivo;
 }

 public int getQuantidadeEstoque() {
     return quantidadeEstoque;
 }

 public void setQuantidadeEstoque(int quantidadeEstoque) {
     this.quantidadeEstoque = quantidadeEstoque;
 }
 
 // Método visualizar
 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Fabricante: " + fabricante);
     System.out.println("Preço: " + preco);
     System.out.println("Princípio Ativo: " + principioAtivo);
     System.out.println("Quantidade em estoque: " + quantidadeEstoque);
     System.out.println();
 }
}
