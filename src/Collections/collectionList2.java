package Collections;


import java.util.ArrayList;
import java.util.Scanner;

public class collectionList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Inicializa o ArrayList com 10 valores inteiros
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println("List:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\nDigite o número que você deseja encontrar:");
        int numeroDesejado = scanner.nextInt();

        int posicao = numeros.indexOf(numeroDesejado);
        if (posicao != -1) {
            System.out.println("\nO número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + numeroDesejado + " não foi encontrado!");
        }
    }
}
