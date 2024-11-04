public class Ex29 {
	
	public static void main (String[] args) {
	       // Laço externo para os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Imprime o número inicial da linha
            System.out.print(i + ", ");
            
            // Laço para alternar entre sequência de ímpares e pares
            if (i % 2 != 0) { // Se i é ímpar
                for (int j = 1; j <= 9; j += 2) {
                    System.out.print(j + " ");
                }
            } else { // Se i é par
                for (int j = 2; j <= 10; j += 2) {
                    System.out.print(j + " ");
                }
            }
            
            // Pula para a próxima linha
            System.out.println();
        }
    }
}

/*29) Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10
*/
