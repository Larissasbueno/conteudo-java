package aula1;

import java.util.Scanner;

public class exercicio3 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de entrada
        System.out.print("Salário Bruto: ");
        float salarioBruto = scanner.nextFloat();

        System.out.print("Adicional Noturno: ");
        float adicionalNoturno = scanner.nextFloat();

        System.out.print("Horas Extras: ");
        float horasExtras = scanner.nextFloat();

        System.out.print("Descontos: ");
        float descontos = scanner.nextFloat();

        // Cálculo do salário líquido
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        // Exibição do resultado
        System.out.println("\nSalário Líquido: " + salarioLiquido);
    }
}
