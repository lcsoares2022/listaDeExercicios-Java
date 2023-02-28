import java.util.Scanner;

/*Faça um programa, em Java, para corrigir provas de múltipla escolha. Cada prova tem oito 
questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o 
gabarito da prova. Os outros dados são os números dos alunos e suas respectivas respostas 
às questões da prova. Existem dez alunos matriculados. Calcule e mostre:
a)  o número e a nota de cada aluno;
b)  a  porcentagem  de  aprovação,  sabendo-se  que  a  nota  mínima  necessária  para 
aprovação é cinco.*/

public class App {
    public static void main(String[] args) throws Exception {
        final int nQuestions = 8;
        final int alunosMatriculados = 10;
        int pontoQuestion = 0;
        int aprovados = 0;
        char[] vetGabarito = new char[nQuestions];
        int nMatricula;
        char respostaAluno;
        Scanner input = new Scanner(System.in);

        for(int i=0; i<nQuestions; i++) {
            System.out.println("Digite a resposta da questão " + (i+1) + ":" ); // * A precedência do operador de soma `+` é mnor do que a precedência do operdor de concatenação de string `+` em Java. Por isso, é necessário colocar entre parêntese
            vetGabarito[i] = input.next().charAt(0);
        }
        for (int i = 0; i<alunosMatriculados; i++) {
            System.out.print("Digite o número de matrícula do aluno " + (i+1) + ":" );
            nMatricula = input.nextInt();
            for(int j=0; j<nQuestions; j++) {
                System.out.println("Digite a resposta do aluno na questão " + (j+1) + ":" );
                respostaAluno = input.next().charAt(0);
                if (respostaAluno == vetGabarito[j]) {
                    pontoQuestion++;
                }
            }
            System.out.format("\nO aluno de mátricula %d possui nota: %d\n",nMatricula,pontoQuestion);
            if (pontoQuestion <= 5) {
                aprovados++;
            }
            pontoQuestion = 0;
        }
        System.out.println("\nPercentil de aprovados: " + ((aprovados/10) * 100) + "%");

    }
}
           
        


