import java.util.Scanner;

public class Resultado {
    public static void main (String[] args) {
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
