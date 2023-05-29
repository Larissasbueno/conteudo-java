package VetoresEMatrizes;

import java.util.Scanner;

	public class matrizes2 {
	    public static void main(String[] args) {
	        double[][] notas = new double[10][4];
	        double[] medias = new double[10];
	        Scanner scanner = new Scanner(System.in);

	       
	        for (int i = 0; i < notas.length; i++) {
	            System.out.println("Digite as notas do participante " + (i + 1) + ":");
	            for (int j = 0; j < notas[i].length; j++) {
	                System.out.println("Nota do bimestre " + (j + 1) + ": ");
	                notas[i][j] = scanner.nextDouble();
	                medias[i] += notas[i][j];
	            }
	            medias[i] /= notas[i].length;
	        }

	        System.out.println("Médias dos participantes:");
	        for (int i = 0; i < medias.length; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }
	    }
	}
