/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
Entrada: A entrada contem três números inteiros.
Saída: Imprima a saída conforme foi especificado.*/

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        int menor = Math.min(valor1, Math.min(valor2, valor3));
        int maior = Math.max(valor1, Math.max(valor2, valor3));
        int meio = (valor1 + valor2 + valor3) - (menor + maior);

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        teclado.close();
    }
}