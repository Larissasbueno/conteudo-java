package VetoresEMatrizes;

import java.util.Scanner;

public class matrizes1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o número da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elementos da Diagonal Secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
