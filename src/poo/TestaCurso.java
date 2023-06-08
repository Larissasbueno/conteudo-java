package poo;

public class TestaCurso {
 public static void main(String[] args) {
     // Instanciando objetos da classe Curso
     Curso curso1 = new Curso("Java Fundamentals", "Plataforma EAD X", 8, "John Doe", 100);
     Curso curso2 = new Curso("Web Development", "Plataforma EAD Y", 12, "Jane Smith", 150);
     
     // Exibindo as informações dos objetos
     curso1.visualizar();
     curso2.visualizar();
 }
}
