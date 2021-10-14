package Desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor de uma das provas?");
        int nota1 = scanner.nextInt();
        System.out.println();

        System.out.println("Qual valor da media?");
        int media = scanner.nextInt();
        System.out.println();

        int nota2;

        nota2 = (media * 2) - nota1;

        System.out.println("Valor da outra prova é: " + nota2);

    }

}
