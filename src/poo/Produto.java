package poo;

public class Produto {
 // Atributos
 private String nome;
 private String plataforma;
 private double preco;
 private String genero;
 private int quantidadeEstoque;
 
 // Construtor
 public Produto(String nome, String plataforma, double preco, String genero, int quantidadeEstoque) {
     this.nome = nome;
     this.plataforma = plataforma;
     this.preco = preco;
     this.genero = genero;
     this.quantidadeEstoque = quantidadeEstoque;
 }
 
 // Métodos Getters e Setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getPlataforma() {
     return plataforma;
 }

 public void setPlataforma(String plataforma) {
     this.plataforma = plataforma;
 }

 public double getPreco() {
     return preco;
 }

 public void setPreco(double preco) {
     this.preco = preco;
 }

 public String getGenero() {
     return genero;
 }

 public void setGenero(String genero) {
     this.genero = genero;
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
     System.out.println("Plataforma: " + plataforma);
     System.out.println("Preço: " + preco);
     System.out.println("Gênero: " + genero);
     System.out.println("Quantidade em estoque: " + quantidadeEstoque);
     System.out.println();
 }
}
