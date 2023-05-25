package Lista2;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String nomeColaborador = scanner.nextLine();

        System.out.print("Cargo: ");
        int codigoCargo = scanner.nextInt();

        System.out.print("Salário: R$ ");
        float salario = scanner.nextFloat();

        float percentualReajuste;

        switch (codigoCargo) {
            case 1:
                percentualReajuste = 0.1f;
                break;
            case 2:
                percentualReajuste = 0.07f;
                break;
            case 3:
                percentualReajuste = 0.09f;
                break;
            case 4:
                percentualReajuste = 0.06f;
                break;
            case 5:
                percentualReajuste = 0.05f;
                break;
            case 6:
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("Código do cargo inválido!");
                return;
        }

        float novoSalario = salario + (percentualReajuste * salario);

        String nomeCargo;

        switch (codigoCargo) {
            case 1:
                nomeCargo = "Gerente";
                break;
            case 2:
                nomeCargo = "Vendedor";
                break;
            case 3:
                nomeCargo = "Supervisor";
                break;
            case 4:
                nomeCargo = "Motorista";
                break;
            case 5:
                nomeCargo = "Estoquista";
                break;
            case 6:
                nomeCargo = "Técnico de TI";
                break;
            default:
                nomeCargo = "Cargo desconhecido";
        }

        System.out.println("\nNome do colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + nomeCargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Novo Salário: R$ " + novoSalario);

        scanner.close();
    }
}
