import java.util.Scanner;

/* 

Faça  um  programa,  em  Java,  que  preencha  um  vetor  com seis  elementos  numéricos inteiros e mostre:
a)  todos os números pares digitados;
b)  a soma dos números pares digitados;
c)  todos os números ímpares digitados;
d)  a quantidade de números ímpares digitados.

*/


public class App {
    public static void main(String[] args) throws Exception {
        int somaPares = 0, qtdImpares = 0;
        int[] numeros = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i<numeros.length; i++) {
            System.out.print("\nDigite o valor: ");
            numeros[i] = input.nextInt();
            if(numeros[i] % 2 == 0) {
                somaPares+=numeros[i];
            } else {
                qtdImpares++;
            }
        }
        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.format("\nNúmero par digitado na posição %d do vetor: %d\n",i,numeros[i]);
            } else {
                System.out.format("\nNúmero ímpar digitado na posição %d do vetor: %d\n",i,numeros[i]);
            }
        }

        System.out.println("\nA soma dos números pares digitados é: " + somaPares);
        System.out.println("A quantidade de números ímpares digitados é: " + qtdImpares);

    }
}




