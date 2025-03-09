package EstruturaCondicional;
//Fazer um programa para ler um valor inteiro de 1 a 7 representando um
//dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
//Escrever na tela o dia da semana correspondente, conforme exemplos.
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        if ( dia == 1 ) {
            System.out.println("Segunda");
        }else if ( dia == 2 ){
            System.out.println("Terça");
        }else if ( dia == 3 ){
        System.out.println("Quarta");
        }else if ( dia == 4 ){
            System.out.println("Quinta");
        } else if ( dia == 5 ){
            System.out.println("Sexta");        }
    }
}
