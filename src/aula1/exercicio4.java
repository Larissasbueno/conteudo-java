package aula1;

import java.util.Scanner;

public class exercicio4 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de entrada
        System.out.print("numero1: ");
        float n1 = scanner.nextFloat();

        System.out.print("numero2: ");
        float n2 = scanner.nextFloat();

        System.out.print("numero3: ");
        float n3 = scanner.nextFloat();

        System.out.print("numero4: ");
        float n4 = scanner.nextFloat();

        // Cálculo da diferença
        float diferenca = (n1 * n2) - (n3 * n4);

        // Exibição do resultado
        System.out.println("\nDiferença: " + diferenca);
    }
}
