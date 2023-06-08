package poo;

public class Ingresso {
 // Atributos
 private String tipo;
 private double preco;
 private String local;
 private String data;
 private int quantidadeDisponivel;
 
 // Construtor
 public Ingresso(String tipo, double preco, String local, String data, int quantidadeDisponivel) {
     this.tipo = tipo;
     this.preco = preco;
     this.local = local;
     this.data = data;
     this.quantidadeDisponivel = quantidadeDisponivel;
 }
 
 // Métodos Getters e Setters
 public String getTipo() {
     return tipo;
 }

 public void setTipo(String tipo) {
     this.tipo = tipo;
 }

 public double getPreco() {
     return preco;
 }

 public void setPreco(double preco) {
     this.preco = preco;
 }

 public String getLocal() {
     return local;
 }

 public void setLocal(String local) {
     this.local = local;
 }

 public String getData() {
     return data;
 }

 public void setData(String data) {
     this.data = data;
 }

 public int getQuantidadeDisponivel() {
     return quantidadeDisponivel;
 }

 public void setQuantidadeDisponivel(int quantidadeDisponivel) {
     this.quantidadeDisponivel = quantidadeDisponivel;
 }
 
 // Método visualizar
 public void visualizar() {
     System.out.println("Tipo: " + tipo);
     System.out.println("Preço: " + preco);
     System.out.println("Local: " + local);
     System.out.println("Data: " + data);
     System.out.println("Quantidade disponível: " + quantidadeDisponivel);
     System.out.println();
 }
}
