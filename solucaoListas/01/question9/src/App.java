import java.util.Arrays;
import java.util.Scanner;

/*Escreva um programa, em Java, que preencha um vetor A com quinze caracteres digitados 
pelo usuário. Em seguida, gere um segundo vetor B, considerando as entradas do vetor A, 
da seguinte forma: o 1o elemento de A será o 15o elemento de B; o 2o elemento de A será o 
14 o de B; e assim por diante, até preencher o 1o de B com o 15o elemento de A. Mostre os 
vetores A e B. Lembre-se que o 1o elemento é aquele que se encontra na posição zero do 
vetor, e assim por diante.*/


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        final int tamVet = 15;
        char [] vetA = new char[tamVet]; // * Construção de um vetor de caracteres;
        char[] vetB = new char[tamVet];
        
        

        for (int i = 0; i<tamVet; i++) {
            System.out.format("Digite o número inteiro do vetor A de índice %d: ",i);
            vetA[i] = input.next().charAt(0); // * O método next da classe Scanner lê um conjunto de caracteres até o espaço em branco ou quebra de linha e retorna uma string contendo a sequência de caracteres, daí o método charAt é chamado para obter o primeiro caracter dessa string que é então armazenado no vetA na posição i;
        }
        int indice = tamVet - 1;
        for (int i = indice; i>=0; i--) {
            vetB[indice - i] = vetA[i];
        }

        System.out.println("O vetor A é: " + Arrays.toString(vetA));
        System.out.println("O vetor B é: " + Arrays.toString(vetB));
        
    }    
}
        
