/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
Entrada: A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
Saída: A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.*/

import java.util.Scanner;

public class exercicio154 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int somaIdades = 0;
        int quantidade = 0;
        double mediaIdade;

        while (true) {
            int idade = teclado.nextInt();
            if (idade < 0) {
                break;
            }
            somaIdades += idade;
            quantidade++;
        }
        teclado.close();
        if (quantidade > 0) {
            mediaIdade = (double) somaIdades / quantidade;
            System.out.printf("%.2f\n", mediaIdade);
        } else {
            System.out.println("0.00");
        }
    }
}