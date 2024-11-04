import java.util.Scanner;
public class Ex21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double qnt;
		double maior = Double.MIN_VALUE; 
        double menor = Double.MAX_VALUE;
        
		System.out.print("Entre com a quantidade de mumeros: ");
		qnt = leia.nextDouble();
		
		
        
		double valorTotal = 0;
        
        for (int i = 1; i <= qnt; i++) {
            System.out.print("Digite os numeros" + i + ": ");
            double valorNum = leia.nextDouble();
            valorTotal += valorNum; // Soma o valor da mercadoria ao valor total
            
			maior = Math.max(maior, valorNum);
            menor = Math.min(menor, valorNum);
        }
		
            
        // Calcular a média
        double mediaValor = valorTotal / qnt;

        // Imprimir resultados
        System.out.println("\nA media dos numeros foram: " + mediaValor);
		System.out.println("\nO maior numero e: " + maior);
        System.out.println("\nO menor numero e: " + menor);

	}
}


/*) Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números.
Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média
dos números lidos*/
