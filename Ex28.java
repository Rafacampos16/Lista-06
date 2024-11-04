public class Ex28 {
	
	public static void main (String[] args) {
	        // Laço externo para os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Imprime o número inicial da linha
            System.out.print(i + ", ");
            
            // Laço interno para imprimir a sequência decrescente
            for (int j = i + 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            
            // Pula para a próxima linha
            System.out.println();
        }
    }
}

/*) Escreva um programa em Java que imprima sequência 4:
1, 2 3 4 5 6 7 8 9 10
2, 3 4 5 6 7 8 9 10
3, 4 5 6 7 8 9 10
4, 5 6 7 8 9 10
5, 6 7 8 9 10
6, 7 8 9 10
7, 8 9 10
8, 9 10
9, 10
10,*/
