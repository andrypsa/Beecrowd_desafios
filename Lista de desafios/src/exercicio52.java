/*Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
Entrada: A entrada contém um único valor inteiro.
Saída: Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.*/

import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mes = teclado.nextInt();
        String mesEscolhido = "";

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inexistente.");
        } else {
            if (mes == 1) {
                mesEscolhido = "January";
            } else if (mes == 2) {
                mesEscolhido = "February";
            } else if (mes == 3) {
                mesEscolhido = "March";
            } else if (mes == 4) {
                mesEscolhido = "April";
            } else if (mes == 5) {
                mesEscolhido = "May";
            } else if (mes == 6) {
                mesEscolhido = "June";
            } else if (mes == 7) {
                mesEscolhido = "July";
            } else if (mes == 8) {
                mesEscolhido = "August";
            } else if (mes == 9) {
                mesEscolhido = "September";
            } else if (mes == 10) {
                mesEscolhido = "October";
            } else if (mes == 11) {
                mesEscolhido = "November";
            } else if (mes == 12) {
                mesEscolhido = "December";
            }
            System.out.println(mesEscolhido);
        }
        teclado.close();
    }
}