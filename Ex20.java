import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o 1 nmero: ");
        int numero = leia.nextInt();
        
        int maior = numero; // Inicializa maior com o primeiro número
        int menor = numero; // Inicializa menor com o primeiro número

        for (int i = 1; i < 100; i++) { // Começa de 1, pois já leu o primeiro
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numero = leia.nextInt();

            // Atualiza maior e menor
            maior = Math.max(maior, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);

    }
}

// Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.
