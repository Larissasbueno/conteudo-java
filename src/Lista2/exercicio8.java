package Lista2;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        float saldo = 1000.00f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Operação: ");
        int codigoOperacao = scanner.nextInt();
        
        switch (codigoOperacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.println("Saldo: R$ " + saldo);
                break;
            case 2:
                System.out.print("Valor: R$ ");
                float saque = scanner.nextFloat();
                
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.println("Operação - Saque");
                    System.out.println("Novo Saldo: R$ " + saldo);
                } else {
                    System.out.println("Operação - Saque");
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 3:
                System.out.print("Valor: R$ ");
                float deposito = scanner.nextFloat();
                
                saldo += deposito;
                System.out.println("Operação - Depósito");
                System.out.println("Novo Saldo: R$ " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
        
        scanner.close();
    }
}
