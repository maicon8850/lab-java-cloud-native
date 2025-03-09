package EstruturaCondicional;
// if, else if, else
//Imagine que um sistema verifica a idade de uma pessoa para definir sua categoria em um evento:
//Menores de 12 anos → "Criança"
//De 12 a 17 anos → "Adolescente"
//De 18 a 59 anos → "Adulto"
//60 anos ou mais → "Idoso"


import java.util.Scanner; // Importa a classe Scanner

public class Exercicio00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        int idade = scanner.nextInt(); // Lê a idade digitada pelo usuário


        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else { // Se não for nenhuma das anteriores
            System.out.println("Idoso");
        }
        System.out.println("Idade:" + idade);
        scanner.close(); // Fecha o Scanner
    }
}

