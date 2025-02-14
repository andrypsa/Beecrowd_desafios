/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
Salário	
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

Percentual de Reajuste
15%
12%
10%
7%
4%
Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.
Entrada: A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.Exemplo de Entrada: 400.00
Saída: Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
Exemplo de Saída:
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %  
*/

import java.util.Scanner;

public class exercicio48{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double percentual;

        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        double reajuste = salario * (percentual / 100);
        double novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", percentual);
        teclado.close();
    }
}