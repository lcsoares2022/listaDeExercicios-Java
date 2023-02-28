import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 
Faça um programa, em Java, para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e suas respectivas respostas às questões da prova. Existem dez alunos matriculados. Calcule e mostre:

a)  O número e a nota de cada aluno;
b)  A  porcentagem  de  aprovação,  sabendo-se  que  a  nota  mínima  necessária  para aprovação é cinco.

*/

// # Melhorando o código da question10.1

public class App {
    public static void main(String[] args) throws Exception {
        final int nQuestions = 8;
        final int nMatriculados = 10;
        char[] vetGabarito = new char[nQuestions];
        int aprovados = 0;
        Scanner input = new Scanner(System.in);
        Map<Integer,Integer> notasAlunos = new HashMap<>(); // #
        Set<Integer> matriculasAlunos = new HashSet<>(); // # 
        DecimalFormat decimo = new DecimalFormat("#.##"); // #
        char resposta;
         
        
        // Ler gabarito
        for (int i = 0; i<nQuestions; i++) {
            System.out.println("Digite a resposta da questão " + (i+1) + ":");
            vetGabarito[i] = Character.toUpperCase(input.next().charAt(0)); // #
            String s = Character.toString(vetGabarito[i]);
            while(!s.matches("[A-E]")) { // #
                System.out.println("Resposta inválida. Digita A, B, C, D ou E");
                vetGabarito[i] = Character.toUpperCase(input.next().charAt(0));
                s = Character.toString(vetGabarito[i]);
            }
        }

        // Ler respostas dos alunos
        for (int i = 0; i< nMatriculados; i++) {
            int nMatricula;
            int pontuacao = 0;
            do {
                System.out.println("Digite o número de matrícula do aluno " + (i+1) + ":");
                nMatricula = input.nextInt();
                if(matriculasAlunos.contains(nMatricula)){ // #
                    System.out.println("Matrícula já informada.");
                } 
            } while (matriculasAlunos.contains(nMatricula));
            matriculasAlunos.add(nMatricula); // #
            for(int j = 0; j<nQuestions; j++) {
                System.out.println("Digite a resposta do aluno na questão " + (j+1) + ":" );
                resposta = Character.toUpperCase(input.next().charAt(0));
                String respostaString = Character.toString(resposta);
                while (!respostaString.matches("[A-E]")) {
                    System.out.println("Resposta inválida. Digita A, B, C, D ou E");
                    resposta = Character.toUpperCase(input.next().charAt(0));
                    respostaString = Character.toString(resposta);
                }
                if (resposta == vetGabarito[j]) {
                    pontuacao++;
                }
            }
            notasAlunos.put(nMatricula, pontuacao); // #
            if (pontuacao >= 5) {
                aprovados++;
            }
           
        }
        input.close(); // #
        // Exibir resultados
        for (Map.Entry<Integer, Integer> entrada : notasAlunos.entrySet()) // #
        {
            int matricula = entrada.getKey(); // #
            int nota = entrada.getValue(); // #
            System.out.format("O aluno de matrícula %d possui nota: %d\n",matricula,nota);
        } 
        float percentAprovados = ((float)aprovados/nMatriculados) * 100;
        System.out.println("\nPercentual de aprovados: " + decimo.format(percentAprovados) + "%");
        
    }

}




        
        

//  ? Interface `Map`

// # Explicação da linha 25: criamos uma instância da classe `HashMap` que armazenará as notas dos alunos. Na declaração `Map<Integer, Integer>` indica que o objeto será uma coleção de pares chave-valor. A parte `Map<Integer..` indica que a chava será um valor do tipo inteiro e a parte ..`,Integer` indica que o valor do par é do tipo inteiro. Além disso, `new HashMap<>()` indica que estamos criando um objeto `HashMap` vazio, sem especificar um tamanho inicial para a tabela hash;

// ? Interface `Set`

// # Explicação da linha 26: estamos declarando uma variável `matriculasAlunos` do tipo `Set<Integer>`, que é uma estrutura de dados em Java a qual representa uma coleção de elementos únicos (não há elementos repetidos) de tipo `Integer`. A intenção aqui é armazenar as matrículas dos alunos, garantindo que cada matrícula seja única. O conjunto criado é do tipo `HashSet`que implementa a interface Set usando a tabela hash. Nesse caso, a tabela hash é criada sem especificar seu tamanho inicial;

// ? A classe DecimalFormat

// # Explicação da linha 27: estamos criando um objeto da classe `DecimalFormat` e o inicializa com um padrão de formação para números decimais. O parâmetro passado para o construtor da classe `DecimalFormat`é uma string "#.##" que é um padrão para o número ter no máximo duas casas decimais, e que o separador decimal deve ser representado por um ponto. Após criarmos o objeto, ele pode ser utilizado para formar números decimais usando o método `format()`;

// # Explicação da linha 34: Para converter UM CARACTERE (não um string) em maísculo é necessário utilizar o `toUpperCase()`da classe `Character`;

// ? Sobre vetGabarito[]

// # Ao invés de um vetor do tipo char, poderia ter sido uma variável do tipo String. Pois variáveis do tipo String podem armazenar um valor do tipo caractere. Isso evitaria que eu precisasse converter

// # Explicação da linha 35: Como o método `matches()` usado na linha 36 é um método da classe `String`, eu criei uma variável s e armazenei o caractere convertido em string;

// # Explicação da linha 36: O método matches() em Java retorna um valor booleano indicando se a string corresponde ou não a um determinado padrão definido por uma expressão regular;

// ? Método contains()

// # É um método definido na interface `Set, que retorna `true`se o elemento especificado estiver contido no conjunto, e `false`caso contrário

// ? Método add()

// # O método add() é uma operação de adição de elementos em conjuntos do tipo `Set, e portanto, adiciona um novo elemento ao conjunto somente se ele ainda não existe no conjunto.

// # Explicação da linha 54: Faz a verificação se o valor da variável `nMatricula` está presente no conjunto `matriculasAlunos`. Se não existir, adiciona ao conjunto, se não existir, não adiciona nada; 

// ? Método put()

// # Explicação da linha 68: O método `put` da classe `Map`adiciona uma entrada ao mapa `notasAlunos`, associando o número de matrícula a uma pontuação `pontuacao`. Isso significa que a pontuação do aluno identificado pela matrícula `nmatricula`é armazenado no mapa `notasAlunos`. Se a matrícula já existe no mapa, o valor anterior é substituído pelo novo valor da pontuação. Nesse caso, `nMatricula é a chave e `pontuacao`é o valor;

// ? Explicação do loop cuja condição é `Map.Entry<String, Integer> entrada : mapa.entrySet()`

// # Explicação da linha 76: na condição, primeiramente temos `Map.Entry<Integer,Integer> entry`. O tipo genérico `Map.Entry` é uma interface interna* da classe `Map` que é usado para representar um par chave-valor em um `Map`. O `Map.Entry`contém os métodos necessários para RECUPERAR a chave e o valor de cada par no `Map`. Na parte <Integer, Integer> indica que tanto a chave quanto o valor é do tipo Integer (inteiro). `entry` é o nome que damos a variável usada para representar cada elemento do conjunto de pares chave-valor da coleção `notasAlunos`;

// # Continuação da linha 76: em resumo, antes dos dois pontos temos a uma variável de nome entry do tipo `Map.Entry<Integer,Integer>`que representa um par chave-valor dentro de um mapa em Java;

// # Variável desse tipo em Java é uma variável que pode armazenar UM OBJETO DO TIPO `Entry` que é um tipo genérico em coleções do tipo `Map`. O tipo `Entry` representa UM PAR chave-valor armazenado em umm mapa;

// # Continuação da linha 76: após os dois pontos, em `notasAlunos.entrySet()`, temos um  método da interface `Map` que retorna um conjunto de pares chave-valor contidos no mapa `notasAlunos`;

// # Continuação da linha 76: ao utilizar `entrada` antes dos dois pontos, estamos criando uma variável `entrada` do tipo `Map.Entry<Integer, Integer>`, que irá percorrer cada elemento do conjunto retornado por `mapa.entrySet()`. Durante cada iteração do loop, `entrada`conterá UM ELEMENTO DO CONJUNTO, ou seja, um par chave-valor do mapa.

// ? Input.close()

//  # Esse método fecha o objeto Scanner `input`, que foi criado para receber entrada de dados do usuário por meio do teclado. Fechar o objeto libera recursos do sistema que foram alocados para sua utilização e evita vazamento de memória;

// ? Métodos getKey() e getValue()

// # Esses são métodos da interface `Map.Entry` em Java. No loop que itera sobre um `Map`, para obter a chave e o valor associadaos a essa entrada, usamos `entry.getKey()` e `entry.getValue()`, respectivamente.

// ? O que é tabela Hash

// ! A tabela Hash é implementada como um array de listas ligadas, que é usada para armazenar os pares chave-valor. A chave é usada para calcular o índice do array em que o valor correspondente será armazenado, o que permite uma recuperação rápida dos valores usando a chave. A implementação da tabela hash em Java é otimizada para minimizar o número de colisões entre as chaves, o que aumenta a eficiência da busca de elementos na tabela.

// ? O que é estrutura de dados Map?

// ! É uma coleção de pares chave-valor que permite armazenar e acessar elemetnos por meio de uma chave, em vez de uma posição numérica como em um array.

// ! Para utilizar um Map, é necessário criar uma instância de uma das classes concretas que implementam a interface Map.

// ? Quais são as classes mais comuns da estrutura de dados Map e quais as suas diferenças?

// !


// ? O que é interface `Set`

// ! O Set é uma coleção de objetos que não permite elementos duplicados

// ! A interface `Set` permite armazenar elementos garantindo a sua unicidade. O que significa que não há duas entradas iguais no conjunto. Ao tentar adicionar um elemento que já existe no `Set`, a operação é ignorada.
