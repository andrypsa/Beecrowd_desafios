/* Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
Entrada: o arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
Saída: Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo: "MEDIA = 6.3", com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".*/

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, C;
        double MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // X = 2 + 3 + 5 = 10//
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));
        teclado.close();
    }

}