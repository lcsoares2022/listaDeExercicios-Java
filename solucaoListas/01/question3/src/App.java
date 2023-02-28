import java.util.Scanner;

/*
Faça um programa, em Java, que receba como entrada três notas de um aluno (digite valores entre 0 e 10), calcule e mostre a média aritmética e a mensagem constante na tabela a seguir:

    Média Aritmética            Mensagem
de 0,0 a abaixo de 4,0         Reprovado
de 4,0 a abaixo de 6,0         Exame Especial
de 6,0 a 10,0                  Aprovado
*/

public class App {
    public static void main(String[] args) throws Exception {
        float nota;
        float soma = 0;
        int contador = 0;
        float media;
        final int numNotas = 3; // ! Declarar uma constante: final Double PI = 3.14159;
        Scanner input = new Scanner(System.in); // # criação de nova instância da classe Scanner (novo objeto)
        
        for (int i = 0; i<numNotas; i++) {
            System.out.println("Digite a nota: ");
            nota = input.nextFloat();
            soma += nota;
            contador++;
        }
        media = soma/contador;
        System.out.println("A média é: " + media);
        
        if (media < 0 || media > 10)
            System.out.println("Nota inválida");
        else if (media < 4.0)
            System.out.println("Você está Reprovado!");
        else if (media < 6.0)
            System.out.println("Você está em Exame Especial!");
        else
            System.out.println("Você está Aprovado!");
        
    }
}
        
