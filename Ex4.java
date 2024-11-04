import java.util.Scanner;
public class Ex4 {
	
	public static void main (String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		int N, i; 
		
		System.out.println("Entre com um valor maior que 0: ");
		N = leia.nextInt();
		
		System.out.println("\nSequencia: \n");
		if (N > 0){
		    for (i = 1; i <= N; i++) {
              
                System.out.println(i);
			
			}
		}else {
			System.out.print("Numero menor que 0!!");
		}
	}
}

/*Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Considere que o N será sempre maior que ZERO.
*/
