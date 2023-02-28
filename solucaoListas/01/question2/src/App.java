import java.util.Scanner;

// # Faça um programa, em Java, que exiba o menu de opções a seguir:

/*
Menu de Opções:
1. Soma de dois números
2. Raiz quadrada de um número 

Digite a opção desejada:

Receba a opção do usuário e os dados necessários para executar cada operação; execute a operação escolhida e exiba o resultado para o usuário.

*/


public class App {
    public static void main(String[] args) throws Exception {
        Double soma;
        Double raizQuadrada;
        Scanner input = new Scanner(System.in);
        // * Declaração da variável de nome input da classe Scanner. Inicializa essa variável com um novo (new) objeto Scanner que vai ser usado para obter entrada do usuário a partir da entrada padrão do sistema (System.in);

        // * O uso do System.in permite que o programa receba a entrada do usuário a partir do teclado

        
        System.out.println("Digite a opção desejada:\n1. Soma de dois números\n2. Raíz quadrada de um número");
        
        int codigo = input.nextInt();

        // * System.out.println não aproveita a linha de impressão. Ele imprimi o texto e o cursor é movido para a próxima linha.

        switch (codigo) {
            case 1:
            System.out.println("Digite o valor do número a: ");
            Double a = input.nextDouble(); // ! Declara e inicializa uma variável de nome `a´ do tipo `Double´ com o VALOR lido a partir do objeto `Scanner´ chamado `input´que foi criado;
            // ! O objeto nextDouble do objeto `Scanner´ lê um valor de ponto flutuante da entrada do usuário e retorna esse valor comom um double. Em seguida, o valor lido é armazenado na variável `a´.
            System.out.println("Digie o valor do número b: ");
            Double b = input.nextDouble();
            soma = a + b;
            System.out.println("O resultado é: " + soma);
            break;
            
            case 2:
            System.out.println("Digite um número: ");
            Double numero = input.nextDouble();
            raizQuadrada = Math.sqrt(numero);
            System.out.println("O resultado é: " + raizQuadrada);
            break;
        }


    }
}
