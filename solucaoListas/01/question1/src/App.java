import java.util.Scanner;

// # Uma empresa pretende ajustar os salários de seus funcionários conforme a tabela a seguir: até R$ 1200,00 o percentual de aumento é 10% e acima de R$ 1200,00 o percentual de aumento é 5%. Faça um programa em Java que receba o salário atual do funcionário; calcule e mostre o aumento que esse funcionário receberá e seu novo salário

public class App {
    public static void main(String[] args) throws Exception {
        float salarioNovo;
        float percentualAumento;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        float salario = input.nextFloat();

        if (salario <= 1200) {
            percentualAumento = 0.1f;
        } else {
            percentualAumento = 0.05f;
        }

        salarioNovo = salario + (percentualAumento * salario);
        System.out.println("O aumento de seu salário será de " + percentualAumento * 100 + "%");
        System.out.println("O novo salário será R$" + salarioNovo);

        // * Em java, números decimais sem uma letra no final são considerados como do tipo double. Já os números decimais com a letra `f´no final são considerados como do tipo float


    }
}

