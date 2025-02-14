/* Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias. Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
Entrada: O arquivo de entrada contém um valor inteiro.
Saída: Imprima a saída conforme exemplo a seguir:
1 ano(s)
1 mes(es)
5 dia(s).*/

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dias = teclado.nextInt();
        int anos = dias / 365;

        dias = dias % 365; 
        int meses = dias / 30;
        dias = dias % 30; 
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        teclado.close();
    }
}
