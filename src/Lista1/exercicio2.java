package Lista1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String parImpar = (numero % 2 == 0) ? "par" : "ímpar";
        String positivoNegativo = (numero >= 0) ? "positivo" : "negativo";

        System.out.println("O Número " + numero + " é " + parImpar + " e " + positivoNegativo + "!");
    }
}
