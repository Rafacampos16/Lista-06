import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contadorNegativos = 0;

        System.out.println("Digite 10 valores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = leia.nextInt();
            if (valor < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("Numero de valores negativos digitados: " + contadorNegativos);
       
   }
}

// Teste
// Caso de teste: Entrada com os valores -1, -2, -3, 1, 2, 3, 4, 5, 6, -4
// Saída esperada: "Número de valores negativos digitados: 4"
