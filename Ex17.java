import java.util.Scanner;
public class Ex17 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
         char opcao;

        do {
            double nota1 = -1; //tem que ser um numero fora da condicao para iniciar
            double nota2 = -1;

            // Loop para garantir que a primeira nota esteja entre 0 e 10
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Digite a nota da 1 avaliacao (0 a 10): ");
                nota1 = leia.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota invalida. Digite um valor entre 0 e 10.");
                }
            }

            // Loop para garantir que a segunda nota esteja entre 0 e 10
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Digite a nota da 2 avaliacao (0 a 10): ");
                nota2 = leia.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota invalida. Digite um valor entre 0 e 10.");
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.println("Media do aluno: " + media);


            System.out.print("NOVO CALCULO (S/N)? ");
            opcao = leia.next().toUpperCase().charAt(0); // Pega a primeira letra e converte para maiúscula


        } while (opcao == 'S'); // Repete o cálculo se o usuário digitar 'S'
        
        System.out.println("Programa encerrado.");
        leia.close(); // Fecha o scanner
    }
}

/*Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
*/


