import java.util.Scanner;
public class Ex5 {
	
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
			System.out.print("Numero menor que 0!! Insira um novo valor.");
		}
	}
}


/*Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N*/
