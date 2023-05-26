package aula3;

import java.util.Scanner;

public class exercicio4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int backendCount = 0;
        int frontendWomenCount = 0;
        int mobileMenOver40Count = 0;
        int fullStackWomenUnder30Count = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite a idade do colaborador: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite o sexo do colaborador (1-Masculino, 2-Feminino, 3-Outros): ");
            int sexo = scanner.nextInt();
            
            System.out.println("Digite a categoria do colaborador (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            int categoria = scanner.nextInt();
            
            if (categoria == 1) {
                backendCount++;
            } else if (categoria == 2 && sexo == 2) {
                frontendWomenCount++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                mobileMenOver40Count++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                fullStackWomenUnder30Count++;
            }
            
            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
            String opcao = scanner.next();
            
            if (opcao.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        
        System.out.println("\nO número de pessoas desenvolvedoras Backend: " + backendCount);
        System.out.println("O número de mulheres desenvolvedoras Frontend: " + frontendWomenCount);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + mobileMenOver40Count);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullStackWomenUnder30Count);
        
        scanner.close();
    }
}
