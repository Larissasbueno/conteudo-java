package VetoresEMatrizes;

import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos nos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Elementos pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);

        double media = (double) soma / vetor.length;
        System.out.println("Média: " + media);
    }
}
