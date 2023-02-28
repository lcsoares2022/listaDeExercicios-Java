import java.util.Scanner;

/* Faça um programa, em Java, que leia um número N, que deve indicar quantos valores inteiros e positivos devem ser lidos a seguir. Em seguida, para cada número informado, indique o fatorial desse número.*/

public class App {
    public static void main(String[] args) throws Exception {
        int valor;
        final int N; // # A constante garante que o valor não pode ser alterado após a atribuição inicial
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite quantos valores inteiros e positivos devem ser lidos: ");
        N = input.nextInt();
        
        for (int i = 0; i<N; i++) {
            System.out.print("Digite o número inteiro e positivo: ");
            valor = input.nextInt();
            while (valor<=0)  {
                System.out.println("Desculpe, mas você não digitou valor inteiro e positivo");
                System.out.print("Digite um valor inteiro e positivo: ");
                valor = input.nextInt();
            }
            for (int j=valor-1; j>=1; j--) 
                valor *= j;
            System.out.println("\nO fatorial do número é: " + valor);
        }
    
    }
}
