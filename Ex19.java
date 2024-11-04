import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double valorTotal = 0;
        int contador = 0; // Para contar o número de mercadorias

        // Loop para leitura dos valores das mercadorias
        char opcao;
        do {
            System.out.print("Digite o valor da mercadoria: ");
            double valorMercadoria = leia.nextDouble();
            valorTotal += valorMercadoria; // Soma o valor da mercadoria ao total
            contador++; // Incrementa o contador

            // Pergunta se deseja adicionar mais mercadorias
            System.out.print("MAIS MERCADORIAS (S/N)? ");
            opcao = leia.next().toUpperCase().charAt(0); // Pega a primeira letra em maiúscula

        } while (opcao == 'S');

        // Calcular a média, se houver mercadorias
        double mediaValor = (contador > 0) ? valorTotal / contador : 0; //se o contador for zero (ou seja, nenhuma mercadoria foi registrada), a média é definida como zero.

        // Imprimir resultados
        System.out.println("Valor total em estoque: R$ " + valorTotal);
        System.out.println("Média de valor das mercadorias: R$ " + mediaValor);


    }
}


/*O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS
MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em
estoque.*/
