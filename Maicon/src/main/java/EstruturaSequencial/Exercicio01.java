package EstruturaSequencial;
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int primeiro = sc.nextInt();
        int segundo = sc.nextInt();

        int soma =  primeiro + segundo;

        System.out.println("RESULTATO=" + soma);

    }
}
