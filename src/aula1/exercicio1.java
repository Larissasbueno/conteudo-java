package aula1;

import java.util.Scanner;

public class exercicio1 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Salário: ");
        float salario = scanner.nextFloat();

        System.out.print("Abono: ");
        float abono = scanner.nextFloat();

        // Cálculo do novo salário
        float novoSalario = salario + abono;

        // Saída do resultado
        System.out.println("\nNovo Salário: " + novoSalario);
    }
}
