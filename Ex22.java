import java.util.Scanner;
public class Ex22 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);

		int produtos, preco;
        int soma = 0;  
        int totalValores = 5; 
		
		int maior = 0;
        
        for (int i = 1; i <= totalValores; i++) {
			System.out.print("Entre com o codigo do produto :");
	        produtos = leia.nextInt();
            System.out.print("Entre com o preco do produto " + i +  " :");
            preco = leia.nextInt();
            soma += preco; 
            
            maior = Math.max(maior, preco);
        }
		
		 
        double media = (double) soma / totalValores;
		
		System.out.println("O maior numero e: " + maior);
        System.out.println("\nA media aritmetica dos produtos eh: " + media);

    }
}
/*Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
- o maior preço lido;
- a média aritmética dos preços dos produtos.*/
