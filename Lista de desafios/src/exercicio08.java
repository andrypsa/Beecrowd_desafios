/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
Entrada: O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
Saída: Imprima o número e o salário do funcionário, conforme exemplo: "NUMBER = 25 -
SALARY = U$ 550.00" , com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $. */

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        int numeroFuncionario = teclado.nextInt();
        int horasTrabalhadas = teclado.nextInt();
        double valorPorHora = teclado.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        teclado.close();
    }
}
