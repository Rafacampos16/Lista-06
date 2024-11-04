public class Ex16 {
    public static void main(String[] args) {
        int soma = 0; 
        int numeros = 0; 
        double media; 
        
        for (int i = 15; i <= 100; i++) {
            soma += i; 
            numeros++; 
        }
        
        media = (double) soma / numeros; // Calcula a média
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}

/*) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15
(inclusive) e 100 (inclusive).*/
