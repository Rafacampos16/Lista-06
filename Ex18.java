import java.util.Scanner;
public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double estoque;
		
		System.out.print("Entre com o numero de mercadoria no estoque: ");
		estoque = leia.nextDouble();
		
		double valorTotal = 0;
        
        // Loop para ler o valor de cada mercadoria
        for (int i = 1; i <= estoque; i++) {
            System.out.print("Digite o valor da mercadoria " + i + ": ");
            double valorMercadoria = leia.nextDouble();
            valorTotal += valorMercadoria; // Soma o valor da mercadoria ao valor total
        }

        // Calcular a média
        double mediaValor = valorTotal / estoque;

        // Imprimir resultados
        System.out.println("Valor total em estoque: R$ " + valorTotal);
        System.out.println("Media de valor das mercadorias: R$ " + mediaValor);

	}
}


/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
*/
