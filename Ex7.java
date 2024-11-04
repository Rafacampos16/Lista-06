import java.util.Scanner;
public class Ex7 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor, i;
		
		System.out.println("Entre com um valor entre 1 e 10: ");
		valor = leia.nextInt();
		
		if (valor >= 1 && valor <= 10){
		for(i = 1; i <= 10; i++){
			System.out.println(valor + "x" + i + " = " + valor * i);
		}
	}else {
		System.out.println("O valor deve estar entre 1 e 10!!");
	}
	}
}

/*Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
a tabuada de 1 a 10 do valor lido.
*/
