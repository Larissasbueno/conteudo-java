package poo;


public class Cliente {
 // Atributos
 private String nome;
 private String endereco;
 private String telefone;
 private String email;
 private int idade;
 
 // Construtor
 public Cliente(String nome, String endereco, String telefone, String email, int idade) {
     this.nome = nome;
     this.endereco = endereco;
     this.telefone = telefone;
     this.email = email;
     this.idade = idade;
 }
 
 // Métodos Getters e Setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getEndereco() {
     return endereco;
 }

 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 public String getTelefone() {
     return telefone;
 }

 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public int getIdade() {
     return idade;
 }

 public void setIdade(int idade) {
     this.idade = idade;
 }
 

 public void visualizar() {
     System.out.println("Nome: " + nome);
     System.out.println("Endereço: " + endereco);
     System.out.println("Telefone: " + telefone);
     System.out.println("Email: " + email);
     System.out.println("Idade: " + idade);
     System.out.println();
 }
}
