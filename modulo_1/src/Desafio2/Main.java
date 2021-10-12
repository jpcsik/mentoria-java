package Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int factorial(Integer number, Integer maxNumber) {

//        if(number == 1){
//            return 1;
//        }else{
//            int aux = number * factorial(number - 1, number);
//            return aux;
//        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            if (factorial > maxNumber) {
                break;
            }

            factorial = factorial * i;

        }
        return factorial;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");

        int numero = scanner.nextInt();

        int resposta = 0;

        ArrayList<Integer> lista = new ArrayList();

        for (int i = numero; i >= 1; i--) {

            int factorial = factorial(i, numero);

//            System.out.println(factorial);

            if (factorial == numero) {
                resposta++;
//                System.out.println(resposta);
                break;
            }

            if (factorial < numero) {
                if (!lista.contains(factorial)) {
                    lista.add(factorial);
                }
            }

        }

//        System.out.println();
//        lista.forEach(System.out::println);
//        System.out.println();

        Integer conta = 0;
        for (int i = 0; i < lista.size(); i++) {
            conta += lista.get(i);
            if (conta <= numero) {
                resposta++;
            }
            while (conta < numero) {
                conta += lista.get(i);
                if (conta <= numero) {
                    resposta++;
                    break;
                }
            }
            if (conta > numero) {
                conta -= lista.get(i);
            }
        }

        System.out.println("A resposta é: " + resposta);

    }

}


