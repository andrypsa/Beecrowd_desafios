/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
Entrada: O arquivo de entrada contém 100 números inteiros, positivos e distintos.
Saída: Apresente o maior valor lido e a posição de entrada.*/

import java.util.Scanner;

public class exercicio80 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int posicao = -1;

        for (int i = 1; i <= 100; i++) {
            int numero = teclado.nextInt();

            if (numero > maiorValor) {
                maiorValor = numero;
                posicao = i;
            }
        }
        teclado.close();
        System.out.println(maiorValor);
        System.out.println(posicao);
    }
}