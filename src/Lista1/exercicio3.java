package Lista1;

import java.util.Scanner;

public class exercicio3 {
   
    	    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Digite o Nome do doador: ");
    	        String nome = scanner.nextLine();

    	        System.out.print("Digite a Idade do doador: ");
    	        int idade = scanner.nextInt();

    	        scanner.nextLine(); // Consumir nova linha pendente

    	        System.out.print("Primeira doação de sangue? ");
    	        boolean primeiraDoacao = scanner.nextBoolean();

    	        if (idade >= 18 && idade <= 69) {
    	            if (idade >= 60 && idade <= 69 && primeiraDoacao) {
    	                System.out.println(nome + " não está apto para doar sangue!");
    	            } else {
    	                System.out.println(nome + " está apto para doar sangue!");
    	            }
    	        } else {
    	            System.out.println(nome + " não está apto para doar sangue!");
    	        }
    	    }
    	}

