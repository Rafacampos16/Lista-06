import java.util.Scanner;
public class Ex13 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
     
		int soma = 0;
		
        System.out.println("Digite 10 valores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = leia.nextInt();
            
            if (valor < 40){
            soma += valor;
		}
    }   
    
     System.out.println("Soma dos numeros digitados acima de 40: " + soma);
   }
}

/*Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
devem ser somados. Escreva o valor final da soma efetuada.*/
