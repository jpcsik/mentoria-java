package Desafio2;

import java.util.ArrayList;

public class Main {

    private static int factorial(Integer number, Integer maxValue) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            if(factorial > maxValue){
                break;
            }

            factorial = factorial * i;

        }
        return factorial;
    }


    public static void main(String[] args) {

        int number = 15;

        int resposta = 0;

        ArrayList<Integer> lista = new ArrayList();

        for (int i = number; i >= 1; i--) {

            int factorial = factorial(i, number);

            System.out.println(factorial);

            if (factorial == number) {
                resposta++;
                System.out.println(resposta);
                break;
            }

            if (factorial < number) {
                lista.add(factorial);
            }

        }

        System.out.println();
        lista.forEach(System.out::println);
        System.out.println();

        Integer conta = 0;
        for (int i = 0; i < lista.size(); i++) {
            conta = conta + lista.get(i);
            if (conta <= number) {
                resposta++;
            }
            while (conta < number) {
                conta += lista.get(i);
                if (conta <= number) {
                    resposta++;
                    break;
                }
            }
            if (conta > number) {
                conta -= lista.get(i);
            }
        }

        System.out.println("A resposta é: " + resposta);

    }


}


