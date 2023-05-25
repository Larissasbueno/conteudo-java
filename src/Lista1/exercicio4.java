package Lista1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        System.out.print("Digite a terceira palavra: ");
        String palavra3 = scanner.nextLine();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Aguia");
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Pomba");
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Lagarta");
                }
            } else if (palavra2.equalsIgnoreCase("anelideo")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Minhoca");
                }
            }
        }
        
        scanner.close();
    }
}

