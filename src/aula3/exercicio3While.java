package aula3;

import java.util.Scanner;

public class exercicio3While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMenores21 = 0;
        int totalMaiores50 = 0;
        
        System.out.println("Digite uma idade: ");
        int idade = scanner.nextInt();
        
        while (idade >= 0) {
            if (idade < 21) {
                totalMenores21++;
            } else if (idade > 50) {
                totalMaiores50++;
            }
            
            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();
        }
        
        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaiores50);
        
        scanner.close();
    }
}
