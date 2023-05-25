package Lista2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código do Produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        String nomeProduto;

        switch (codigo) {
            case 1:
                precoUnitario = 10.00;
                nomeProduto = "Cachorro Quente";
                break;
            case 2:
                precoUnitario = 15.00;
                nomeProduto = "X-Salada";
                break;
            case 3:
                precoUnitario = 18.00;
                nomeProduto = "X-Bacon";
                break;
            case 4:
                precoUnitario = 12.00;
                nomeProduto = "Bauru";
                break;
            case 5:
                precoUnitario = 8.00;
                nomeProduto = "Refrigerante";
                break;
            case 6:
                precoUnitario = 13.00;
                nomeProduto = "Suco de laranja";
                break;
            default:
                System.out.println("Código do produto inválido!");
                return;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.println("\nProduto: " + nomeProduto);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
