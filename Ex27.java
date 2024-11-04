public class Ex27 {

    public static void main(String[] args) {
        // Laço externo para os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Imprime o número inicial da linha
            System.out.print(i + ", ");
            
            // Laço interno para imprimir a sequência decrescente
            for (int j = 1; j <= 11 - i; j++) {
                System.out.print(j + " ");
            }
            
            // Pula para a próxima linha
            System.out.println();
        }
    }
}
