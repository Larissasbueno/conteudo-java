package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collectionSet2 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Inicializa o Set com 10 valores inteiros
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println("List:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\nDigite o número que você deseja encontrar:");
        int numeroDesejado = scanner.nextInt();

        if (numeros.contains(numeroDesejado)) {
            System.out.println("\nO número " + numeroDesejado + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numeroDesejado + " não foi encontrado!");
        }
    }
}
