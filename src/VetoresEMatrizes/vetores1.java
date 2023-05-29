package VetoresEMatrizes;

import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja encontrar: ");
        int numeroDesejado = scanner.nextInt();

        int posicao = pesquisarNumero(vetor, numeroDesejado);

        if (posicao != -1) {
            System.out.println("O número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número não foi encontrado!");
        }
    }

    public static int pesquisarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
