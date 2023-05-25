package Lista1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o número B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o número C: ");
        int c = scanner.nextInt();

        int soma = a + b;

        System.out.println(a + " + " + b + " = " + soma);

        if (soma > c) {
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
