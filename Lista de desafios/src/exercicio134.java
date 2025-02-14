/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.
Entrada: A entrada contém apenas valores inteiros e positivos.
Saída: Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
Exemplo de Saída
MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0
*/

import java.util.Scanner;

public class exercicio134 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int codigo = teclado.nextInt();

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break;
            } else {
                continue;
            }
        }
        teclado.close();
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}