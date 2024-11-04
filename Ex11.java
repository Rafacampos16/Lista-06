import java.util.Scanner;
public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int alunos, notas;
		int soma = 0;
		
		System.out.println("Entre com numero de alunos: ");
		alunos = leia.nextInt();
		
		 for (int i = 1; i <= alunos; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            notas = leia.nextInt();
            soma += notas; 
        }
        
        double media = (double) soma / alunos;
        
        System.out.print("A media dos alunos eh: " + media);

	}
}

/*) Escreva um programa em Java para ler o número de alunos existentes em uma turma e, após isto, ler as
notas destes alunos, calcular e escrever a média aritmética dessas notas lidas.
*/
