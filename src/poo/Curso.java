package poo;

public class Curso {
 // Atributos
 private String nome;
 private String plataforma;
 private int duracao;
 private String professor;
 private int numeroAlunos;
 
 // Construtor
 public Curso(String nome, String plataforma, int duracao, String professor, int numeroAlunos) {
     this.nome = nome;
     this.plataforma = plataforma;
     this.duracao = duracao;
     this.professor = professor;
     this.numeroAlunos = numeroAlunos;
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

 public int getDuracao() {
     return duracao;
 }

 public void setDuracao(int duracao) {
     this.duracao = duracao;
 }

 public String getProfessor() {
     return professor;
 }

 public void setProfessor(String professor) {
     this.professor = professor;
 }

 public int getNumeroAlunos() {
     return numeroAlunos;
 }

 public void setNumeroAlunos(int numeroAlunos) {
     this.numeroAlunos = numeroAlunos;
 }
 
 // Método visualizar
 public void visualizar() {
     System.out.println("Nome do curso: " + nome);
     System.out.println("Plataforma: " + plataforma);
     System.out.println("Duração (em semanas): " + duracao);
     System.out.println("Professor: " + professor);
     System.out.println("Número de alunos: " + numeroAlunos);
     System.out.println();
 }
}
