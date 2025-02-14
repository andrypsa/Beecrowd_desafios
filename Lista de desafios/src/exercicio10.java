/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
Entrada: O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
Saída: A saída deverá ser uma mensagem conforme o exemplo: "VALOR A PAGAR: R$ 15.50", lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.*/

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // String codPeca1 = teclado.next();
        int quantPecas1 = teclado.nextInt();
        double valorPeca1 = teclado.nextDouble();
        teclado.nextLine();
        // String codPeca2 = teclado.next();
        int quantPecas2 = teclado.nextInt();
        double valorPeca2 = teclado.nextDouble();

        double totalVlPeca1 = quantPecas1 * valorPeca1;
        double totalVlPeca2 = quantPecas2 * valorPeca2;

        double totalPagar = totalVlPeca1 + totalVlPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);
        teclado.close();
    }
}
