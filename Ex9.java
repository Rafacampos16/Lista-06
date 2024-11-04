import java.util.Scanner; 
public class Ex9 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int intervalo = 0; 
        int fora = 0; 
		
        System.out.println("Digite 10 valores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = leia.nextInt();
            if (valor >= 10 && valor <= 20) {
				 intervalo++;
            }else {
				fora++;
			}
        }

        System.out.println("Numero dentro do intervalo: " + intervalo);
        System.out.println("Numero fora do intervalo: " + fora);
       
	}
}

/*Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no
intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.*/
