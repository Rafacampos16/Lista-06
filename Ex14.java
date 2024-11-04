import java.util.Scanner;
public class Ex14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2;
		int soma = 0;
		
		System.out.print("Entre com o primeiro valor: ");
		valor1 = leia.nextInt();
		System.out.print("Entre com o primeiro valor: ");
		valor2 = leia.nextInt();
		
		if (valor1 < valor2){
			for (int i = valor1; i <= valor2; i++){
				soma += i;
				} 
					System.out.print("A soma entres os numeros eh: " + soma);
			}else {
				System.out.print("O valor 1 deve ser menor que o valor 2!!");
			}
			
		
		}
	}

/*) Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes
entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será
sempre maior que o primeiro valor lido.*/
