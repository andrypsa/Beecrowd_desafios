/*Com base na segundo a imagem "exercicio38_img.png", escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
Entrada: O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
Saída: O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.*/

import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int codigo = teclado.nextInt();
        int quantidade = teclado.nextInt();
        double precoUnitario = 0.0;

        if (codigo < 1 || codigo > 5) {
            System.out.println("Código inválido.");
        } else {
            if (codigo == 1) {
                precoUnitario = 4.00;
            } else if (codigo == 2) {
                precoUnitario = 4.50;
            } else if (codigo == 3) {
                precoUnitario = 5.00;
            } else if (codigo == 4) {
                precoUnitario = 2.00;
            } else if (codigo == 5) {
                precoUnitario = 1.50;
            }

            double total = precoUnitario * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        teclado.close();
    }
}