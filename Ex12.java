import java.util.Scanner;
public class Ex12 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
     
		int soma = 0;
		
        System.out.println("Digite 10 valores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = leia.nextInt();
            soma += valor;
    }   
    
     System.out.println("Soma dos numeros digitados: " + soma);
   }
}

//Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10
//números lidos.
