package Desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a capacidade da cabine?");
        Integer capacidadeCabine = scanner.nextInt();

        System.out.println();

        System.out.println("Qual o tamanho da turma?");
        Integer tamanhoTurma = scanner.nextInt();

        System.out.println();

        Desafio1 desafio = new Desafio1(capacidadeCabine, tamanhoTurma);

        System.out.println(desafio.calcularViagens());

    }

}
