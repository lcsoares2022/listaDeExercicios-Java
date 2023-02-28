import java.util.Scanner;

/*Faça um programa, em Java, que apresente o menu de opções a seguir:Menu de opções:
1.   Média Aritmética
2.   Média Ponderada
3.   Média Aritmética e Ponderada
4.   Sair
Digite a opção desejada:
Na opção 1, receba três números reais, calcule e exiba a média aritmética correspondente. 
Na  opção  2,  receba  três  números  reais  e  seus  respectivos  pesos,  calcule  e  mostre  a 
correspondente média ponderada.
Na opção 3, receba três números reais e seus respectivos pesos, calcule e mostre as 
correspondentes médias aritmética e ponderada.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deve exibir uma 
mensagem de erro.
A exibição do menu de opções deve ser implementada como um método, assim como o 
cálculo de cada uma das opções apresentadas nesse menu.*/

public class App {
    public static void main(String[] args) throws Exception {
        int codigo;
        float a,b,c,mediaAritmetica,mediaPonderada;
        Scanner input = new Scanner(System.in);             
        do {
            mostrarMenu();
            codigo = input.nextInt();
            switch(codigo) {
                case 1:
                System.out.print("\nDigite um valor a: ");
                a = input.nextFloat();
                System.out.print("\nDigite um valor b: ");
                b = input.nextFloat();
                System.out.print("\nDigite um valor c: ");
                c = input.nextFloat();
                mediaAritmetica = calcularMediaAritmetica(a,b,c);
                System.out.println("\nMédia Aritmética: " + mediaAritmetica);
                break;
                case 2:
                System.out.print("\nDigite um valor a: ");
                a = input.nextFloat();
                System.out.print("\nDigite um valor b: ");
                b = input.nextFloat();
                System.out.print("\nDigite um valor c: ");
                c = input.nextFloat();
                mediaPonderada = calcularMediaPonderada(a,b,c);
                System.out.println("\nMédia ponderada: " + mediaPonderada);
                break;
                case 3:
                System.out.print("\nDigite um valor a: ");
                a = input.nextFloat();
                System.out.print("\nDigite um valor b: ");
                b = input.nextFloat();
                System.out.print("\nDigite um valor c: ");
                c = input.nextFloat();
                mediaAritmetica = calcularMediaAritmetica(a,b,c);
                mediaPonderada = calcularMediaPonderada(a,b,c);
                System.out.format("\nMédia Aritmética: %.2f\nMédia ponderada: %.2f",mediaAritmetica,mediaPonderada);
                break;
                case 4:
                System.out.println("\nEncerrando o programa\n\n");
                break;
                default:
                System.out.println("Opção inválida. Tente novamente");
            }
        } while(codigo!=4);
            
    }
    
    // Criando os métodos
    
    public static void mostrarMenu(){
        
        System.out.println("Menu\n1. Média Aritmética\n2. Média Ponderada\n3. Média Aritmética e Ponderada\n4. Sair\nDigite a opção desejada: ");
    }

   
    public static float calcularMediaAritmetica(float a, float b,float c) {
        return (a+b+c)/3;
    }

    public static float calcularMediaPonderada(float a,float b,float c) {
        int pesoA,pesoB,pesoC;
        Scanner peso = new Scanner(System.in);
        System.out.print("\nDigite o peso de a: ");
        pesoA = peso.nextInt();
        System.out.print("\nDigite o peso de b: ");
        pesoB = peso.nextInt();    
        System.out.print("\nDigite o peso de C: ");
        pesoC = peso.nextInt();
        
        return (a*pesoA + b*pesoB + c*pesoC)/3;
    }

        
}
        
    
       
        
