package aula1;

import java.util.Scanner;

public class exercicio2 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();
        
        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();
        
        System.out.print("Nota 3: ");
        float nota3 = scanner.nextFloat();
        
        System.out.print("Nota 4: ");
        float nota4 = scanner.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("\nMédia final: " + media);
    }
}
