package EstruturaRepetitiva;
//Descrição do Problema:
//Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números ímpares entre eles.
//
//Entrada:
//O arquivo de entrada contém dois valores inteiros.
//
//Saída:
//O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada, garantindo que o resultado caiba dentro de um inteiro.

import java.util.Scanner;

public class Exercicio00 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max, min;


        if (x < y ){
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        int soma = 0;
        for (int i = min+1; i < max; i++){

            if( i % 2 != 0){
             soma = soma + i;
            }

        }
        System.out.println(soma);
    }
}
