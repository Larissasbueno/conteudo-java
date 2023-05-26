package aula3;

import java.util.Scanner;

public class exercicio6DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantidade = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                quantidade++;
            }
        } while (numero != 0);
        
        double media = quantidade > 0 ? (double) soma / quantidade : 0;
        
        System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
        
        scanner.close();
    }
}
