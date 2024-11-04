import java.util.Scanner;
public class EX15 {
	
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
					for (int i = valor2; i <= valor1; i++){
					soma += i;
					} 
						System.out.print("A soma entres os numeros eh: " + soma);
				}
				
			
			}
		}

/*O mesmo exercício anterior, mas agora, considere que o segundo valor lido
poderá
ser maior ou menor
que o primeiro valor lido, ou seja, deve
-
se testá
-
los.*/
