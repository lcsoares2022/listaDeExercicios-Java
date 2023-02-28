import java.util.Scanner;

// # Faça um programa, em Java, que receba como entrada dois números inteiros, verifique e exiba se a soma desses números é par ou ímpar.

public class App {
    public static void main(String[] args) throws Exception {
        int a, b, soma;

        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite dois números para que eu verifique se a soma desses números é par ou ímpar\n");
        System.out.println("Digite um número a: ");
        a = input.nextInt();
        System.out.println("Digite um número b: ");
        b = input.nextInt();
        soma = a + b;
        System.out.println("resultado da soma: " + soma);
        if (soma % 2 == 0)
            System.out.println("A soma é par!");
        else 
        System.out.println("A soma é ímpar!");
        
    }
}
                


