package Lista2;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Operação: ");
        int codigoOperacao = scanner.nextInt();

        float resultado;

        switch (codigoOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                } else {
                    System.out.println("Operação Inválida! Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        scanner.close();
    }
}
