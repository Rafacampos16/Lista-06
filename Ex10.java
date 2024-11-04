import java.util.Scanner;
public class Ex10 {
	
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);

        int soma = 0;
        int valor;   
        int totalValores = 10; 

        System.out.println("Digite 10 valores:");

        for (int i = 1; i <= totalValores; i++) {
            System.out.print("Valor " + i + ": ");
            valor = leia.nextInt();
            soma += valor; 
        }

        double media = (double) soma / totalValores;

        System.out.println("A media aritmetica dos valores eh: " + media);

    }
}
//) Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores
//lidos.
