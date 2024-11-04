public class Ex24 {
	
	  public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //multiplicador 
            System.out.println("Tabuada do " + i + ":");
            
            for (int j = 0; j <= 10; j++) { // multiplicado
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}

// Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10.
