package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collectionSet1{
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        // Solicita ao usuário que digite 10 valores inteiros não repetidos
        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();
            numeros.add(valor);
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

