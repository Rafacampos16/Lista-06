import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double salario, somaSalarios = 0, maiorSalario = 0;
        int numeroFilhos, somaFilhos = 0, habitantes = 0, salarioAbaixo150 = 0;

        // Loop para leitura dos dados
        while (true) {
            System.out.print("Digite o salario do habitante (ou um valor negativo para encerrar): ");
            salario = leia.nextDouble();

            // Condição de parada
            if (salario < 0) {
                break;
            }

            System.out.print("Digite o numero de filhos do habitante: ");
            numeroFilhos = leia.nextInt();

            // Atualizar contadores e somas
            somaSalarios += salario;
            somaFilhos += numeroFilhos;
            habitantes++;

            // Atualizar o maior salário usando Math.max
            maiorSalario = Math.max(maiorSalario, salario);

            // Verificar se o salário é menor que R$ 150,00
            // Se o salário é menor que 150, aumentamos o contador
            salarioAbaixo150 += (salario < 150) ? 1 : 0;
        }

        // Evitar divisão por zero, caso não haja habitantes
        if (habitantes == 0) {
            System.out.println("Nenhum dado foi inserido.");
        } else {
            // Cálculos das médias
            double mediaSalarios = somaSalarios / habitantes;
            double mediaFilhos = (double) somaFilhos / habitantes;

            // Cálculo do percentual de pessoas com salário abaixo de R$ 150,00
            double percentualSalarioAbaixo150 = ((double) salarioAbaixo150 / habitantes) * 100;

            // Exibir resultados
            System.out.println("\nMedia de salario da populacao: R$ " + mediaSalarios);
            System.out.println("\nMedia do numero de filhos: " + mediaFilhos);
            System.out.println("\nMaior salario dos habitantes: R$ " + maiorSalario);
            System.out.println("\nPercentual de pessoas com salario menor que R$ 150,00: " + percentualSalarioAbaixo150 + "%");
        }

    }
}


/* A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00.*/

