import java.util.Scanner;

/*Faça um programa, em Java, que simule um radar na Av. Cristiano Machado. Esse radar 
deve receber a velocidade de cinco veículos, calcular e exibir a quantidade de veículos 
com velocidade acima de 60 km/h. O radar também deve informar o total arrecadado com 
multas, considerando que o valor de cada multa é de R$ 150,00 e que veículos com 
velocidade superior a 60 km/h serão multados. */

// # Comece pensando na solução. No decorrer da construção da solução, você pensa nas variáveis.

public class App {
    public static void main(String[] args) throws Exception {
        float velocidadeVeic;
        int multas = 0, acimaLimite = 0;

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i<5; i++) {
            System.out.println("Digite a velocidade do veículo: ");
            velocidadeVeic = input.nextFloat();
            if(velocidadeVeic > 60) 
                acimaLimite++;
            
        }
        multas = acimaLimite * 150;

        System.out.println("Quantidade de veículos com velocidade acima do limite (60 km/h): " + acimaLimite);
        System.out.println("Valor total das multas: R$ " + multas + ",00");
        
    }
}

